package com.cheerapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.CalendarContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Classifier c = new Classifier();

//        this.showUpcomingEvents();
        //ContentResolver contentResolver = this.getContentResolver();
        // Here, thisActivity is the current activity

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_CALENDAR)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_CALENDAR)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_CALENDAR},
                        11);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }



        Intent i = new Intent(this, BackgroundProc.class);
        // Add extras to the bundle
        i.putExtra("foo", "bar");
        // Start the service
        startService(i);
    }

// bobib

    @Override
    public void onRequestPermissionsResult(int callbackId,
                                           String permissions[], int[] grantResults) {
        System.out.println("hello");

    }

    public void onClickCal(View v){
        Intent calendarIntent = new Intent(Intent.ACTION_INSERT, CalendarContract.Events.CONTENT_URI);
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(calendarIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        if (isIntentSafe){
            startActivity(calendarIntent);
        }
    }

    public void onClickCat(View v) {
        Intent intent = new Intent(this, CategoriesActivityPage.class);
        startActivity(intent);


    }
/*
    @Override
    protected void onResume() {
        super.onResume();
        this.showUpcomingEvents();
    }

    public void showUpcomingEvents(){

        String message = "";
        int i = 0;
        ArrayList<ArrayList> events = Utility.readCalendarEvent(this);
        ArrayList<Event> upcomingEvents = eventParser.getUpcomingEvents(events);
        while (i < 5 && i < upcomingEvents.size())
        {
            message += upcomingEvents.get(i).description + "\n";
            i++;
        }
        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
    */
}