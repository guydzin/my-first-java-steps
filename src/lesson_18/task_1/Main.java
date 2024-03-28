package lesson_18.task_1;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File file = new File("out");
        System.out.println(file.exists());

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return file.getName().endsWith(".txt");
            }
        });

        for (File file1: files){
            System.out.println(file1.getName());
        }
    }
}