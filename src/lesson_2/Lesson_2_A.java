package lesson_2;

public class Lesson_2_A {
    public static void main(String[] args) {
        //boolean b = true;
        //b = 5==4;
        //System.out.println(4/0);
        //System.out.println(4/0.0);
        //System.out.println(i+=0.0/0.0);
        //int i = 5;
        //System.out.println(i+=5);


//        boolean b = 4>5;
//        boolean a = true;
//        boolean c = false;
//        boolean e = a & c;

        int sideA = 9;
        int sideB = 1;
        int sideC = 9;

        if (sideA == sideB && sideA == sideC) {
            System.out.println("Треугольник является равносторонним");
        } else if (sideA != sideB && sideB != sideC && sideA != sideC) {
            System.out.println("Треугольник является разносторонним");
        } else {
            System.out.println("Треугольник является равнобедренным");
        }
    }

    //Операторы математики
    //+ - * / %

    //Знак инвертирования
    //!

    //Дополнительные мат. операторы
    // ++ -- += -= *= -= /= %=

    //Есть постфиксная запись, например i++ значит сначала выполнить, потом прибавить
    //Есть префиксная запись, например ++i значит сначала прибавить, потом выполнить

    //Логические операторы
    // == проверка на равенство
    //!= проверка на неравенство
    // | || & &&
    // || - если левая часть истина, то правое уже не вычисляется
    // && - если левая часть истина, то правое уже не вычисляется
}
