package br.com.alura;

import java.util.List;

public class TestCourse {

    public static void main(String[] args) {
        Course javaCollections = new Course("Dominating Collections", "Paulo Silveira");

        //javaCollections.getClasses().add(new Class("Working with ArrayList", 21));

        javaCollections.addClass(new Class("Working with ArrayList", 21));
        javaCollections.addClass(new Class("Creating classes", 20));
        javaCollections.addClass(new Class("Modeling with collections", 22));

        System.out.println(javaCollections.getClasses());
    }
}
