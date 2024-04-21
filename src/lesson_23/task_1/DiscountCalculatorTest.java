package lesson_23.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscount() {
        //arrange
        int buySum = 999;
        int expectedSum = 999;

        //act
        int resultedSum = discountCalculator.sumAfterDiscount(buySum);

        //assert
        assertEquals(expectedSum, resultedSum, "Метод работает некорректно");
    }

    @Test
    public void shouldGiveDiscount() {
        //arrange
        int buySum = 1000;
        int expectedSum = 980;

        //act
        int resultedSum = discountCalculator.sumAfterDiscount(buySum);

        //assert
        assertEquals(expectedSum, resultedSum, "Метод работает некорректно");
    }

    @Test
    public void shouldBeTrue(){
        boolean result = discountCalculator.test();
        assertTrue(result, "Метод работает некорректно");
    }
}