package com.cheerapp;

import java.util.Calendar;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Notification {
    public String eventDescription;
    public String notificationMsg;
    public String notificationImg;

    public Notification(String description, String msg, String img){
        eventDescription = description;
        notificationMsg = msg;
        notificationImg = img;
    }
}
