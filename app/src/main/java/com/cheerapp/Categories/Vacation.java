package com.cheerapp.Categories;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Vacation extends Category {
    static String[] VacationMessages = {"Have fun!", "Enjoy", "Finally - some free time",
            "Rest a little bit...", "FUN FUN FUN"};
    public String name;
    public static long[] times = {1440, 4320, 10080};


    Vacation(){
        name = "Vacation";
        messages = VacationMessages;
        notificationTimes = times;
    }
}
