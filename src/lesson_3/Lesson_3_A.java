package lesson_3;

public class Lesson_3_A {
    public static void main(String[] args) {
//        string s = "Привет, привет"+" Пока, пока";
//        int a= -61;
//        string b = a > 0 ? string ss : s;
//
//        for (int i = 0;i<5;i++){
//            System.out.printf("\n - Hello!! %s %s","Ну хэллоу",b);
        double totalSum = 1_000_000;
        int year = 5;
        int rate = 7;

        for (int i=0; i<year*12;i++){
            totalSum = totalSum*rate/100+totalSum;
        }
        System.out.printf("%.2f\n",totalSum);
    }
}
