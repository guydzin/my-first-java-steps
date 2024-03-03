package lesson_8.homework;

public class Ellipse extends Circle {
    double r2;
    public Ellipse(double r,double r2, String name) {
        super(r, name);
        this.r2 = r2;
    }

    @Override
    public void getPerimeter() {
        perimeter = (4 * (Math.PI * r * r2) + (r - r2))/(r+r2);
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }
}
