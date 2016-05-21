/*
Programmer: Columbus Dong
Date: March 5, 2015
Assignment: Making Change Again
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Change
{
    public static void main(String args[])
    {
        DecimalFormat money = new DecimalFormat("$##.00");
        Scanner Input = new Scanner(System.in);

        double moneyCost = 0;
        double moneyGiven = 0;
        double moneyChange = 0;
        double originalChange = 0;

        String[] currenyNames = {"Ones", "Quarters", "Dimes", "Nickels", "Pennies"};
        double[] currencyUnits = {1.00, .25, .10, .05, .01};
        int[] currencyCount = new int[5];

        /*Prompt*/
        System.out.print("Enter the Price: ");
        moneyCost = Input.nextDouble();

        /*Prompt*/
        System.out.print("Enter the Amount Given: ");
        moneyGiven = Input.nextDouble();

        /*Calculate Change*/
        moneyChange = moneyGiven - moneyCost;

        /*Make Sure Enough Money*/
        while (moneyChange < 0)
        {
            System.out.println("Amount Unpaid: " + money.format(moneyChange * -1));

            System.out.print("Enter more Money: ");
            moneyGiven = Input.nextDouble();

            /*Calculate Change*/
            moneyChange = moneyGiven - moneyCost;
        }

        originalChange = moneyChange;

        /*Find Correct Change*/
        if (moneyChange != 0)
        {
            while (moneyChange >= 1)
            {
                /*Subtract $1*/
                moneyChange = moneyChange - currencyUnits[0];
                currencyCount[0]++;
            }

            while (moneyChange >= .25)
            {
                /*Subtract $.25*/
                moneyChange = moneyChange - currencyUnits[1];
                currencyCount[1]++;
            }

            while (moneyChange >= .10)
            {
                /*Subtract $.10*/
                moneyChange = moneyChange - currencyUnits[2];
                currencyCount[2]++;
            }

            while (moneyChange >= .05)
            {
                /*Subtract $.05*/
                moneyChange = moneyChange - currencyUnits[3];
                currencyCount[3]++;
            }

            while (moneyChange >= .00)
            {
                /*Subtract $.01*/
                moneyChange = moneyChange - currencyUnits[4];
                currencyCount[4]++;
            }
        }

        /*Output Findings*/
        /*Header*/
        System.out.println("================");
        System.out.println(" Correct Change");
        System.out.println("================");

        for (int i = 0; i < currenyNames.length; i++)
        {
            System.out.println(currenyNames[i] + " = " + currencyCount[i]);
        }

        System.out.println("Total Amount of Change: " + money.format(originalChange));
    }
}

/*Output
Enter the Price: 10.01
Enter the Amount Given: 20.00
================
 Correct Change
================
Ones = 9
Quarters = 3
Dimes = 2
Nickels = 0
Pennies = 5
Total Amount of Change: $9.99

Enter the Price: 10.74
Enter the Amount Given: 100
================
 Correct Change
================
Ones = 89
Quarters = 1
Dimes = 0
Nickels = 0
Pennies = 2
Total Amount of Change: $89.26

*/