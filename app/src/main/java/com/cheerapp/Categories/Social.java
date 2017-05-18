package com.cheerapp.Categories;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Social extends Category {
    static String[] SocialMessages = {"You're beautiful, inside and out!", "Have fun"};
    public String name;
    public static long[] times = {1440};


    Social(){
        name = "Social";
        messages = SocialMessages;
        notificationTimes = times;

    }
}
