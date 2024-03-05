package lesson_9.homework;

abstract class Figure {
    double a;
    double b;
    double c;
    double d;
    double r;
    String name;
    double perimeter;

    public Figure(double a, double b, double c, double d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
    }

    public Figure(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public Figure(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public abstract void getPerimeter ();
}
