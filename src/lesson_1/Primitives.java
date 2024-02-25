package lesson_1;

public class Primitives {
    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.printf("Минимальное значение int: %d\n", minInt);
        System.out.printf("Максимальное значение int: %d\n", maxInt);
        System.out.printf("Минимальное значение long: %d\n", minLong);
        System.out.printf("Максимальное значение long: %d\n", maxLong);
        System.out.printf("Минимальное значение double: %f\n", minDouble);
        System.out.printf("Максимальное значение double: %f\n", maxDouble);
        System.out.printf("Минимальное значение short: %d\n", minShort);
        System.out.printf("Максимальное значение short: %d\n", maxShort);
        System.out.printf("Минимальное значение byte: %d\n", minByte);
        System.out.printf("Максимальное значение byte: %d\n", maxByte);
        System.out.printf("Минимальное значение float: %f\n", minFloat);
        System.out.printf("Максимальное значение float: %f\n", maxFloat);
    }
}