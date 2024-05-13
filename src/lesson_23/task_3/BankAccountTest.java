package lesson_23.task_3;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    static BankAccount account;
    static String firstname;
    static String lastname;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Запуск блока перед всеми тестами");
        Path path = Paths.get("names.txt");
        try {
            firstname = Files.readAllLines(path).get(0);
            lastname = Files.readAllLines(path).get(1);
        } catch (IOException e) {
            throw new FileSystemNotFoundException("Файл с именами не найден");
        }
    }


    @BeforeEach
    public void beforeEach(){
        account = new BankAccount(firstname, lastname);
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Запуск блока после всех тестов");
    }

    @AfterEach
    public void afterEach(){

    }

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        account.activate("RUB");
        assertEquals(0, account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled(){
        account.block();
        assertTrue(account.isBlocked());
    }


    @Test
    public void shouldReturnFirstNameThenSecondName (){
        assertArrayEquals(new String[]{firstname,lastname}, account.getFullName());
    }


    @Test
    public void shouldReturnNullAmountWhenNotActive(){
/*
        final IllegalStateException exception = assertThrows(IllegalStateException.class,new Executable() {
            @Override
            public void execute() {
                account.getAmount();
            }
        });
*/
        final IllegalStateException exception = assertThrows(IllegalStateException.class,()->account.getAmount());
        assertEquals("Счёт не активирован.", exception.getMessage());
        assertNull(account.getCurrency());
    }
}