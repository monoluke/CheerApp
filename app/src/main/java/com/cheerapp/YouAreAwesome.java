package com.cheerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class YouAreAwesome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        setContentView(R.layout.activity_you_are_awesome);
    }
}
