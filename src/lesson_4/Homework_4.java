package lesson_4;

/*Есть массив целых чисел (задайте его сами). Вывести на консоль:
        1) Сколько в массиве четных чисел?
        2) Все числа из массива, которые больше 10, но меньше 25.
        3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трём.
4) *** По желанию. Вывести только те числа, которые содержат в себе символ 4.*/

public class Homework_4 {
    public static void main(String[] args) {
        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();
        StringBuilder output3 = new StringBuilder();

        int length = 50;
        int numberOfEvenNumbers = 0;
        int[] reverseNewArray = new int[length];
        int[] newArray = new int[length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) Math.floor((Math.random() * length) + 1);
            output1.append(String.format("%s ", newArray[i]));
        }
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] > 10 && newArray[j] < 25) {
                output2.append(String.format("%s ", newArray[j]));
            }
        }

        for (int k = 0; k < newArray.length; k++) {
            if (newArray[k] % 2 == 0) {
                numberOfEvenNumbers++;
            }
        }

        for (int m = 0; m < reverseNewArray.length; m++) {
            reverseNewArray[m] = newArray[(newArray.length - 1) - m];
            output3.append(String.format("%s ", reverseNewArray[m]));
            if (reverseNewArray[m] % 3 == 0) {
                output3.append(String.format("%s ", reverseNewArray[m]));
            }
        }

        System.out.printf("Основной массив: %s\n", output1);
        System.out.printf("Числа больше 10 но меньше 25: %s\n", output2);
        System.out.printf("Все числа массива в обратном порядке: %s\n", output3);
        System.out.printf("Число четных чисел в массиве равно %s\n", numberOfEvenNumbers);

        //toDo Решить задачу №4
    }
}