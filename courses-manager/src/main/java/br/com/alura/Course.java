package br.com.alura;

import java.util.*;

public class Course {

    private String name;
    private String instructorName;
    private List<Class> classes = new LinkedList<>();
    private Set<Student> students = new HashSet<>();
    private Map<Integer, Student> enrollmentForStudent = new HashMap<>();

    public Course(String name, String instructorName){
        this.name = name;
        this.instructorName = instructorName;
    }

    public List<Class> getClasses() {
        return Collections.unmodifiableList(classes);
    }

    public String getName() {
        return name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void addClass(Class class1){
        this.classes.add(class1);
    }

    public int getTotalTime(){
        //java 8:
        return this.classes.stream().mapToInt(Class::getTime).sum();
/*        int totalTime = 0;
        for (Class class1: classes){
            totalTime += class1.getTime();
        } return totalTime;*/
    }

    @Override
    public String toString() {
        return "[ Course: " + name + ", total time: " + this.getTotalTime() + "," + "classes: " + this.classes + "]";
    }


    public void enrollStudent(Student student){
        this.students.add(student);
        this.enrollmentForStudent.put(student.getNumberEnrollment(), student);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public boolean isEnrolled(Student student){
        return this.students.contains(student);
    }

    public Student searchEnrollment(int number) {
        if(!enrollmentForStudent.containsKey(number))
            throw new NoSuchElementException();
        return enrollmentForStudent.get(number);
    }
}
