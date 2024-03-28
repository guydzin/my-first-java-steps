package lesson_10.task1;

public class Duck extends Bird implements Swim{
    @Override
    public void swim() {
        System.out.println("The duck swims");
    }
}
