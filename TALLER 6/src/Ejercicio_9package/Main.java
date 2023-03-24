package Ejercicio_9package;import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Deck deck = new Deck();
        deck.shuffle(); // mezcla el mazo
        deck.print();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // repartir dos cartas a cada mano
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        // mostrar cartas al usuario
        System.out.println("Tus cartas son:");
        playerHand.print();
        System.out.println("Tienes " + playerHand.getPoints() + " puntos.");

        // preguntar si quiere otra carta
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("¿Quieres otra carta? (s/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                Card card = deck.dealCard();
                playerHand.addCard(card);
                System.out.println("Tu carta es: " + card);
                System.out.println("Tienes " + playerHand.getPoints() + " puntos.");
                if (playerHand.getPoints() > 21) {
                    System.out.println("Te has pasado de 21 puntos.");
                    break;
                } else if (playerHand.getPoints() == 21) {
                    System.out.println("Tienes 21 puntos.");
                    break;
                }
            } else {
                break;
            }
        }

        // jugar mano del crupier
        while (dealerHand.getPoints() < 16) {
            Card card = deck.dealCard();
            dealerHand.addCard(card);
            System.out.println("Carta del crupier: " + card);
        }
        System.out.println("La mano del crupier es:");
        dealerHand.print();
        System.out.println("El crupier tiene " + dealerHand.getPoints() + " puntos.");

        // determinar ganador
        int playerPoints = playerHand.getPoints();
        int dealerPoints = dealerHand.getPoints();
        if (playerPoints > 21) {
            System.out.println("El crupier gana. Te has pasado de 21 puntos.");
        } else if (dealerPoints > 21) {
            System.out.println("Tú ganas. El crupier se ha pasado de 21 puntos.");
        } else if (playerPoints == 21) {
            if (dealerPoints == 21) {
                System.out.println("Empate.");
            } else {
                System.out.println("Tú ganas con 21 puntos.");
            }
        } else if (dealerPoints == 21) {
            System.out.println("El crupier gana con 21 puntos.");
        } else if (playerPoints > dealerPoints) {
            System.out.println("Tú ganas con " + playerPoints + " puntos.");
        } else if (dealerPoints > playerPoints) {
            System.out.println("El crupier gana con " + dealerPoints + " puntos.");
        } else {
            System.out.println("Empate.");
        }
    }
}