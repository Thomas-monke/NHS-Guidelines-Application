package com.example.nhsguidelinesapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class GuidelinesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    int images[] = {
            R.drawable.ic_baseline_add_24,
            R.drawable.ic_baseline_check_box_24,
            R.drawable.ic_baseline_delete_24,
            R.drawable.ic_baseline_help_24,
            R.drawable.ic_baseline_home_24,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        if (drawer != null) {
            drawer.addDrawerListener(toggle);
            toggle.syncState();
        }
        if (savedInstanceState == null) {
            navigationView.setCheckedItem(R.id.home);
        }
        setupCarousel();
    }
    private void setupCarousel() {
        Carousel carousel = findViewById(R.id.carousel);
        TextView label = findViewById(R.id.label);
        if (carousel == null) { //if the carousel is null, end the method
            return;
        }
        carousel.setAdapter(new Carousel.Adapter() {
            @Override
            public int count() {
                return images.length;
            }

            @Override
            public void populate(View view, int index) {
                if (view instanceof ImageView) { //if the view is a type of ImageView - all ImageViews are views
                    ImageView imageView = (ImageView) view;//cast to type ImageView
                    imageView.setImageResource(images[index]);
                }
            }

            @Override
            public void onNewItem(int index) {
                if (label != null) {
                    label.setText("index " + (index + 1));
                }
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.nav_guidelines:
                startActivity(new Intent(this, GuidelinesActivity.class));
                break;
            case R.id.nav_help:
                startActivity(new Intent(this, HelpActivity.class));
                break;
            case R.id.nav_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.nav_logout:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
        //drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}