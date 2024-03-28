package lesson_17.task_4;

import lesson_17.task_1.ICopyUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class CopyWithNIO implements ICopyUtils {
    @Override
    public void copy(String from, String to) {
        Path pathFROM = Paths.get(from);
        Path pathTo = Paths.get(to);

        try{
            Files.copy(pathFROM, pathTo);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
