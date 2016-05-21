
public class DeckTester
{
    public static void main(String args[])
    {
        /*Activity 2*/
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

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
