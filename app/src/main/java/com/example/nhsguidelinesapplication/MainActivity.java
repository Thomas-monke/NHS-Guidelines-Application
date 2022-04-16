package com.example.nhsguidelinesapplication;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

//    LocationManager locationManager;
//    LocationListener locationListener = new MyLocationListener();  // The listener that responds to location updates.
//    public static SQLiteDatabase db;
//    public static double Latitude, Longitude;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);  // Create the location manager.
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {//Creating this for the app bar.
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
    //@Override
//    public boolean onOptionsItemSelected(MenuItem item) {//checks which button on the app bar has been selected.
//        switch (item.getItemId()) {
//            case R.id.save_item:
//                Intent saveintent = new Intent(this, SaveActivity.class);
//                startActivity(saveintent);
//                return true;
//            case R.id.list_item:
//                Intent listintent = new Intent(this, ListActivity.class);
//                startActivity(listintent);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//    public class MyLocationListener implements LocationListener {
//
//        public void onLocationChanged(Location location) {
//            TextView TextView_latitude = findViewById(R.id.LatitudeField);
//            TextView_latitude.setText(String.valueOf(location.getLatitude()));
//            Latitude = location.getLatitude();
//            TextView TextView_longitude = findViewById(R.id.LongitudeField);
//            TextView_longitude.setText(String.valueOf(location.getLongitude()));
//            Longitude = location.getLongitude();
//        }
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {//This method is required to stop AbstractMethodErrors from occurring.
//
//        }
//    }

    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction();
            navigationView.setCheckedItem(R.id.nav_guidelines);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                break;
            case R.id.nav_guidelines:
                break;
            case R.id.nav_help:
                break;
            case R.id.nav_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}