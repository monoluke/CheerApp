package com.cheerapp.Categories;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Social extends Category {
    static String[] SocialMessages = {"You're beautiful, inside and out!", "Have fun"};
    public static long[] times = {1440};


    Social(){
        super.name = "Social";
        super.messages = SocialMessages;
        super.notificationTimes = times;

    }
}
