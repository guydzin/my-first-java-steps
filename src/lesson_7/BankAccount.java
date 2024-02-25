package lesson_7;


import java.util.Arrays;

/**
 * Класс для банковского аккаунта
 */
public class BankAccount {

    private History [] histories = new History[10];
    private int historyCount = 0;

    /**
     * ИД клиента
     */
    private int clientId;
    /**
     * Имя клиента
     */
    private String clientName;
    /**
     * Сумма на счету
     */
    private double clientMoneyAmount;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getClientMoneyAmount() {
        return clientMoneyAmount;
    }

    public void setClientMoneyAmount(double clientMoneyAmount) {
        this.clientMoneyAmount = clientMoneyAmount;
    }

    /**
     * Это конструктор
     */
    public BankAccount(int clientId, String clientName) {
        if (clientId <= 0) {
            System.out.println("Некорректный ИД клиента");
            return;
        }
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientMoneyAmount = 1000;
    }

    public BankAccount() {

    }

    public void printInfo() {
        System.out.printf("Счет номер - %d; Имя клиента - %s; Остаток по счету - %.2f рублей\n", clientId, clientName, clientMoneyAmount);
    }

    public void addMoney(int money) {
        clientMoneyAmount = clientMoneyAmount + money;
        System.out.printf("На счет - %d успешно зачислены средства в размере %d рублей. Остаток по счету -  %.2f рублей\n", clientId, money, clientMoneyAmount);
        histories[historyCount] = new History("Пополнение счета на сумму "+money+" рублей", money, clientId);
        historyCount++;
    }

    public boolean getMoney(int money) {
        if (clientMoneyAmount < money) {
            System.out.println("Недостаточно средств");
            return false;
        }
        clientMoneyAmount = clientMoneyAmount - money;
        System.out.printf("Со счета - %d успешно снято %d рублей. Остаток по счету %.2f рублей\n", clientId, money, clientMoneyAmount);
        histories[historyCount] = new History("Снятие со счета на сумму "+money+" рублей", money, clientId);
        historyCount++;
        return true;
    }

    public void sendMoney(BankAccount bankAccount, int money) {
        if (getMoney(money)){
            bankAccount.addMoney(money);
            System.out.printf("Cо счета %d переведена на счет %d сумма %d рублей\n", clientId, bankAccount.clientId, money);
        }
    }
    public void printHistory(){
        for (int i = 0; i < historyCount; i++) {
            if (histories[i]!=null){
                System.out.printf("%s\n", histories[i].toString());
            }
        }
    }
}