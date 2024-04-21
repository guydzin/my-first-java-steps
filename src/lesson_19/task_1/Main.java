package lesson_19.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // 1. Обычный класс
    // 2. Вложенный класс
    // 3. Статический вложенный класс
    // 4. Локальный вложенный класс
    // 5. Анонимный вложенный класс


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Car car = new Car("honda", "black", new Car.Engine(150, "diesel"));
        car.printInfo();
    }
}