package lesson_18.task_2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("out\\out3\\out2\\newfile.txt");
//        System.out.println(file.mkdirs());
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}