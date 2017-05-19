package com.cheerapp;

import com.cheerapp.Categories.Category;
import java.util.Random;



/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class ImageFinder {

    public static String findImage(Category category){
        int num = 0;
        if (category.name.equals("Exam")){
            num = new Random().nextInt(34-24) + 24;
        }
        if (category.name.equals("Vacation")){
            num = new Random().nextInt(9-1) + 1;
        }
        if (category.name.equals("Sport")){
            num = new Random().nextInt(14-9) + 9;
        }
        if (category.name.equals("Social")){
            num = new Random().nextInt(24-14) + 14;
        }
        return "i"+Integer.toString(num);
    }

}
