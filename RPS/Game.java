/*Programmer: Columbus
Date: February 9, 2015
Assignment: RPS
*/
import java.util.Random;
public class Game
{
    /*Instance Variables*/
    
    private int playThrow; //Number Form
    private String pThrow; //Actual Throw

    private int compThrow;  //Number Form, Also Represents Player2
    private String comp;    //Name, Also Represents Player 2
    private String cThrow;  //Actual Throw, Also Represents Player 2

    private int winner;

    /*Default Constructor*/
    public Game()
    {
        compThrow = 0;
        playThrow = 0;
    }

    /*Regular Constructor Computer*/
    public Game(int Throw)
    {
        /*Player Throw*/
        playThrow = Throw;
        playerThrow(playThrow);

        /*Compter Throw*/
        makeCompThrow();

        /*Check Winner*/
        checkWinner();

        /*Set Comp name as Computer*/
        comp = "Computer";
    }

    /**********************************************************/
    /*Player Throw*/
    public void playerThrow(int playThrow)
    {
        switch (playThrow)
        {
            case 1:
                pThrow = "Rock";
                break;

            case 2:
                pThrow = "Paper";
                break;

            case 3:
                pThrow = "Scissors";
                break;

            default:
                pThrow = "Error";
                break;
        }
    }

    /*Computer Throw*/
    public void makeCompThrow()
    {
        Random RNGGen = new Random();

        compThrow = RNGGen.nextInt(10);

        if (compThrow >= 0 && compThrow <= 2)
        {
            compThrow = 1;
            cThrow = "Rock";
        }
        else if (compThrow >= 3 && compThrow <= 6)
        {
            compThrow = 2;
            cThrow = "Paper";
        }
        else
        {
            compThrow = 3;
            cThrow = "Scissors";
        }
    }

    /*Check who won*/
    public void checkWinner()
    {
        /*Winner Key*/
        /*
        0 = Tie;
        1 = Player1
        2 = Player2/Computer
        */

        if (playThrow == compThrow)
        {
            winner = 0;
        }
        /*Player 1 Win Conditions*/
        /*P1 = Rock, P2 = Scissors*/
        else if (playThrow == 1 && compThrow == 3)
        {
            winner = 1;
        }
        /*P1 = Paper, P2 = Rock*/
        else if (playThrow == 2 && compThrow == 1)
        {
            winner = 1;
        }
        /*P1 = Scissors, P2 = Paper*/
        else if (playThrow == 3 && compThrow == 2)
        {
            winner = 1;
        }
        /*-------------------------------------------*/
        /*Player 2 Win Conditions*/
        /*P2 = Rock, P1 = Scissors*/
        else if (playThrow == 3 && compThrow == 1)
        {
            winner = 2;
        }
        /*P2 = Paper, P1 = Rock*/
        else if (playThrow == 1 && compThrow == 2)
        {
            winner = 2;
        }
        /*P2 = Scissors, P1 = Paper*/
        else if (playThrow == 2 && compThrow == 3)
        {
            winner = 2;
        }
    }

    /******************************************************************/
    /*Assessors*/
    public String getCompThrow()
    {
        return cThrow;
    }

    public String getP2Name()
    {
        return comp;
    }
    
    public String getPlayerThrow()
    {
        return pThrow;
    }

    public int getWinner()
    {
        return winner;
    }

}