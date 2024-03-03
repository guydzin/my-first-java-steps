package lesson_8.part_1;

//Принципы ООП
/*
Инкапсуляция - сокрытие внутренних данных от внешнего пользователя через модификаторы доступа
Наследование - переиспользование своиств родительского объекта в экземплярах дочернего
Полиморфизм - способность программы работать с интерфейсом без указания типа объекта
Абстракция - возможность создания абстрактных классов и методов в качестве шаблонов для объектов
 */
public class Lesson_8 {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "15");
        Pupil pupil = new Pupil("Adam","14");
        Student student = new Student("John", "21");

        person.printInfo();
        pupil.printInfo();
        student.printInfo();
        System.out.println(student.sex);
    }
}
