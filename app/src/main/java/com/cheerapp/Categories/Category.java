package com.cheerapp.Categories;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Category {
    static String[] messages;
    public String name;
    public int numOfNotifications;

    Category Category(String name){
        Category category = new Category();
        switch (name){
            case "Exam":
                category = new Exam();
                break;
            case "Social":
                category = new Social();
                break;
            case "Sport":
                category = new Sport();
                break;
            case "Vacation":
                category = new Vacation();
                break;
        }
        return category;
    }

    public String sampleMsg(){
        int rnd = new Random().nextInt(messages.length);
        return messages[rnd];
    }
}
