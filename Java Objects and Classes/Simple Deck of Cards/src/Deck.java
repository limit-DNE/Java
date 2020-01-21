import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private Card[] cards;

    protected Deck(){
        cards = new Card[52];
        int count = 0;
        for (char suit : new char[]{'♥', '♠', '♦', '♣'}) {
            for (String value : new String[]{"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"}){
                cards[count] = new Card(suit, value);
                count++;
            }
        }
    }

    public void shuffleDeck(){
        for (int i = 0; i < cards.length; i++){
            int randomIndex = ThreadLocalRandom.current().nextInt(0, cards.length);
            Card swap = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = swap;
        }
    }

    public void printDeck(){
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }
}
