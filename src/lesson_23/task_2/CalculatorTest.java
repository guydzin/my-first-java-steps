package lesson_23.task_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldDoSimpleDivision() {
        int a = 100;
        int b = 10;
        int expectedResult = 10;

        int actualResult = calculator.division(a, b);

        assertEquals(expectedResult, actualResult, "Метод работает некорректно");
    }

    @Test
    void shouldCatchNullDivision(){

//        Executable executable = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                calculator.division(10,0);
//            }
//        };

        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, ()->calculator.division(1000,0), "Исключение почему-то не выброшено");
        assertEquals("Делитель не может быть нулём", arithmeticException.getMessage());
    }
}