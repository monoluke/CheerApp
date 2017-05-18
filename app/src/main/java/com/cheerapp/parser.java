package com.cheerapp;
import junit.framework.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import static java.lang.System.in;


/**
 * Created by User on 18/05/2017.
 */

public class parser {
    static String[] Test = {"test", "quiz", "exam", "bagrut", "sat", "psychometric", "examination",
            "tryout", "audition", "midterm", "final", "interview", "evaluation", "university"};

    static String[] Social = {"social", "party", "celebration", "dinner", "gala", "prom", "anniversary", "festival",
            "date", "carnival"};

    static String[] Vacation = {"vacation", "holiday", "break", "rest", "beach"};

    static String[][] categories = {Test, Social, Vacation};

    static int maxInd = 0;

    static int categoryCounter[];


    private static String wordDetector(String x){
        String[] message = x.split(" ");
        for (int i = 0; i < message.length; i++){
            for (int j = 0; j < categories.length; j++){
                if (Arrays.asList(categories[j]).contains(message[i])){
                    categoryCounter[j]++;
                }
            }
        }
        for (int i = 1; i < categoryCounter.length; i++){
            if (categoryCounter[i] > categoryCounter[i-1]){
                maxInd = i;
            }
        }
        if (categoryCounter[maxInd] == 0){
            return null;
        }
        else return categories[maxInd][0];
    }
    public static void main(){
        String a = wordDetector("exam");
        System.out.print(a);
    }
}

