package Ejercicio_9package;
import java.util.Random;

public class Deck {
    private Card[] cardArray;
    private int topCardIndex;

    public Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        cardArray = new Card[suits * cardType];
        for(int i = 1; i <= suits; i++) {
            for(int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
        topCardIndex = 0;
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int index = rnd.nextInt(cardArray.length - i) + i;
            Card temp = cardArray[i];
            cardArray[i] = cardArray[index];
            cardArray[index] = temp;
        }
        topCardIndex = 0;
    }

    public Card deal() {
        if (topCardIndex >= cardArray.length) {
            System.out.println("No more cards in the deck!");
            return null;
        }
        Card card = cardArray[topCardIndex];
        topCardIndex++;
        return card;
    }

    public void print() {
        for(int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}