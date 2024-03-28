package lesson_17.task_4;

import lesson_17.task_1.ICopyUtils;

public class Main {
    public static void main(String[] args) {
        ICopyUtils copyWithNIO = new CopyWithNIO();
        long start = System.currentTimeMillis();
        copyWithNIO.copy("C:\\Users\\ddorodov\\Downloads\\misc\\skala-vdi-client-R.EXE", "1.txt");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
