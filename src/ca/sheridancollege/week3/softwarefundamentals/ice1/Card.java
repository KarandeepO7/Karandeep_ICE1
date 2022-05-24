package pickacard;
import java.util.Scanner;
import java.util.Random; 
/*
 * Name: Karandeep
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Karandeep
    Date- 24-5-2022
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

        // and search magicHand here

        //Then report the result here

    }

} 