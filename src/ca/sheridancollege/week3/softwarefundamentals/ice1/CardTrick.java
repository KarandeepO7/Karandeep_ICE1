package pickacard;
import java.util.Random; 
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Karandeep
 Date- 24-05-2022
 */
public class CardTrick {

public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card[] magicHand = new Card[7]; //array of 7 cards
        Random ran = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
        for (int i=0; i<magicHand.length; i++){
            
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue(ran.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }
        }                                                   //End of the For Loop


        boolean found = false;
        //(hard-coded) Card Object called luckyCard 

         boolean found = false;
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[4]);
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[2]);

        // loop to determine and search if the luckycard is present in the magicHand 
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                
                found =true;
                break;
            }
         }
         }                                                  //End of For Loop

        //Then report the result here

        if(found)
            System.out.println("HEY! YOU ARE LUCKY, YOUR CARD IS FOUND IN THE MAGIC HAND");
        else
            System.out.println("YOUR CARD IS NOT THERE YOU LOOSE");
    }
         }       //End of the Main Class

}
}               //End of the CardTrick.java class
