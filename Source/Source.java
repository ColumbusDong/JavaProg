import java.text.*;

public class Source
{
    /*Instance Variables*/
    private String account;
    private double hours;
    private int code;
    private double amount;

    /*Default Constructor*/
    public Source()
    {
    	account = null;
    	hours = 0;
    	code = 0;
    	amount = 0;
    }

    /*Regular Constructor*/
    public Source(String actNumber, double hour, int priority)
    {
    	account = actNumber;
    	hours = hour;
    	code = priority;
    	amount = 0;

    	DecimalFormat Money = new DecimalFormat("##.00");

    	/*Regular Charge*/
    	if (hours >= 0 && hours <= 5.00)
    	{
    		amount = 200;
    	}
    	else if (hour >= 5.01 && hours <= 15.00)
    	{
    		amount = 200;
    		amount += ((hours - 5) * 30);
    	}
    	else if (hour >= 15.01)
    	{
    		amount = 550;
    		amount += ((hours - 15) * 30);
    	}


    	/*Surcharge*/
    	switch (code)
    	{
    		case 0:
    			amount += 0;
    			break;

    		case 1:
    			amount += 50;
    			break;

    		case 2:
    			amount += 150;
    			break;

    		default:
    			amount += 0;
    			break;
    	}
    }
    
    public String toString()
    	{
    	    DecimalFormat Money = new DecimalFormat("##.00");
    		String str = "" + account + "\t" + hours + "\t" + code + "\t$" + Money.format(amount);
    		return str;
    	}
}