public class Player
{
    /*Instance Variables*/
    private double SpendingMoney;
    private String PrizesWon;

    /*Regular Constructor*/
    public Player(double Money)
    {
        SpendingMoney = Money;
    }

    /*Players Pay*/
    public String Play(GameBooth Game)
    {
        String NewPrize;

        if (Game.getCost() > SpendingMoney)
        {
            return "Sorry, not enough money to play. \n";
        }
        else
        {

            SpendingMoney -= Game.getCost(); //Pay
            NewPrize = Game.start(); //Play Game
            PrizesWon = NewPrize + ", " + PrizesWon;
            return ("Prize Won: " + NewPrize + "\n" + "Money Left: " + SpendingMoney + "\n" + "Prizes Won: " + PrizesWon + "\n");
            
        }
    }

    /*Returs Prizes*/
    public String showPrizes()
    {
        return PrizesWon;
    }

}