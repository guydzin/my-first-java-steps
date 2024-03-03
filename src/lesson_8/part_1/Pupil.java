package lesson_8.part_1;

public class Pupil extends Person {
    private String schoolNumber;
    private double avarageRate;

    public void printInfo(){
        System.out.println("Привет, как дела?");
    }

    public Pupil(String name,String age){
        super(name,age);
    }
}
