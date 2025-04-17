package sandbox;

import java.io.*;

public class Sample_3 {
    public static void main(String[] args) {
        String outputFileName = "File.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName))){
                String line;

                while (!(line = bufferedReader.readLine()).equals("exit")){
                    bufferedWriter.write(line);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
