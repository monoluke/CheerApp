package com.cheerapp;

import android.os.Environment;
import android.provider.MediaStore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
    import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by hadas on 18-May-17.
 */

public class CalendarParser {

    private List<Event> eventList;

    public CalendarParser(String calTxtFilePath) {
        String rawCalTxt = openFile(calTxtFilePath);
        this.eventList = parseEvents(rawCalTxt);
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public class Event {
        public String description;
        public String time;
    }

    private String openFile(String filePath) {
        StringBuilder text = new StringBuilder();
        try {
            File sdcard = Environment.getExternalStorageDirectory();
            File file = new File(sdcard,"testFile.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close() ;
        }catch (IOException e) {
            e.printStackTrace();
        }

        return text.toString();
    }

    private List<Event> parseEvents(String rawCalTxt) {
        Calendar date = new GregorianCalendar();
//        date.set();

        return  null;
    }
}
