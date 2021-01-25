import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course{

    private String name;
    private int students;

    public Course(String name, int students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }
}

public class CoursesExample {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Python", 45));
        courses.add(new Course("Javascript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        courses.sort(Comparator.comparing(Course::getStudents));

        Stream<String> names = courses.stream().map(Course::getName);

        int sum = courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .mapToInt(Course::getStudents)
                .sum();
                //forEach(System.out::println)
        System.out.println(sum);

        courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getName()));

/*        courses = courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .collect(Collectors.toList());

        courses.stream()
                .forEach(c -> System.out.println(c.getName()));*/

/*        Map<String, Integer> map = courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getStudents()));

        System.out.println(map);*/

        courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getStudents()))
                .forEach((name, students) -> System.out.println(name + " has " + students + " students."));
    }

}
