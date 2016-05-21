/*
Programmer: Columbus Dong
Date: February 23, 2015
Assignment: Very Busy Jailer
*/
import java.util.Random;
import java.util.Arrays;

public class Jailer
{
    public static void main(String args[])
    {
        /*int Array*/
        int[] keyTurn = new int[1000];

        /*1 is Unlocked*/
        /*-1 Is Locked*/
        /*Set All 1000 Values as 1*/
        Arrays.fill(keyTurn, 0, 1000, 1); //Fill Array Indexes from 0 to 999 with Value of 1

        /*Turn Keys*/
        for (int i = 1; i <= keyTurn.length - 1; i++)
        {
            /*The Key Turning*/
            for (int y = 2; y <= keyTurn.length; y++)
            {
                if ((i + 1) % y == 0)
                {
                    keyTurn[i] *= -1;
                }
            }
        }

        /*Print*/
        String output = "The Free Prisoners are: \n";
        int spaceSkip = 1;
        
        for (int x = 0; x <= keyTurn.length - 1; x++)
        {
            /*Remember 1 is Unlocked*/
            if (keyTurn[x] == 1)
            {
                output += (x + 1) + "\t";
                
                if (spaceSkip % 5 == 0)
                {
                    output += "\n";
                }
            }
            
            
            spaceSkip++;
        }

        output += "\nOr.................................\nAll the prisoners are free because\nthey stormed the jailer when he\nfirst unlocked the doors!";
        System.out.println(output);
    }
}

/*
Output:
The Free Prisoners are: 
1	4	9	16	25	
36	49	64	81	100	
121	144	169	196	225	
256	289	324	361	400	
441	484	529	576	625	
676	729	784	841	900	
961	
Or.................................
All the prisoners are free because
they stormed the jailer when he
first unlocked the doors!
 */