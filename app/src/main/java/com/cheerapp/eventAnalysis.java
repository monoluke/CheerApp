package com.cheerapp;

import com.cheerapp.Categories.Category;

import java.util.Calendar;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class eventAnalysis {

    static Notification createNotification(Event event){
        Category eventCategory = Classifier.categoryDetector(event.description);
        String notificationMsg = eventCategory.sampleMsg();
        Boolean showFlag = NotificationTime.determineTime(eventCategory, event.startTime);

    }

}
