package lesson_7.homework;

/*
Домашнее задание к занятию 7:

Создать класс, описывающий кота.
У кота должно быть имя, возраст и цвет.

Не должно быть прямого доступа к полям класса,
только через геттеры и сеттеры.

Не должно быть возможности создать кота совсем без параметров
(не бывает котов с никаким цветом, например).

Должна быть возможность создать кота со всеми параметрами сразу.

Должна быть возможность создать кота только с цветом
(увидели где-то незнакомого кота).

Должна быть возможность создать кота с цветом и именем
(приютили кота с улицы, имя дали, а возраст не знаем).

Кот должен уметь выводить полную информацию о себе в консоль,
примерно как делали с банковским аккаунтом, при этом если
какой-то параметр неизвестен (например, возраст),
то информация об этом параметре не выводится.

Кот должен уметь мяукать.

Кота должно быть можно покормить определённым количеством еды.
Если количество еды 10 или больше, вывести в консоль, что кот сытый,
иначе вывести в консоль, что кот всё ещё голодный, причём в выводе
информации в консоль должно присутствовать имя кота (если мы его знаем).

Создать второй класс с точкой входа и продемонстрировать в нём возможности кота.
 */
public class Cat {
    private String name;
    private int age;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Cat(String colour) {
        this.colour = colour;
    }

    public void showCatsInfo() {
        if (getName() == null & getAge() == 0) {
            System.out.printf("Привет! Я знаю, что я кот, но как меня зовут я не знаю. Я не знаю сколько мне лет, но я знаю свой цвет - я %s\n", getColour());
        } else if (getAge() == 0) {
            System.out.printf("Привет! Я кот, меня зовут %s. Я не знаю сколько мне лет, но я знаю свой цвет - я %s\n", getName(), getColour());
        } else {
            System.out.printf("Привет! Я кот, меня зовут %s. Мне %S лет, и я знаю свой цвет - я %s\n", getName(), getAge(), getColour());
        }
    }

    public void meow() {
        System.out.printf("%s кот говорит \"Мяу\"!\n", getColour());
    }

    public void feedTheCat(int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Нужно ввести корректное количество еды\n");
        } else if (foodAmount > 10) {
            System.out.printf(getName()!=null?"%s уже сытый\n":"Безымянный кот уже сытый\n", getName());
        } else {
            System.out.printf(getName()!=null?"%s еще голодный\n":"Безымянный кот еще голодный\n", getName());
        }
    }
}
