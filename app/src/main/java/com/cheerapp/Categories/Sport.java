package com.cheerapp.Categories;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Sport extends Category {
    static String[] ExamMessages;
    public String[] messages = {"May the odds be ever in your favor!", "We are the champions",
            "WIN!!!"};
    public String name;
    public static int[] notificationTimes = {1440};

    Sport(){
        name = "Sport";
    }
}
