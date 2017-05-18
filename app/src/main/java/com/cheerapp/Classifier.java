package com.cheerapp;

import com.cheerapp.Categories.Category;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Classifier {
     static String[] Test = {"test", "quiz", "exam", "bagrut", "sat", "psychometric", "examination",
            "tryout", "audition", "midterm", "final", "interview", "evaluation", "university"}; // 0

     static String[] Social = {"social", "party", "celebration", "dinner", "gala", "prom", "anniversary", "festival",
            "date", "carnival"}; // 1

     static String[] Vacation = {"vacation", "holiday", "break", "rest", "beach"}; // 2

    static HashMap<String, List<String>> dict = new HashMap<>();
    static HashMap<String, Integer> toCount = new HashMap<>();

    static void constructor(){
        dict.put("test", Arrays.asList(Test));
        dict.put("social", Arrays.asList(Social));
        dict.put("vacation", Arrays.asList(Vacation));
        toCount.put("test", 0);
        toCount.put("social", 0);
        toCount.put("vacation", 0);
    }

    static Category categoryDetector(String string){
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
            Category category = new Category();
            category.name = maxEntry.getKey();
            return category;
        }
    }

}

