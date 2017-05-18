package com.cheerapp.Categories;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Daniella Horan on 5/18/2017.
 */

public class CategoryFactory {

        Category factory(String name){
        Category category = new com.cheerapp.Categories.Category();
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


}
