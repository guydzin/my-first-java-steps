package lesson_17.task_5;

import lesson_17.task_1.ICopyUtils;

public class Main {
    public static void main(String[] args) {
        ICopyUtils CopyWithApache = new CopyWithApache();
        long start = System.currentTimeMillis();
        CopyWithApache.copy("C:\\Users\\ddorodov\\Downloads\\misc\\skala-vdi-client-R.EXE", "1.txt");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
