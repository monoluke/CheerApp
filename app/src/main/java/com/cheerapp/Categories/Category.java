package com.cheerapp.Categories;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Category {
    public String[] messages;
    public String name;
    public long[] notificationTimes;


    public String sampleMsg(){
        int rnd = new Random().nextInt(messages.length);
        return messages[rnd];
    }
}
