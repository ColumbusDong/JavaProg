import java.text.NumberFormat;

public class Account
{
    /*Instance Variables*/
    private double Balance;
    private Customer Custo;

    /*Regular Constructor*/
    public Account(double Bal, String FName, String LName, String Str, String C, String S, String Z)
	{
		Balance = Bal;
		Custo = new Customer(FName, LName, Str, C, S, Z);
	}

    /*Accessors*/
    public double getBalance()
    {
        return Balance;
    }

    /*Setters*/
    public void Deposit(double Amt)
    {
        Balance += Amt;
    }

    public void Withdrawal(double Amt)
    {
        /*Check to make sure there is enough money*/
        if (Amt <= Balance)
        {
            Balance -= Amt;
        }
        else
        {
            System.out.println("Not enough money in account.");
        }
    }

    public void changeAddress(String newStr, String newC, String newS, String newZ)
    {
        Custo.changeStreet(newStr);
        Custo.changeCity(newC);
        Custo.changeState(newS);
        Custo.changeZip(newZ);
    }

    /*Output*/
    public String toString()
    {
        String AccountString;
        NumberFormat Money = NumberFormat.getCurrencyInstance();

        AccountString = Custo.toString();
        AccountString += "Current Balance is " + Money.format(Balance);

        return AccountString;
    }
}