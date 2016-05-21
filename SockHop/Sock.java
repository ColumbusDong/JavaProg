import java.text.*;

public class Sock
{
    /*Instance Variables*/
    private String line;
    private int students = 0;
    private int money = 0;

    /*Regular Constructor*/
    public Sock(String Characters)
    {
        line = Characters;

        /*Change to an Array*/
        final String charcs[] = line.split("");

        int counter = 0;
        int length = charcs.length - 1;
        String Char;

        while (counter <= length)
        {
            Char = charcs[counter];

            /*Decision Making*/
            switch (Char)
            {
                case "N":
                    noTicket();
                    break;

                case "Y":
                    yesTicket();
                    break;

                case "P":
                    Output();
                    break;

                case "Q":
                    toTerminate();
                    break;

                default:
                    break;
            }
            
            counter++;
        }   
    }
    
    /*No ticket*/
    public void noTicket()
    {
        students += 1;
        money += 5;
    }

    /*Yes Ticket*/
    public void yesTicket()
    {
        students += 1;
        money += 0;
    }

    /*to String*/
    public void Output()
    {
        DecimalFormat Money = new DecimalFormat("##.00");

        String str = "Students: " + students + "\tTotal Money: $" + Money.format(money);
        System.out.println(str);
    }

    /*Terminate*/
    public void toTerminate()
    {
        System.exit(1);
    }
}