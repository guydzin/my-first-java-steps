package blackJack;

public class Card {
    protected String suit;
    protected int value;

    public void open(){
        System.out.println(suit);
    }

    public Card(String suit,int value){
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit+" "+value;
    }
}