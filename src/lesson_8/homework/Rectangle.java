package lesson_8.homework;

public class Rectangle extends Figure {
    public Rectangle(double a, double b, double c, double d, String name) {
        super(a, b, c, d, name);
    }

    public void getPerimeter() {
        double perimeter = a+b+c+d;
        System.out.printf("Фигура - %s, периметр фигуры = %f",name, perimeter);
    }
}
