/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random; 
/*
 * Name: Karandeep
 Date-24-05-2022
 */
package pickacard;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * @author Karandeep
    Date- 02-02-2023
 */
public class CardTrick {

public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
public class Card {

        Random ran = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
    private String suit;                //clubs, spades, diamonds, hearts
    private String suit;                // Suit includes clubs, spades, diamonds, hearts
   private int value;                   //1-13

            //c.setValue(insert call to random number generator here)
            c.setValue(ran.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[ran.nextInt(4)]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

        // and search magicHand here
    }           //End of the Card.java class

        //Then report the result here

    }

}  
}