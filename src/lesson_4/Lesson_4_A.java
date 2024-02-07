package lesson_4;

public class Lesson_4_A {
    public static void main(String[] args) {
        char [] qwerty = "qwerty".toCharArray();
        char [] abcdef = "abcdef".toCharArray();
        char [] newArray = new char[qwerty.length+abcdef.length];

        for (int i = 0; i <=(qwerty.length+abcdef.length-1) ; i++) {
            if (i<qwerty.length){
                newArray[i] = qwerty[i];
            }
            else {
                newArray[i] = abcdef[i-abcdef.length];
            }
            System.out.printf("%s,",newArray[i]);
        }
    }
}
