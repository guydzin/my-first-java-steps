package lesson_19.task_1;

public class Car {
    private String vendor;
    private String colour;
    private Engine engine;

    public static class Engine {
        private int horsePower;
        private String type;

        public Engine(int horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }
    }

    public Car(String vendor, String colour, Engine engine) {
        this.vendor = vendor;
        this.colour = colour;
        this.engine = engine;
    }

    public void printInfo(){
        System.out.println("Характеристики авто");
        System.out.println("Производитель " + vendor);
        System.out.println("Цвет "+ colour);
        System.out.println("Двигатель\n" + engine.type);
        System.out.println("Мощность " + engine.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
