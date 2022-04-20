package com.example.nhsguidelinesapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class Utility {
    public static Toolbar setupToolbar(Context c) {
        Toolbar toolbar = new Toolbar(c);
        toolbar.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        toolbar.setBackgroundColor(Color.parseColor("#005eb8"));
        toolbar.setElevation(4f);
        toolbar.setId(View.generateViewId());
        return toolbar;
    }
    public static NavigationView setupSidebar(Context c) {
        NavigationView navigationView = new NavigationView(c);
        navigationView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        navigationView.setId(View.generateViewId());
        navigationView.setForegroundGravity(Gravity.START);
        navigationView.inflateHeaderView(R.layout.nav_header);
        navigationView.inflateMenu(R.menu.drawer_menu);
        return navigationView;
    }
}
