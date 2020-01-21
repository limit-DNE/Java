public class Card {

    private char suit;
    private String value;

    protected Card(char suit, String value){
        setSuit(suit);
        setValue(value);
    }

    public char getSuit(){
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return getSuit() + " " + getValue();
    }
}
