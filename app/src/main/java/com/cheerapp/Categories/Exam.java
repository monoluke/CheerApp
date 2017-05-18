package com.cheerapp.Categories;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class Exam extends Category {
    static String[] ExamMessages = {"Good luck!", "You're smart", "It'll all be over soon",
            "you've passed far worse things already...", "It's only an exam"};
    public String name;
    public static long[] times = {1440};

    Exam(){
        name = "Exam";
        messages = ExamMessages;
        notificationTimes = times;

    }

}
