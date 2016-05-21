/*Programmer: Columbus
Date: February 9, 2015
Assignment: RPS
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class Player
{
    /*Instance Variable*/
    private String player1Name;
    private String compName;
    private int player1Throw;
    private int round;
    private int winner;
    private int playWin;
    private int compWin;

    /*1 Player*/
    public Player(String player, int rounds)
    { 
        int counter = 1;
        player1Name = player;

        round= rounds;

        String output = "";

        Game game;
        
        while (counter <= rounds)
        {
            player1Throw = makeThrow();

            game = new Game(player1Throw);

            compName = game.getP2Name();

            winner = game.getWinner();

            output =  "" + player1Name + " chose " + game.getPlayerThrow();
            output += "\n" + compName + " chose " + game.getCompThrow();

            if (winner == 0)
            {
                output += "\nIt was a Tie";
                output += "\n Current Scores: " + player1Name + ": " + playWin;
                output += "\n Current Scores: " + compName + ": " + compWin;
            }
            else if (winner == 1)
            {
                output += "\n" + player1Name + " Won!";
                playWin++;
                output += "\n Current Scores: " + player1Name + ": " + playWin;
                output += "\n Current Scores: " + compName + ": " + compWin;

            }
            else if (winner == 2)
            {
                output += "\n" + compName + " Won!";
                compWin++;
                output += "\n Current Scores: " + player1Name + ": " + playWin;
                output += "\n Current Scores: " + compName + ": " + compWin;
            }
            System.out.println(output);

            counter++;
            System.out.println("");
        }

        if (playWin > compWin)
        {
            System.out.println("");
            output = "\n" + player1Name + " wins the game.";
        }
        else if (compWin > playWin)
        {
            System.out.println("");
             output = "\n" + compName + " wins the game.";
        }
        else
        {
            System.out.println("");
            output = "\n" + "The match was a tie.";
        }
        
        System.out.println(output);


    }

    /*Prompt for Throw*/
    public int makeThrow()
    {
        Scanner Input = new Scanner(System.in);
        int Throw = 0;

        System.out.print("Enter Your Throw [1 for Rock|2 for Paper|3 for Scissors] ");
        Throw = Input.nextInt();

        if (Throw == 1 || Throw == 2 || Throw == 3)
        {
            return Throw;
        }
        else
        {
             System.out.println("Entry Error. Please Try Again.");
        }

        return Throw;
    }
}