package lesson_5;

/*
Домашнее задание к занятию 5:
1. Задать двухмерный массив целых чисел размером 9 х 9.
Заполнить диагональ массива единицами, как на первой картинке.
Код должен работать корректно, если поменять размер массива, например 11 х 11.
2. То же самое, но заполнить единицами обе диагонали, как на второй картинке.
Код также должен работать корректно при любом размере массива.
Решать с помощью циклов.
3. **Для желающих. Заполнить двумерный массив ромбиком как на третьей картинке. Зелёные поля заполнить единицами,
жёлтые - нулями. Массив должен быть квадратным (число строк равно числу столбцов). Размер массива должен быть нечётным.
Код должен корректно работать при любом нечётном размере массива.
 */
public class Homework_5 {
    public static void main(String[] args) {
        int length = 5;
        int[][] newArrayOne = new int[length][length];
        int[][] newArrayTwo = new int[length][length];

        if (length % 2 == 0) {
            System.out.println("Массив должен быть нечетным");
            return;
        }

        for (int i = 0; i < newArrayOne.length; i++) {
            for (int j = 0; j < newArrayOne.length; j++) {
                if (i == j) {
                    newArrayOne[i][j] = 1;
                }
                if (i + j + 1 == length) {
                    newArrayOne[i][j] = 1;
                }
                System.out.print(newArrayOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int startIndex = newArrayTwo.length / 2;
        int endIndex = newArrayTwo.length / 2;
        for (int i = 0; i < newArrayTwo.length; i++) {
            for (int j = 0; j < newArrayTwo[0].length; j++) {
                if (j >= startIndex && j <= endIndex) {
                    newArrayTwo[i][j] = 1;
                }
            }
            if (i < newArrayTwo.length / 2) {
                startIndex--;
                endIndex++;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        for (int i = 0; i < newArrayTwo.length; i++) {
            for (int j = 0; j < newArrayTwo[0].length; j++) {
                System.out.print(newArrayTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}