package lesson_23.task_1;

public class DiscountCalculator {
    public int sumAfterDiscount(int sum) {
        if (sum < 1000) {
            return sum;
        } else {
            return (int) (sum * 0.98);
        }
    }

    public boolean test(){
        return true;
    }
}