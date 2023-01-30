package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
          Random random = new Random();
            //card.setValue(insert call to random number generator here)
             card.setValue(random.nextInt(13) + 1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
              card.setSuit(Card.SUITS[random.nextInt(4)]);
               
               hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        Scanner kb = new Scanner(System.in);
        System.out.print("please enter a value between 0 to 12): ");
        int value = kb.nextInt();
        System.out.print("please enter a value from 0 t0 3: ");
        int suit = kb.nextInt();

        
         boolean found = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == value && hand[i].getSuit().equals(Card.SUITS[suit])) {
                found = true;
                break;
            }
        }
        if (found) {
            printInfo();
        } else {
            System.out.println("card was not found");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    // I'm done
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Isra, but you can call me Ishrah, Isra or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- to get good grades, get a degree from a university");
        System.out.println("--to be able an engineer one day");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- soccer");
        System.out.println("-- tennis");
        System.out.println("-- video games");
        System.out.println("-- mixing music");

        System.out.println();
        
    
    }

}
