package lesson_17.task_3;

import java.io.RandomAccessFile;

public class RandomFile {
    public static void main(String[] args) {
        try{
            RandomAccessFile rf = new RandomAccessFile("./out/3.txt", "rw");
// Записать в файл 10 чисел и закрыть файл
            for(int i = 0; i < 10; i++)
                rf.writeDouble(i * 1.414);
            rf.close();
// Открыть файл, записать в него еще одно число и снова закрыть
            rf = new RandomAccessFile("./out/rtest.dat", "rw");
            rf.seek(5 * 8);
            rf.writeDouble(47.0001);
            rf.close();
// Открыть файл с возможностью только чтения "r"
            rf = new RandomAccessFile("./out/rtest.dat", "r");
// Прочитать 10 чисел и показать их на экране
            for(int i = 0; i < 10; i++)
                System.out.println("Value " + i + ": " + rf.readDouble());
            rf.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}