package com.cheerapp.Categories;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public abstract class Category {
    static String[] messages;
    public String name;
    public int numOfNotifications;

    public String sampleMsg(){
        int rnd = new Random().nextInt(messages.length);
        return messages[rnd];
    }
}
