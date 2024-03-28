package lesson_17.homework;

import com.google.common.io.Files;
import lesson_17.task_1.ICopyUtils;

import java.io.File;
import java.io.IOException;


public class CopyWithGuava implements ICopyUtils {

    @Override
    public void copy(String from, String to) {

        File fileFrom = new File(from);
        File fileTo = new File(to);

        try {
            Files.copy(fileFrom, fileTo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals (String from, String to) throws IOException {
        File fileFrom = new File(from);
        File fileTo = new File(to);

        boolean result = Files.equal(fileFrom, fileTo);
        return result;
    }
}
