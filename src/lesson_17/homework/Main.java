package lesson_17.homework;

import lesson_17.task_1.ICopyUtils;

public class Main {
    public static void main(String[] args) {
        ICopyUtils CopyWithGuava = new CopyWithGuava();
        long start = System.currentTimeMillis();
        CopyWithGuava.copy("C:\\Users\\ddorodov\\Downloads\\misc\\skala-vdi-client-R.EXE","./out/1.txt");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}