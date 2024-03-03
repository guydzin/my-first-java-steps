package lesson_8.part_1;

public class Person {
    protected String name;
    protected String age;
    protected static String sex = "Да, конечно!";

    void printInfo(){
        System.out.println("Привет, как дела?");
    }

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }
}
