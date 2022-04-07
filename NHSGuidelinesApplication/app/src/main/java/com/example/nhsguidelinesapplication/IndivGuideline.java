package com.example.nhsguidelinesapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class IndivGuideline extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cursor, new String[] {"NAME"}, new int[] {android.R.id.text1, android.R.id.text2}, 0);
        listView.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new MyListViewListener();
        listView.setOnItemClickListener(itemClickListener);

    }
}
