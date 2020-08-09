package com.example.a50fifty;

import android.content.Intent;
import android.os.Bundle;

import com.example.a50fifty.ui.help.HelpFragment;
import com.example.a50fifty.ui.notification.NotificationFragment;
import com.example.a50fifty.ui.ride.RideFragment;
import com.example.a50fifty.ui.ridehistory.RideHistoryFragment;
import com.example.a50fifty.ui.setting.SettingFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

//    private AppBarConfiguration mAppBarConfiguration;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//       // Toolbar toolbar = findViewById(R.id.toolbar);
//         //setSupportActionBar(toolbar);
//        //FloatingActionButton fab = findViewById(R.id.fab);
//        //fab.setOnClickListener(new View.OnClickListener() {
//           // @Override
//          //  public void onClick(View view) {
//          //      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    //    .setAction("Action", null).show();
//            //}
//        //});
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_get_a_ride, R.id.nav_notification, R.id.nav_history,
//                R.id.nav_help, R.id.nav_setting)
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//       NavigationUI.setupWithNavController(navigationView, navController);
//       if (savedInstanceState == null) {
//           getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new RideFragment()).commit();
//           navigationView.setCheckedItem(R.id.nav_get_a_ride);
//       }
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        switch (menuItem.getItemId()){
//            case R.id.nav_get_a_ride:
//                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new RideFragment()).commit();
//                break;
//            case R.id.nav_notification:
//                startActivity(new Intent(MainActivity.this, LoginActivity.class));
//                break;
//            case R.id.nav_history:
//                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new RideFragment()).commit();
//                break;
//            case R.id.nav_help:
//                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new HelpFragment()).commit();
//                break;
//            case R.id.nav_setting:
//                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new SettingFragment()).commit();
//                break;
//        }
//
//        return true;
//    }
////    Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////         Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.main, menu);
////        return true; }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
////    public boolean onNavigationItermSelected(MenuItem item)
////    {
////        int id = item.getItemId();
////        if (id == R.id.nav_get_a_ride){
////        }
//    //}
//}
private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dl = (DrawerLayout)findViewById(R.id.drawer_layout);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);
        nv = (NavigationView)findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.nav_get_a_ride:
                        Toast.makeText(MainActivity.this, "My Account", Toast.LENGTH_SHORT).show();
                    case R.id.nav_history:
                        //Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, RideHistoryFragment.class));
                        break;
                    case R.id.nav_notification:
                        //Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, NotificationFragment.class));
                        break;

                }

                return true;

            }

        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
