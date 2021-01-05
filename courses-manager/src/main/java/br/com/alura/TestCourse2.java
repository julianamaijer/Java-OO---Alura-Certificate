package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestCourse2 {

    public static void main(String[] args) {
        Course javaCollections = new Course("Dominating Collections", "Paulo Silveira");

        javaCollections.addClass(new Class("Working with ArrayList", 21));
        javaCollections.addClass(new Class("Creating classes", 20));
        javaCollections.addClass(new Class("Modeling with collections", 22));

        List<Class> classImmutable = javaCollections.getClasses();
        System.out.println(classImmutable);

        List<Class> classes = new ArrayList<>(classImmutable);

        Collections.sort(classes);
        //Collections.reverse(classes); -> método que ordenada ao contrário
        System.out.println(classes);
        System.out.println(javaCollections.getTotalTime());

        System.out.println(javaCollections);

    }
}
