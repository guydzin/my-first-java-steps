package lesson_1;


public class Main {
    //примитивные типы
    //целочисленные
    int a;
    short b;
    byte c;
    long d;
    char q;

    //дробные
    float f;
    double w;

    //логический
    boolean j;

    //ссылочные типы
    String e;
//    задача
//       * длмна комнаты -12 метров , ширина комнаты - 7 метров
//       * длина стола 3 метра, ширина стола - 2 метра
//       * сколько столов войдет в комнату

    public static void main(String[] args) {

        int roomWight = 7;
        int roomLength = 12;
        int tableLength = 3;
        int tableWight = 2;
        int tablesAtLength;
        int tablesAtWight;
        boolean b = false;

        tablesAtLength = roomLength / tableLength;
        tablesAtWight = roomWight / tableWight;

        System.out.println("Всего столов войдет "+tablesAtLength*tablesAtWight);
        System.out.println(b);
    }
}