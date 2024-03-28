package lesson_18.task_3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("./out/2.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.lines().count());
        System.out.println(bufferedReader.lines());

        Writer writer = new FileWriter("./out/3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Hello world494949649696");
        bufferedWriter.close();
    }
}
