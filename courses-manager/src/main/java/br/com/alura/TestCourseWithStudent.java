package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestCourseWithStudent {

    public static void main(String[] args) {

        Course javaCollections = new Course("Dominating Collections", "Paulo Silveira");

        javaCollections.addClass(new Class("Working with ArrayList", 21));
        javaCollections.addClass(new Class("Creating classes", 20));
        javaCollections.addClass(new Class("Modeling with collections", 22));

        Student student1 = new Student("Rodrigo Turini", 34672);
        Student student2 = new Student("Guilherme Silveira", 5617);
        Student student3 = new Student("Mauricio Aniche", 17645);

        javaCollections.enrollStudent(student1);
        javaCollections.enrollStudent(student2);
        javaCollections.enrollStudent(student3);

        System.out.println("All students enrolled: ");

        Set<Student> students = javaCollections.getStudents();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }

        Vector<Student> vector = new Vector<>();


        for(Student s : javaCollections.getStudents()){
            System.out.println(s);
        }

        javaCollections.getStudents().forEach(student -> {
            System.out.println(student);
        });

        System.out.println("Is " + student1 + "enrolled? ");
        System.out.println(javaCollections.isEnrolled(student1));

        Student turini = new Student("Rodrigo Turini", 34672);
        System.out.println("What about this Turini, is he enrolled? ");
        System.out.println(javaCollections.isEnrolled(turini));

        System.out.println("Student1 is equals to Turini? ");
        System.out.println(student1.equals(turini));
    }
}
