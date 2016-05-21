/*Programmer: Columbus
Date: February 9, 2015
Assignment: RPS
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class playRPS
{
    public static void main(String args[])
    {
        /*Variables*/
        String p1Name;
        String response;
        int rounds;

        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        /*Player*/
        Player play;

        /*Prompt For User Name*/
        System.out.print("Enter Player Name: ");
        p1Name = Input.nextLine();

        /*Prompt For Rounds*/
        System.out.print("How many rounds? ");
        rounds = Input.nextInt();

        /*Clear BlueJ Screen*/
        System.out.print('\u000C'); 

        play = new Player(p1Name, rounds);
    }
}

/*Output:
Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] 1
Columbus chose Rock
Computer chose Paper
Computer Won!
 Current Scores: Columbus: 0
 Current Scores: Computer: 1

Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] 2
Columbus chose Paper
Computer chose Rock
Columbus Won!
 Current Scores: Columbus: 1
 Current Scores: Computer: 1

Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] 3
Columbus chose Scissors
Computer chose Paper
Columbus Won!
 Current Scores: Columbus: 2
 Current Scores: Computer: 1

Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] 1
Columbus chose Rock
Computer chose Paper
Computer Won!
 Current Scores: Columbus: 2
 Current Scores: Computer: 2

Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] 2
Columbus chose Paper
Computer chose Scissors
Computer Won!
 Current Scores: Columbus: 2
 Current Scores: Computer: 3



Computer wins the game!
 */