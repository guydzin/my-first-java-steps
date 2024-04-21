package lesson_19.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 17, 3.5, "One"));
        studentList.add(new Student("Max", "Ivanov", 25, 6.5, "Two"));
        studentList.add(new Student("Max", "Drist", 30, 6.7, "One"));
        studentList.add(new Student("Vovan", "Sidor", 21, 6.8, "Five"));
    }
}
