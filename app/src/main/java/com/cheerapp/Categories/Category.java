package com.cheerapp.Categories;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Category {
    public String[] messages;
    public static double[] notificationTimes;
    public String name;


    public String sampleMsg(){
        int rnd = new Random().nextInt(messages.length);
        return messages[rnd];
    }
}
