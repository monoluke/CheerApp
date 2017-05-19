package com.cheerapp;


import android.util.Log;

import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Created by hadas on 18-May-17.
 */

public class eventParser {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    private static final long _30DAYS_MS = 2592000000L;

    private static Event parseEvent(String description, String dateString) {
        if (description == null || dateString == null) {
            return null;
        }
        description = description.replaceAll("\\p{Punct}", "");

        Calendar date = new GregorianCalendar();
        try {
            date.setTime(dateFormat.parse(dateString));
        } catch (ParseException e) {
            return null;
        }
        return new Event(description, date);
    }

    private static ArrayList<Event> parseAndSort(ArrayList<ArrayList> events) {
        ArrayList<Event> allEvents = new ArrayList<>();
        for (int i = 0; i < events.get(0).size() && i < 100; i++) {
            String description = (String)events.get(0).get(i);
            String date = (String)events.get(1).get(i);
            Event currentEvent = parseEvent(description, date);
            if (currentEvent != null) {
                allEvents.add(currentEvent);
            }
        }

        Collections.sort(allEvents, new Comparator<Event>() {
            @Override
            public int compare(Event e1, Event e2) {
                return e1.startTime.compareTo(e2.startTime);
            }
        });

        return allEvents;
    }

    /**
     * returns null if there's no notification in the next 2 minutes
     * @param events
     * @return
     */
    public static Notification getNearestNotification(ArrayList<ArrayList> events) {
        ArrayList<Event> allEvents = parseAndSort(events);

        for (Event e : allEvents) {
            Notification notification = eventAnalysis.createNotification(e);
            if (notification != null) {
                return notification;
            }
        }
    return null;
    }

    public static ArrayList<Event> getUpcomingEvents(ArrayList<ArrayList> events) {
        ArrayList<Event> allEvents = parseAndSort(events);
        ArrayList<Event> nextMonthEvents = new ArrayList<>();

        Calendar now = GregorianCalendar.getInstance();
        Calendar in30days = new GregorianCalendar();
        in30days.setTime(new Date(now.getTimeInMillis() + _30DAYS_MS));

        for (Event e : allEvents) {
            // check that the event is after today and before a month from now
            if (e.startTime.compareTo(now) > 0 && e.startTime.compareTo(in30days) < 0) {
                nextMonthEvents.add(e);
            }
        }
        return nextMonthEvents;
    }

}
