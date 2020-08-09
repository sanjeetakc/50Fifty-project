package com.example.a50fifty.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a50fifty.R;

//import com.example.user_location_mapbox.R;

//import com.example.userinterface.R;

public class Registration extends AppCompatActivity {
    private Button mbutton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        mbutton = findViewById(R.id.customer_registration);
     mbutton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             moveNext();
         }
     });
    }
    private void moveNext(){
        Intent intent = new Intent(Registration.this,User_registration_detail.class);
        startActivity(intent);
    }
    public void righttoleft(View view) {
        startActivity(new Intent(Registration.this,User_registration_detail.class));

    }

}
