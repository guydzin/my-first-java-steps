package lesson_3;

public class Lesson_3_C {
    public static void main(String[] args) {

        int[] array = new int[9];
        String [] array2 = new String[10];

        int [] a = {1,20,222,49797,544,664599,11,2,9,8,7,1,23,0};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int [] array1 = new int [10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 50 + 5 * i;
            System.out.println(array1[i]);
        }
    }
}
