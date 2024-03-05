package lesson_9.homework;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"Круг");
        Ellipse ellipse = new Ellipse(200,20,"Эллипс");
        Ellipse ellipse1 = new Ellipse(200,20,"Эллипс");


        circle.getPerimeter();
        ellipse.getPerimeter();
        ellipse1.getPerimeter();

        System.out.println(ellipse);
        System.out.println(ellipse.hashCode() == ellipse1.hashCode());
        System.out.println(ellipse.equals(ellipse1));

    }
}