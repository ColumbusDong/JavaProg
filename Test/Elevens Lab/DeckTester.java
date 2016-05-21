/*
Programmer: Columbus Dong
Assignment: Elevens Lab Activity 2: Deck Tester
Date: April 13, 2015
*/

public class DeckTester
{
    public static void main(String args[])
    {
        /*Activity 2*/
        String[] ranks = {"Jack", "Queen", "King"};
        String[] suits = {"Blue", "Red"};
        int[] values = {11, 12, 13};

        Deck d = new Deck(ranks, suits, values);

        for (int i = 1; i <= 4; i++)
        {
            d.deal();
        }

        System.out.println(d);
    }
}

/*Output
Size = 2
Undealt Cards: 
Queen of Blue (Point Value = 12), Jack of Blue (Point Value = 11)

Dealt Cards: 
King of Red (Point Value = 13)  Queen of Red (Point Value = 12) 
Jack of Red (Point Value = 11)  King of Blue (Point Value = 13)
*/