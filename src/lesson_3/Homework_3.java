package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/*
Домашнее задание к занятию 3:
1. Написать мини-справочник по геометрии. Программа должна считывать из консоли с клавиатуры фигуру - прямоугольник, квадрат или круг.
Для введённой фигуры вывести в консоль формулы расчёта площади и периметра. Не нужно считать какие-то конкретные значения, просто формулы.
2. Вывести в консоль все числа от 40 до 20 в порядке убывания.
3. Вывести в консоль сумму всех нечётных чисел от 20 до 60.
4. Вывести в консоль 20 раз фразу "Это строка номер n", где n - номер строки.
5. *** Для желающих. Задать два целых числа. Найти и вывести в консоль наименьшее общее кратное этих двух чисел.
Определение наименьшего общего кратного - Наименьшее общее кратное двух целых чисел m и n есть наименьшее натуральное число, которое делится на m и n без остатка, то есть кратно им обоим.
 */
public class Homework_3 {
    public static void main(String[] args) {

        String[] figuresGiven = {"прямоугольник", "квадрат", "круг"};
        Scanner userInput = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        //toDo использовал тут цикл, а выше массив, чтоб параметризировать задачу. Сделаю позже
        for (int i = 0; i < figuresGiven.length; i++) {
            output.append(String.format("%s,", figuresGiven[i]));
        }

        System.out.printf("Выбери фигуру, по которой хочешь получить информацию (%s): ", output);
        String figureActual = userInput.nextLine();
        System.out.printf("Ты указал: %s\n", figureActual);

        switch (figureActual) {
            case "прямоугольник":
                System.out.println("- Периметр P прямоугольника со сторонами abcd: P=2*a+2*b\n- Площадь S прямоугольника со сторонами abcd: S = a*b");
                break;
            case "квадрат":
                System.out.println("- Периметр P квадрата со сторонами abcd: P=4*a\n- Площадь S квадрата со сторонами abcd: S = a*b");
                break;
            case "круг":
                System.out.println("- Периметр P круга с радиусом r: P=2*Pi*r\n- Площадь круга с радиусом r: S = Pi*(r*r)");
                break;
            default:
                System.out.println("Такая фигура не задана");
                break;
        }

        for (int i = 40; i >= 20; i--) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.printf("Сумма всех нечетных чисел от 20 до 60 включительно: %s\n",sum);

        for (int i = 1; i <=20 ; i++) {
            System.out.printf("Это строка номер %s\n",i);
        }

        int [] twoInts = {1,1658};
        Arrays.sort(twoInts);
        int max = twoInts[1];
        int min = twoInts[0];

        if ((max==min||min==1)||(max%min==0)){
            System.out.println(max);
        } else {
            int nod = min%(max%min);
            int noc = (twoInts[0]*twoInts[1])/nod;
            System.out.println(noc);
        }
    }
}
