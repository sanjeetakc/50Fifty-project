package com.example.a50fifty.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a50fifty.R;

//import com.example.user_location_mapbox.R;

//import com.example.userinterface.R;

public class User_registration_detail extends AppCompatActivity {
 private Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_registration_detail);
        mbutton = findViewById(R.id.register);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrationsuccessfull();
            }
        });
    }
        public void registrationsuccessfull(){
            Intent intent = new Intent(User_registration_detail.this,Welcome_message.class);
            startActivity(intent);
        }




}
