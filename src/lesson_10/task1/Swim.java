package lesson_10.task1;

public interface Swim   {
    void swim();

    default void swimFast(){
        System.out.println("Swims fast enough");
    }
}
