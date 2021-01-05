package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestLists {

    public static void main(String[] args) {

        String class1 = "Lists knowledge";
        String class2 = "Modeling class classes";
        String class3 = "Working with courses and sets";

        ArrayList <String> classes = new ArrayList<String>();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);

        System.out.println(classes);

        classes.remove(0);

        System.out.println(classes);

        String firstClass = classes.get(0);
        System.out.println("The first class is: " + firstClass);

        for(int i = 0; i < classes.size(); i++){
            System.out.println("Class: " + classes.get(i));
        }

        System.out.println(classes.size());

        for (String class4: classes) {
            System.out.println("Class: " + class4);
        }

        classes.forEach(class4 -> {
            System.out.println("Class: ");
            System.out.println(class4);
        });

        classes.add("Growing our knowledge");
        System.out.println(classes);
        Collections.sort(classes);
        System.out.println(classes);

    }
}
