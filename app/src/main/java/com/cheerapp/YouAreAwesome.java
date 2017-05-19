package com.cheerapp;
import com.cheerapp.R;
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
        text1.setText(Globaly.eventDescription);
        TextView text = (TextView) findViewById(R.id.editText2);
        text.setText(Globaly.notificationMsg);



        ImageView im = (ImageView) findViewById(R.id.imageView2);
        im.setImageDrawable(R.drawable.i4);


    }
}
