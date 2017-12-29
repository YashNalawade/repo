package com.example.yash.demomaps;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

import static com.example.yash.demomaps.MainActivity.cityname;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static TextView tv1;
    private EditText TFaddress;
    public static String temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        TFaddress = (EditText) findViewById(R.id.TFaddress);
        tv1 = (TextView) findViewById(R.id.tv1);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }




    public void onSearch(View view)
    {

        if(TFaddress.getText().toString().length()>1) {
            mMap.clear();
            EditText location_tf = (EditText) findViewById(R.id.TFaddress);
            String location = location_tf.getText().toString();
            List<Address> addressList = null;
            if (location != null || !location.equals("")) {
                Geocoder geocoder = new Geocoder(this);
                try {
                    addressList = geocoder.getFromLocationName(location, 1);


                } catch (IOException e) {
                    e.printStackTrace();
                }

                Address address = addressList.get(0);
                LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
                mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 11));
                new com.example.yash.demomaps.CityPreference(this).setCity(TFaddress.getText().toString());
                cityname=TFaddress.getText().toString();
                //tv1.setText("   "+Character.toUpperCase(TFaddress.getText().toString().charAt(0)) + TFaddress.getText().toString().substring(1)+"  ");
                Intent intent = new Intent(MapsActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("city", cityname);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        }
        else
            return;
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

    }
}
