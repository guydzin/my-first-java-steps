package lesson_8.homework;

public class Rectangle extends Figure {
    public Rectangle(double a, double b, double c, double d, String name) {
        super(a, b, c, d, name);
    }

    @Override
    public void getPerimeter() {
        perimeter = a + b + c + d;
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || name.isBlank()) {
            System.out.println("Неверно указан параметр фигуры\n");
            return;
        }
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }
}
