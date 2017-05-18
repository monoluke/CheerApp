package com.cheerapp;

import com.cheerapp.Categories.Category;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class eventAnalysis {

    Notification createNotification(Event event){
        Category eventCategory = Classifier.categoryDetector(event.description);

    }

}
