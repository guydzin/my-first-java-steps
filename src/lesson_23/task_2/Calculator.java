package lesson_23.task_2;

public class Calculator {
    public int division (int a, int b){

        if (b == 0){
            throw new ArithmeticException("Делитель не может быть нулём");
        }

        return a/b;
    }
}