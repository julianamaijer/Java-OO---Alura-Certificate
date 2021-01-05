package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestStudents {

    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        students.add("Rodrigo Turini");
        students.add("Alberto Souza");
        students.add("Nico Steppat");
        students.add("Sergio Lopes");
        students.add("Renan Saggio");
        students.add("Mauricio Aniche");

        boolean pauloIsEnrolled = students.contains("Paulo Silveira");
        students.remove("Sergio Lopes");

        System.out.println(pauloIsEnrolled);

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());

        students.forEach(student -> {
            System.out.println(student);
        });

        List<String> studentsInList = new ArrayList<>(students);

    }

}
