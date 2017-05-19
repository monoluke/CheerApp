package com.cheerapp;
import com.cheerapp.R;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class YouAreAwesome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_are_awesome);
        TextView text1 = (TextView) findViewById(R.id.editText);
        text1.setText("Event: "+Globaly.eventDescription);
        TextView text = (TextView) findViewById(R.id.editText2);
        text.setText(Globaly.notificationMsg);




        int imageResourse = getResources().getIdentifier("@drawable/" + Globaly.notificationImg, null, getPackageName());
        ImageView im = (ImageView) findViewById(R.id.imageView2);
        Drawable res = getResources().getDrawable(imageResourse);
        im.setImageDrawable(res);



    }
}
