/*Import Utlis*/
import java.util.Random;

public class GameBooth
{
    private double Cost;
    private String FirstPrize, ConsolPrize;
    private int FirstAward = 0;
    private int ConsolAward = 0;

    /*Regular Constructor*/
    public GameBooth(double Charge, String Prize1, String Prize2)
    {
        Cost = Charge;
        FirstPrize = Prize1;
        ConsolPrize = Prize2;
    }

    public String start()
    {
        int Toss;
        int Successes = 0;
        Random Rand = new Random();

        /*Play the Game*/
        for (int i = 0; i < 3; i++)
        {
            Toss = Rand.nextInt(2);
            if (Toss == 1)
            {
                Successes += 1;
            }
        }

        /*Award Prize*/
        if (Successes == 3)
        {
            FirstAward += 1;
            return FirstPrize;
        }
        else
        {
            ConsolAward += 1;
            return ConsolPrize;
        }
    }

    /*Get Cost*/
    public double getCost()
    {
        return Cost;
    }

    /*Get Prizes Awarded*/
    public String prizesAwarded()
    {
        return ("Number of First Prizes Awarded: " + FirstAward + "\n" + "Number of Consolation Prizes Awarded: " + ConsolAward);
    }
}