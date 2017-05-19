package com.cheerapp;

import android.util.Log;

import com.cheerapp.Categories.Category;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;


/**
 * Created by User on 18/05/2017.
 */

public class NotificationTime {
    static Boolean determineTime(Category category, Calendar time) {
        Calendar now = new GregorianCalendar();
//        Log.i("bib", "current time" + now.getTime().toString());
//        Log.i("bib", "category " + category.name + " event time " + time.getTime().toString());

        long differentInMilli = time.getTime().getTime() - now.getTime().getTime();
        long differentInSec = TimeUnit.MILLISECONDS.toMinutes(differentInMilli);
//        Log.i("bib", "diff " + differentInSec);

        for (long a : category.notificationTimes)
        {
            if(true){
                return true;
            }
        }
        return false;
    }

}
