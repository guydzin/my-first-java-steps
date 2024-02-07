package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_1 {
    /* toDo
    *   Сделать округление проще
    *   Добавить отображение больших числел без указания степени
    *   Добавить перезапуск потока после исключения
    *   Добавить красивое отображение суммы сдачи и всего средств в формате ХХХХ.ХХ, а не как сейчас - ХХХХ.Х
    *   Добавить обработку отрицательных чисел
    * */

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    public static void main(String[] args) {

        try {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Сколько у вас всего средств: ");
            double moneyTotal = userInput.nextDouble();

            System.out.println("Сколько стоит пицца: ");
            double pizzaPrice = userInput.nextDouble();

            System.out.println("Сколько стоит шоколадка: ");
            double chocolatePrice = userInput.nextDouble();

            System.out.println("Сколько стоит конфетка: ");
            double candyPrice = userInput.nextDouble();

            int pizzasQty = (int) (moneyTotal / pizzaPrice);
            int chocolateQty = (int) ((moneyTotal % pizzaPrice) / chocolatePrice);
            int candiesQty = (int) (((moneyTotal % pizzaPrice) % chocolatePrice) / candyPrice);
            double change = moneyTotal - (pizzasQty * pizzaPrice + chocolateQty * chocolatePrice + candyPrice * candiesQty);

            System.out.println("На " + moneyTotal + " рублей мы можем купить:"
                    + "\n- пицца - " + pizzasQty + " шт."
                    + "\n- шоколадки - " + chocolateQty + " шт."
                    + "\n- конфеты - " + candiesQty + " шт."
                    + "\n- сдача - " + round(change, 2) + " рублей.");
        } catch (InputMismatchException e) {
            System.out.println("ВАЙ! АРРРЯЯЯ! Зачем обманываешь?! Хватит вводить всякое вот это вот всё не то!");
        }
    }
}