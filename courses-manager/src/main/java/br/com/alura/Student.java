package br.com.alura;

import java.util.Objects;

public class Student {

    private String name;
    private int numberEnrollment;

    public Student (String name, int numberEnrollment){
        if (name == null){
            throw new NullPointerException("Name can't be null!");
        }
        this.name = name;
        this.numberEnrollment = numberEnrollment;
    }

    public String getName() {
        return name;
    }

    public int getNumberEnrollment() {
        return numberEnrollment;
    }

    @Override
    public boolean equals(Object o) {
        Student anotherStudent = (Student) o;
        return this.name.equals(anotherStudent.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numberEnrollment=" + numberEnrollment +
                '}';
    }
}
