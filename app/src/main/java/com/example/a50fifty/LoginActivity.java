package com.example.a50fifty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a50fifty.registration.Registration;

//import com.example.user_location_mapbox.registration.Registration;

//import com.example.userinterface.registration.Registration;

//import static maes.tech.intentanim.CustomIntent.customType;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void uptobottom(View view)
    {
        startActivity(new Intent(LoginActivity.this, Registration.class));
        //customType(LoginActivity.this,"up-to-bottom");
    }


}
