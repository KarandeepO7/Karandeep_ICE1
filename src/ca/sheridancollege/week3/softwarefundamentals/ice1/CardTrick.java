]package pickacard;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random; 
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Karandeep 
 Date-24-05-2022
 */
public class CardTrick {
    
public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random ran = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(ran.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card

        //Creating default card for the user
        Card user = new Card();
        int value;
        String suit;
        boolean found = false;
        Scanner search = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE VALUE OF CARD FROM 1 TO 13:  ");
        value = search.nextInt();
        System.out.println("PLEASE ENTER THE SUIT OF THE CARD" + Arrays.toString(Card.SUITS));
        suit = search.next();

        //setting the value and the suit for the user card
        user.setValue(value);
        user.getSuit();
        // and search magicHand here

        //(hard-coded) Card Object called luckyCard 
        Card luckycard = new Card(2);
        luckycard.setValue(value);
        luckycard.setSuit(Card.SUITS[4]);

        // loop to determine and search if the luckycard is present in the magicHand 
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue() == user.getValue() && magicHand[i].getSuit().equalsIgnoreCase(user.getSuit())){
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit())){

                found =true;
                break;
            }
         }

        //Then report the result here
        if(found)
            System.out.println("USER'S CARD IS IN THE MAGIC HAND OF RANDOM CARDS");
            System.out.println("HEY! YOU ARE LUCKY, YOUR CARD IS FOUND IN THE MAGIC HAND");
        else
            System.out.println("USER'S CARD IS NOT IN THE MAGIC HAND OF RANDOM CARDS");
            System.out.println("YOUR CARD IS NOT THERE YOU LOOSE");
    }

} 
}
