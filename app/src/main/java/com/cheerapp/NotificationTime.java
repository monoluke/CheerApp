package com.cheerapp;

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
        long differentInMilli = time.getTime().getTime() - now.getTime().getTime();
        long differentInSec = TimeUnit.MILLISECONDS.toMinutes(differentInMilli);
        for (long a : category.notificationTimes)
        {
            if(a == differentInSec){
                return true;
            }
        }
        return false;
    }

}
