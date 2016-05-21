/*
Programmer: Columbus Dong
Assignment: Elevens Lab Activity 2: Deck
Date: April 13, 2015
*/

import java.util.List;
import java.util.ArrayList;

public class Deck
{
    /*Instance Variables*/
    private List<Card> cards;   //Contains all cards in deck;
    private int size;           //Size of deck, i.e. undealt cards

    /*Regular Constructor*/
    /*
        Descriptions:   Makes every type of card with the given ranks, suits, and values
        @param  ranks   Array containing all the card ranks
        @param  suits   Array containing all the card suits
        @param  values  Array containing all the card values
    */
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        /*Activity 2*/

        /*Card Array List*/
        cards = new ArrayList<Card>();

        for (int s = 0; s < suits.length; s++)  //Suits
        {
            for (int r = 0; r < ranks.length; r++)  //Ranks
            {
                cards.add(new Card(ranks[r], suits[s], values[r])); //Adds the card
                size++; //Increase Size by 1
            }
        }

        shuffle();  //Shuffle the deck
    }

    /*
        Description: Check if the deck is empty
        @return T/F     Returns true if deck is empty
    */
    public boolean isEmpty()
    {
        /*Activity 2*/
        return size == 0;
    }      

    /*
        @return int     Returns the number of undealt cards
    */
    public int size()
    {
        /*Activity 2*/
        return size;
    }

    /*
        Description: Shuffle the cards and reset size to the entire deck.
    */
    public void shuffle()
    {
        /*Activity 4*/
    }

    /*
        @return card    Returns the card just dealt or null if all cards have been dealt
    */
    public Card deal()
    {
        /*Activity 2*/

        //If deck is empty
        if (size == 0)
        {
            return null;            //Return Null
        }
        else
        {
            size--;
            return cards.get(size); //Return Last Card
        }
    }

    /*Output*/
    @Override
    public String toString()
    {
        String rtn = "Size = " + size + "\nUndealt Cards: \n";

        for (int k = size - 1; k >= 0; k--)
        {
            rtn += cards.get(k);

            if (k != 0)
            {
                rtn += ", ";
            }

            if ((size - k) % 2 == 0)
            {
                rtn += "\n";
            }
        }

        rtn += "\nDealt Cards: \n";

        for (int k = cards.size() - 1; k >= size; k--)
        {
            rtn += cards.get(k);

            if (k != size)
            {
                rtn += "\t";
            }

            if ((k - cards.size()) % 2 == 0)
            {
                rtn += "\n";
            }
        }

        rtn += "\n";

        return rtn;
    }



}