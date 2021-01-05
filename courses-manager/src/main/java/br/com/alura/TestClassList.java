package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestClassList {

    public static void main(String[] args) {

        Class class1 = new Class("Rewatching ArrayLists", 21);
        Class class2 = new Class("Objects List", 20);
        Class class3 = new Class("Relationship of lists and objects", 15);

        ArrayList<Class> classes = new ArrayList<>();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);

        System.out.println(classes);

        Collections.sort(classes);
        System.out.println(classes);

        Collections.sort(classes, Comparator.comparing(Class::getTime));

        System.out.println(classes);

    }
}
