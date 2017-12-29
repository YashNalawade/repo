package com.example.yash.demomaps;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    public static String cityname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        cityname = bundle.getString("city");


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new com.example.yash.demomaps.WeatherFragment())
                    .commit();
        }
        new com.example.yash.demomaps.CityPreference(this).setCity(cityname);
    }
}
