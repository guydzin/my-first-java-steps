package lesson_7;

public class Lesson_7 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1,"Dima");
        BankAccount bankAccount2 = new BankAccount(2,"Max");
        BankAccount bankAccount3 = new BankAccount(3,"John");

        bankAccount1.printInfo();
        bankAccount2.printInfo();
        bankAccount3.printInfo();

        bankAccount1.addMoney(500);
        bankAccount2.addMoney(1000);
        bankAccount3.addMoney(725);

        bankAccount1.getMoney(175);
        bankAccount2.getMoney(300);
        bankAccount3.getMoney(200);

        bankAccount2.sendMoney(bankAccount1,549);

        bankAccount1.printInfo();
        bankAccount2.printInfo();
        bankAccount3.printInfo();

        bankAccount2.printHistory();

    }
}