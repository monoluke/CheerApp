package com.cheerapp.Categories;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Exam extends Category {

    static String[] messages = {"Good luck!", "You're smart", "It'll all be over soon",
            "you've passed far worse exams already...", "It's only an exam"};

    static int[] notificationTimes = {1440};
    public String name;

    Exam(){
        name = "Exam";
    }

}
