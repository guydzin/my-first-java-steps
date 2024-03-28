package lesson_17.task_1;

public class Main {

    public static void main(String[] args) {
        ICopyUtils ICopyUtils = new CopyWithIO();
        long start = System.currentTimeMillis();
        ICopyUtils.copy("C:\\Users\\ddorodov\\Downloads\\misc\\skala-vdi-client-R.EXE", "./out/1.txt");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
