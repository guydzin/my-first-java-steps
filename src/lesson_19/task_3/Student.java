package lesson_19.task_3;

public class Student {
    private String firtsname;
    private String lastname;
    private int age;
    private double rate;
    private String course;

    public Student(String firtsname, String lastname, int age, double rate, String course) {
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.age = age;
        this.rate = rate;
        this.course = course;
    }

    public int getAge() {
        return age;
    }
}
