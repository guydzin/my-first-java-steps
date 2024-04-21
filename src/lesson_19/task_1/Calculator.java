package lesson_19.task_1;

public class Calculator {
    private int a;
    private int b;

    public void sum(){
        class Sum{
            private int innerA;
            private int innerB;

            public Sum(int innerA, int innerB) {
                this.innerA = innerA;
                this.innerB = innerB;
            }

            public void printSum(){
                System.out.println("Сумма равна " + (innerA+innerB));
            }
        }
        Sum sum = new Sum(1,5);
    }
}