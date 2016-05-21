/*
Programmer: Columbus Dong
Assignment: Elevens Lab Activity 1: Card Tester
Date: April 13, 2015
*/

public class CardTester
{
    public static void main(String[] args) 
    {
        /*Activity 1*/
        /*Card Objects*/
        Card card1 = new Card("Ace", "Spades", 1);
        Card card2 = new Card("Jack", "Hearts", 10);
        Card card3 = new Card("King", "Diamonds", 10);
        
        /*Print Cards*/
        System.out.println(card1 + "\n" + card2 + "\n" + card3);
    }
}

/*Output
Ace of Spades (Point Value = 1)
Jack of Hearts (Point Value = 10)
King of Diamonds (Point Value = 10)
*/