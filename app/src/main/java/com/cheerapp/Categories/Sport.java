package com.cheerapp.Categories;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Sport extends Category {
    static String[] SportMessages = {"May the odds be ever in your favor!", "We are the champions",
            "WIN!!!"};
    public String name;
    public static long[] times = {1440};


    Sport(){
        name = "Sport";
        messages = SportMessages;
        notificationTimes = times;

    }
}
