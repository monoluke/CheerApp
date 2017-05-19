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
        String img = ImageFinder.findImage(eventCategory);
        if(!showFlag){
            return null;
        }
        Notification notification = new Notification(event.description, notificationMsg, img);
        return notification;
    }

}
