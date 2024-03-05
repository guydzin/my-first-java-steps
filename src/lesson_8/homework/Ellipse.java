package lesson_8.homework;

public class Ellipse extends Circle {
    double r2;
    public Ellipse(double r,double r2, String name) {
        super(r, name);
        this.r2 = r2;
    }

    @Override
    public void getPerimeter() {
        perimeter = 2*Math.PI * Math.sqrt((r*r + r2*r2)/2);
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }
}
