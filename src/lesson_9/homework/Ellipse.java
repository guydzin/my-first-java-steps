package lesson_9.homework;

import java.util.Objects;

public class Ellipse extends Circle {
    double r2;
    public Ellipse(double r, double r2, String name) {
        super(r, name);
        this.r2 = r2;
    }

    @Override
    public void getPerimeter() {
        perimeter = 2*Math.PI * Math.sqrt((r*r + r2*r2)/2);
        System.out.printf("Фигура - %s. Её периметр равен - %.2f\n", name, perimeter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse ellipse)) return false;
        return Double.compare(r2, ellipse.r2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r2);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                '}';
    }
}