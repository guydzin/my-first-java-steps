package lesson_19.task_2;

import lesson_19.task_1.Car;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Car> cars = new TreeSet<>();
        cars.add(new Car ("Honda", "white",new Car.Engine(157, "diesel")));
        cars.add(new Car ("Mazda", "black",new Car.Engine(200, "benzine")));
        cars.add(new Car ("Toyota", "orange",new Car.Engine(250, "gas")));

        for (Car car: cars){
            System.out.println(car);
        }
    }
}
