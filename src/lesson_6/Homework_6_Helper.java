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
                if (arrayIn[i] == vowelsPattern[j]) {
                    vowelsResultSet++;
                }
            }
        }
        return vowelsResultSet;
    }

    protected StringBuilder rhombus(int length) {
        int[][] newArrayTwo = new int[length][length];
        StringBuilder rhombus = new StringBuilder();

        if (length % 2 == 0) {
            System.out.println("Массив должен быть нечетным");
        } else {
            int startIndex = newArrayTwo.length / 2;
            int endIndex = newArrayTwo.length / 2;
            for (int i = 0; i < newArrayTwo.length; i++) {
                for (int j = 0; j < newArrayTwo[0].length; j++) {
                    if (j >= startIndex && j <= endIndex) {
                        newArrayTwo[i][j] = 1;
                    }
                }
                if (i < newArrayTwo.length / 2) {
                    startIndex--;
                    endIndex++;
                } else {
                    startIndex++;
                    endIndex--;
                }
            }

            for (int i = 0; i < newArrayTwo.length; i++) {
                for (int j = 0; j < newArrayTwo[0].length; j++) {
                    rhombus.append(String.format("%s ", newArrayTwo[i][j]));
                }
                rhombus.append("\n");
            }
        }
        return rhombus;
    }

    protected StringBuilder twoDimArray(int[][] twoDimArray) {
        StringBuilder array = new StringBuilder();
        for (int m = 0; m < twoDimArray.length; m++) {
            for (int l = 0; l < twoDimArray[0].length; l++) {
                array.append(String.format("%s ", twoDimArray[m][l]));
            }
            array.append("\n");
        }
        return array;
    }
}