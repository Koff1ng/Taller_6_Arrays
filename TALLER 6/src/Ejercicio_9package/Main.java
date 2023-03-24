package Ejercicio_9package;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int cardCount = 0;
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

       
        Hand playerHand = new Hand();
        playerHand.addCard(deck.deal());
        playerHand.addCard(deck.deal());
        System.out.println("Tu mano: " + playerHand.toString() + "\n");

       
        int playerPoints = playerHand.getScore();

        while (cardCount < 5 && playerPoints < 21) {
            System.out.print("¿Quieres tomar otra carta? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            System.out.println();

            if (respuesta.equals("s")) {
                Card newCard = deck.deal();
                playerHand.addCard(newCard);
                System.out.println("Tomaste una carta: " + newCard.getName(0) + " de " + newCard.getSuit(0) + "\n");
                playerPoints = playerHand.getScore();
                System.out.println("Tu mano: " + playerHand.toString() + "\n");
            } else {
                break;
            }
        }

  

        
        System.out.println("Tienes " + playerPoints + " puntos\n");

       
        if (playerPoints > 21) {
            System.out.println("¡Te pasaste de 21! Pierdes.");
            System.exit(0);
        }

        
        Hand dealerHand = new Hand();
        dealerHand.addCard(deck.deal());
        dealerHand.addCard(deck.deal());
        System.out.println("La carta visible del crupier es: " + dealerHand.getName() + " de " + dealerHand.getName()+ "\n");

       
        int dealerPoints = dealerHand.getScore();
        while (dealerPoints < 16) {
            Card newCard = deck.deal();
            dealerHand.addCard(newCard);
            System.out.println("El crupier toma una carta: " + newCard.getName(0) + " de " + newCard.getSuit(0) + "\n");
            dealerPoints = dealerHand.getScore();
        }
        scanner.close();
    }
  
}

        
        