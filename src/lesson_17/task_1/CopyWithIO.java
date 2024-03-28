package lesson_17.task_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyWithIO implements ICopyUtils{
    @Override
    public void copy(String from, String to) {
        try {
            FileInputStream fis = new FileInputStream(from);
            FileOutputStream fos = new FileOutputStream(to);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int c = 0;
            byte c1 [] = {0,0,0,0,0,0,0,0,0,0};
            while (true) {
                c = bis.read(c1);
                if (c != -1)
                    bos.write(c1);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
