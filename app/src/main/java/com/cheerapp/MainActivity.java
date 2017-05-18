package com.cheerapp;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ContentResolver contentResolver = this.getContentResolver();
        System.out.println("hello");

        int permissionCheck = ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_CALENDAR);


        Cursor cur = null;
        ContentResolver cr = getContentResolver();
        Uri uri = CalendarContract.Calendars.CONTENT_URI;
        String selection = "((" + CalendarContract.Calendars.ACCOUNT_NAME + " = ?) AND ("
                + CalendarContract.Calendars.ACCOUNT_TYPE + " = ?) AND ("
                + CalendarContract.Calendars.OWNER_ACCOUNT + " = ?))";
        String[] selectionArgs = new String[]{"hera@example.com", "com.example",
                "hera@example.com"};

        cur = cr.query(uri, (new String[] { "_id", "displayName", "selected" }), selection, selectionArgs, null);

//        final Cursor cursor = contentResolver.query(Uri.parse("content://calendar/calendars"),
//                (new String[] { "_id", "displayName", "selected" }), null, null, null);

        while (cur.moveToNext()) {

            final String _id = cur.getString(0);
            final String displayName = cur.getString(1);
            final Boolean selected = !cur.getString(2).equals("0");

            System.out.println("Id: " + _id + " Display Name: " + displayName + " Selected: " + selected);
        }
    }

// bobib

    @Override
    public void onRequestPermissionsResult(int callbackId,
                                           String permissions[], int[] grantResults) {
        System.out.println("hello");

    }
}