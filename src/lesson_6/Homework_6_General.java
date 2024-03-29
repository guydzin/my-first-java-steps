package lesson_6;

/*
Домашнее задание к занятию 6:

Создать два класса.
Главный класс должен содержать один метод main - точка входа.
Второй класс должен содержать четыре метода:

1) Метод должен вывести на консоль площадь треугольника, передаём в метод три стороны

2) Метод должен вернуть кол-во гласных букв в тексте, который мы передаём входящим параметром

3) Метод должен печатать на консоль фигуру ромба, ориентируясь на входящий параметр - размер массива (массив квадратный).
Если передан чётный размер массива, ромб не должен выводиться, вместо этого должно выводиться сообщение об ошибке.

4) Метод должен печатать на консоль двухмерный массив, который мы передали в метод входящим параметром

В главном классе в методе main должны вызываться все методы второго класса,
чтобы наглядно был виден результат их работы.
 */
public class Homework_6_General {
    public static void main(String[] args) {
        Homework_6_Helper helper = new Homework_6_Helper();

        System.out.printf("Площадь треугольника со сторонами = %.2f\n", helper.triangleSquare(25, 87, 87));
        System.out.printf("Количество гласных в тексте равно %d\n", helper.vowels("Привет! Как у тебя дела, чумба? Парам-па-рам-пам"));
        System.out.printf("%s", helper.rhombus(11));
        System.out.printf("%s", helper.twoDimArray(new int[][]{{31, 28, 31}, {30, 31, 30}, {31, 31, 30}, {31, 30, 31}}));
    }
}