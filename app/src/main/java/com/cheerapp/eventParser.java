//package com.cheerapp;
//
//
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.text.SimpleDateFormat;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//
///**
// * Created by hadas on 18-May-17.
// */
//
//public class eventParser {
//    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
//
//    private static Event parseEvent(String description, String dateString) {
//        if (description == null || dateString == null) {
//            return null;
//        }
//        description = description.replaceAll("\\p{Punct}", "");
//
//        Calendar date = new GregorianCalendar();
//        try {
//            date.setTime(dateFormat.parse(dateString));
//        } catch (ParseException e) {
//            return null;
//        }
//        return new Event(description, date);
//    }
//
//    /**
//     * returns null if there's no notification in the next 2 minutes
//     * @param events
//     * @return
//     */
//    public static Notification getNearestNotification(ArrayList<ArrayList> events) {
//        ArrayList<Event> allEvents = new ArrayList<>();
//        for (int i = 0; i < events.size(); i++) {
//            String description = (String)events.get(0).get(i);
//            String date = (String)events.get(1).get(i);
//            Event currentEvent = parseEvent(description, date);
//            if (currentEvent != null) {
//                allEvents.add(currentEvent);
//            }
//        }
//
//        Collections.sort(allEvents, new Comparator<Event>() {
//            @Override
//            public int compare(Event e1, Event e2) {
//                return e1.startTime.compareTo(e2.startTime);
//            }
//        });
//
//        for (Event e : allEvents) {
//            Notification notification = eventAnalysis.createNotification(e);
//            if (notification != null) {
//                return notification;
//            }
//        }
//    return null;
//    }
//}
