package lesson_8.homework;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,7,10,7,"Прямоугольник");
        Circle circle = new Circle(10,"Круг");
        Triangle triangle = new Triangle(10,15,22,"Треугольник");
        Ellipse ellipse = new Ellipse(200,20,"Эллипс");

        rectangle.getPerimeter();
        circle.getPerimeter();
        triangle.getPerimeter();
        ellipse.getPerimeter();

    }
}