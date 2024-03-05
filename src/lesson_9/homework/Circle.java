package lesson_9.homework;

public class Circle extends Figure {
    public Circle(double r, String name) {
        super(r, name);
    }

    @Override
    public void getPerimeter() {
        perimeter = 2 * Math.PI * r;
        if (r<=0 || name.isBlank()) {
            System.out.println("Неверно указан параметр фигуры\n");
            return;
        }
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }
}
