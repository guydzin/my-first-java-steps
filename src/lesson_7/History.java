package lesson_7;

public class History {

    @Override
    public String toString() {
        return String.format("%s. Номер счета - %s", getOperationName(),getId());
    }
    private String operationName;
    private int money;
    private int id;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public History(String operationName,int money,int id){
        this.operationName = operationName;
        this.money = money;
        this.id = id;
    }

    public History(String operationName, int money) {
        this.operationName = operationName;
        this.money = money;
    }
}
