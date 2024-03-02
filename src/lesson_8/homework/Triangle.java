package lesson_8.homework;

public class Triangle extends Figure {
    public Triangle(double a, double b, double c, String name) {
        super(a, b, c, name);
    }

    @Override
    public void getPerimeter() {
        double p = (a + b + c) / 2;
        super.perimeter = (Math.sqrt((p - a) * (p - b) * (p - c)));
        if (a <= 0 || b <= 0 || c <= 0 || name.isBlank()) {
            System.out.println("Неверно указан параметр фигуры\n");
            return;
        }
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }
}
