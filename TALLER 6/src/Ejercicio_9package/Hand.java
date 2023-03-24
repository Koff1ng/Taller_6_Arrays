package Ejercicio_9package;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int score;

    public Hand() {
        cards = new ArrayList<Card>();
        score = 0;
    }

    public void deal(Card card) {
        cards.add(card);
        score += card.getPoints(getName());
    }

    public String getName() {
        String name = "";
        for (Card card : cards) {
            name += card.getName(score) + ", ";
        }
        return name.substring(0, name.length() - 2);
    }

    public void addCard(Card card) {
        cards.add(card);
        score += card.getPoints(getName());
    }

    public int getScore() {
        int score = this.score;
        for (Card card : cards) {
            if (card.getName(score).equals("Ace") && score <= 11) {
                score += 10;
            }
        }
        return score;
    }
}
