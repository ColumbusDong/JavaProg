/*
Programmer: Columbus Dong
Assignment: Loan - Amortication Table
Date: May 11, 2015
*/

import java.io.*;
import java.util.*;
import java.text.*;

public class Loan
{
    public static void main(String args[])
    {
        /*Scanner Object*/
        Scanner Input = new Scanner(System.in);

        /*Decimal Format Object*/
        DecimalFormat money = new DecimalFormat("$##.00");

        /*Variables:
            loanPrincipal:  Starting Amount
            loanRate: Interest Rate
            loanBalance: Current Loan Balance
            loanPeriod: Effective Years

            monthlyPrincipal: Standard Payment
            monthlyRate: Monthly Interest Rate
            monthlyInterest: Interest Payment
            monthlyPayment: Payment per Month

            totalMonths: Total Amount of Months in X Years;
            totalInterest: Total Amount of Interest Paid;
        */
        double loanPrincipal, loanRate, loanBalance;
        double monthlyPrincipal, monthlyRate, monthlyInterest, monthlyPayment;
        double totalInterest = 0;
        int loanPeriod, totalMonths;

        /*Prompt User*/
        System.out.print("Enter the Loan Amount: ");
        loanPrincipal = Input.nextDouble();
        loanBalance = loanPrincipal;

        System.out.print("Enter the Loan Rate[5% = .05]: ");
        loanRate = Input.nextDouble();

        System.out.print("Enter the Loan Period[in Years]: ");
        loanPeriod = Input.nextInt();

        /*Find Total Amount of Months*/
        totalMonths = loanPeriod * 12;

        /*Find Monthly Interest*/
        monthlyRate = loanRate/12;

        /*Find the Monthly Payment*/
        monthlyPayment = (loanPrincipal * ((monthlyRate)/(1 - (Math.pow((1 + monthlyRate), -totalMonths)))) );

        try
        {
            PrintWriter document = new PrintWriter("Loan.txt");
            System.out.println("File has been created");

            /*Print out Monthly Payment to File and Console*/
            document.println("\nMonthly Payment: " + money.format(monthlyPayment));
            
            System.out.println("\nMonthly Payment: " + money.format(monthlyPayment));

            /*Table Header to File and Console*/
            document.println("Month\tInterest\tPrincipal\tBalance");
            document.println("-------------------------------------------------");

            System.out.println("Month\tInterest\tPrincipal\tBalance");
            System.out.println("-------------------------------------------------");

            /*Print out Table*/
            for (int i = 1; i <= totalMonths; i++)
            {
                /*Calculate Interest Payment*/
                monthlyInterest = monthlyRate * loanBalance;
                totalInterest += monthlyInterest;

                /*Calculate Standard Payment*/
                monthlyPrincipal = monthlyPayment - monthlyInterest;

                /*Recalculate Balance*/
                loanBalance -= monthlyPrincipal;

                /*Print to File and Console*/
                document.println(" " + i + "\t " + money.format(monthlyInterest) + "\t\t " + money.format(monthlyPrincipal) + "\t " + money.format(loanBalance));
                System.out.println(" " + i + "\t " + money.format(monthlyInterest) + "\t\t " + money.format(monthlyPrincipal) + "\t " + money.format(loanBalance));
            }

            document.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error!");
            System.exit(0);
        }
    }
}