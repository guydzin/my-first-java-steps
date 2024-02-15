package lesson_6;

import java.sql.Array;

public class Homework_6_Helper {
    protected double triangleSquare(int a, int b, int c) {
        int p = (a + b + c) / 2;
        double s = (Math.sqrt((p - a) * (p - b) * (p - c)));
        return s;
    }

    protected int vowels(String s) {
        int vowelsResultSet = 0;
        char[] arrayIn = s.toCharArray();
        char[] vowelsPattern = "аеёиоуэыюяАЕЁИОУЭЫЮЯ".toCharArray();
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < vowelsPattern.length; j++) {
                if(arrayIn[i] == vowelsPattern[j]){
                    vowelsResultSet++;
                }
            }
        }
        return vowelsResultSet;
    }

    protected StringBuilder rhombus (int length){
        int[][] newArrayTwo = new int[length][length];
        StringBuilder rhombus = new StringBuilder();

        if (length % 2 == 0) {
            System.out.println("Массив должен быть нечетным");
        }

        else {
            for (int m = 0; m < newArrayTwo.length; m++) {
                for (int l = 0; l < newArrayTwo.length; l++) {
                    if (l==((length-1)/2)-m||l==((length-1)/2)+m){
                        newArrayTwo[m][l]=1;
                    }
                    rhombus.append(String.format("%s ",newArrayTwo[m][l]));
                }
                rhombus.append("\n");
            }
        }
        return rhombus;
    }

    protected StringBuilder twoDimArray (int [] [] twoDimArray){
        StringBuilder array = new StringBuilder();
        for (int m = 0; m < twoDimArray.length; m++) {
            for (int l = 0; l < twoDimArray[0].length; l++) {
                array.append(String.format("%s ",twoDimArray[m][l]));
            }
            array.append("\n");
        }
        return array;
    }
}