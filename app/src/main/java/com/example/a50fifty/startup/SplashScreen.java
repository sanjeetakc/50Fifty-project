package com.example.a50fifty.startup;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a50fifty.LoginActivity;
import com.example.a50fifty.R;

//import com.example.user_location_mapbox.LoginActivity;
//import com.example.user_location_mapbox.R;

//import com.example.userinterface.MainActivity;
//import com.example.userinterface.R;

public class SplashScreen extends AppCompatActivity {
    private ImageView logo, car;
    private static int splashTimeOut=1350;//1267 for logo animation;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        car=findViewById(R.id.bike);//bike
        logo=findViewById(R.id.cab);//for cab
        //logo=findViewById(R.id.logo);//for logo animation

        Animation animate_bike= AnimationUtils.loadAnimation(this,R.anim.bike);// animation for bike
        Animation animate= AnimationUtils.loadAnimation(this,R.anim.anim);

        logo.startAnimation(animate);
        car.startAnimation(animate_bike);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                finish();
            }
        },splashTimeOut);
    }
//    Handler handler;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splashscreen);
//        Thread mythread = new Thread(){
//            public void run(){
//                try {
//                    sleep(3000);
//                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        };
//        mythread.start();
//    }

}

