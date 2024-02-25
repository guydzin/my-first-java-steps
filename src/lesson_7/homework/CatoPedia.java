package lesson_7.homework;

public class CatoPedia {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик","Черепаховый");
        Cat cat2 = new Cat("Белый");
        Cat cat3 = new Cat("Джошуа", 10, "Чёрный");

        cat1.showCatsInfo();
        cat2.showCatsInfo();
        cat3.showCatsInfo();

        cat1.meow();
        cat2.meow();
        cat3.meow();

        cat1.feedTheCat(5);
        cat2.feedTheCat(20);
        cat3.feedTheCat(-7);

    }
}
