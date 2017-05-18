package com.cheerapp;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by hadas on 18-May-17.
 */

public class Event {

    public String description;
    public Calendar startTime;

    public Event(String description, Calendar startTime) {
        this.description = description;
        this.startTime = startTime;
    }
}
