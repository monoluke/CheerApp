package com.cheerapp;
import junit.framework.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import static android.R.attr.entryValues;
import static android.R.attr.x;
import static android.R.id.message;
import static java.lang.System.in;


/**
 * Created by User on 18/05/2017.
 */

public class parser {
     String[] Test = {"test", "quiz", "exam", "bagrut", "sat", "psychometric", "examination",
            "tryout", "audition", "midterm", "final", "interview", "evaluation", "university"}; // 0

     String[] Social = {"social", "party", "celebration", "dinner", "gala", "prom", "anniversary", "festival",
            "date", "carnival"}; // 1

     String[] Vacation = {"vacation", "holiday", "break", "rest", "beach"}; // 2

    HashMap<String, List<String>> dict = new HashMap<>();
    HashMap<String, Integer> toCount = new HashMap<>();
//    HashMap<String, Integer> counter = new HashMap<>();

//    HashMap<String, List<String>> dict;
    int[] counter = {0, 0, 0};
    String[] catergories = {"test", "social", "vacation"};


    void constructor(){
        dict.put("test", Arrays.asList(Test));
        dict.put("social", Arrays.asList(Social));
        dict.put("vacation", Arrays.asList(Vacation));
        toCount.put("test", 0);
        toCount.put("social", 0);
        toCount.put("vacation", 0);
    }

//    String[][] categories = {Test, Social, Vacation};

     int maxInd = 0;

//    int size = categories.length;


    String wordDetector(String string){
        constructor();
        String str = string.toLowerCase();
        String[] message = str.split(" ");
        for (String word : message){
            int rounds = 0;
            for (Map.Entry<String, List<String>> x : dict.entrySet()) {
                if (x.getValue().contains(word)){
                    Integer a = toCount.get(x.getKey()) + 1;
                    toCount.remove(x.getKey());
                    toCount.put(x.getKey(), a);
                }
                rounds ++;
             }
        }
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : toCount.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        if (maxEntry == null){
            return null;
        }
        else{
            System.out.print("done");
            return null;
        }
    }


//        for (int i = 0; i < message.length; i++){
//            for (int j = 0; j < categories.length; j++){
//                if (Arrays.asList(categories[j]).contains(message[i])){
//                    categoryCounter[j]++;
//                }
//            }
//        String[] message = string.split(" ");
//        for (int i = 0; i < message.length; i++){
//            for (int j = 0; j < categories.length; j++){
//                if (Arrays.asList(categories[j]).contains(message[i])){
//                    categoryCounter[j]++;
//                }
//            }
//        }
//        for (int i = 1; i < categoryCounter.length; i++){
//            if (categoryCounter[i] > categoryCounter[i-1]){
//                maxInd = i;
//            }
//        }
//        if (categoryCounter[maxInd] == 0){
//            return null;
//        }
//        else
//            System.out.print(categories[maxInd][0]);
//        return "a";
//    }
//    public static void main(){
//        String a = wordDetector("exam");
//        System.out.print(a);
//    }
}

