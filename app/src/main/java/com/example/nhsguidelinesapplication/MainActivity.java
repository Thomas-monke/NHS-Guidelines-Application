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

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    LocationManager locationManager;
    //LocationListener locationListener = new MyLocationListener();  // The listener that responds to location updates.
    public static SQLiteDatabase db;
    public static double Latitude, Longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);  // Create the location manager.
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//Creating this for the app bar.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
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
}