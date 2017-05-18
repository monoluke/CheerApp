package com.cheerapp;

import java.util.Calendar;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Notification {
    public String eventDescription;
    public String notificationMsg;
    public Image notificationImg;

    public Notification(String description, String msg, Image img){
        eventDescription = description;
        notificationMsg = msg;
        notificationImg = img;
    }
}
