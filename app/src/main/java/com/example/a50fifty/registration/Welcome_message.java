package com.example.a50fifty.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a50fifty.MainActivity;
import com.example.a50fifty.R;

//import com.example.user_location_mapbox.MainActivity;
//import com.example.user_location_mapbox.R;

//import com.example.userinterface.R;

public class Welcome_message extends AppCompatActivity {
    public Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_message);
        mbutton = findViewById(R.id.countinue_button);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });
    }
    private void moveNext(){
        Intent intent = new Intent(Welcome_message.this, MainActivity.class);
        startActivity(intent);
    }
//    public void rotateouttorotatein(View view) {
//        startActivity(new Intent(Welcome_message.this,MainActivity.class));
//        customType(Welcome_message.this,"rotateout-to-rotatein");
//    }
//
//    private void customType(Welcome_message welcome_message, String s) {
//    }


}


