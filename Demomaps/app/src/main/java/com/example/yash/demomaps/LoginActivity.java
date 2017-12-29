package com.example.yash.demomaps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText et1;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1 = (EditText) findViewById(R.id.et1);
        bt2 = (Button) findViewById(R.id.bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String name=et1.getText().toString();
                Intent intent = new Intent(LoginActivity.this,MapsActivity.class);
                Toast.makeText(getApplicationContext(),"Hello "+name,Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }

        });
    }

}
