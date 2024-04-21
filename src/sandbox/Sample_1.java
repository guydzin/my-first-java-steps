package sandbox;

public class Sample_1 {
    public static void main(String[] args) {
//        int a = 0;
//        int x = a++;
//        //System.out.println(x+++x--);
//        System.out.println(x);
        int x = -2147483648;
        String binaryString = Integer.toBinaryString(x);
        System.out.println(binaryString);
        int i = 0;
        for (char y: binaryString.toCharArray()){
            i++;
        }
        System.out.println(i);
    }
}