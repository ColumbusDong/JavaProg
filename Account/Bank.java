/*
Programmer: Columbus Dong
Date: January 30, 2015
Assignment: Bank
School: Manteo High
*/

/*Import Ultilities*/
import java.util.Scanner;
import java.text.NumberFormat;

public class Bank
{
    public static void main(String args[])
    {
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        /*NumberFormat*/
        NumberFormat Money = NumberFormat.getCurrencyInstance();

        /*Declare Variables*/
        double Data;

        /*Declare Variables For Change*/
        String Response, newAddress, newCity, newState, newZip;

        /*Object*/
        Account MunozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "My Town", "FL", "33445");

        /*Print Out Munoz*/
        System.out.println(MunozAccount);

        /*Space*/
        System.out.println("");

        /*Deposit*/
        System.out.print("Enter Deposit Amount: ");
        Data = Input.nextDouble();
        MunozAccount.Deposit(Data);
        System.out.println("Balance is: " + Money.format(MunozAccount.getBalance()));

        /*Space*/
        System.out.println("");
        
        /*Withdrawal*/
        System.out.print("Enter Withdrawal Amount: ");
        Data = Input.nextDouble();
        MunozAccount.Withdrawal(Data);
        System.out.println("Balance is: " + Money.format(MunozAccount.getBalance()));

        /*Space*/
        System.out.println("");
        
        /*Prompt User If They Want Address Change*/
        System.out.println("Do You Want An Address Change? (Y/N)");
        Response = Input.next();
        Response = Response.toUpperCase();

        /*Space*/
        System.out.println("");

        if (Response.equals("Y"))
        {
            /*Fill b/c of some error*/
            newAddress = Input.nextLine();
            
            /*Prompt For New Address*/
            System.out.println("What is your new Address?");
            newAddress = Input.nextLine();
            
            System.out.println("What is your new City?");
            newCity = Input.nextLine();

            System.out.println("What is your new State?");
            newState = Input.nextLine();

            System.out.println("What is your new Zip Code");
            newZip = Input.nextLine();

            MunozAccount.changeAddress(newAddress, newCity, newState, newZip);

            System.out.println(MunozAccount);
        }
        else
        {
            System.exit(0);
        }

    }
}

/*Output
 Maria Munoz
110 Glades Road
My Town, FL 33445
Current Balance is $250.00

Enter Deposit Amount: 400
Balance is: $650.00

Enter Withdrawal Amount: 321
Balance is: $329.00

Do You Want An Address Change? (Y/N)
y

What is your new Address?
this works road

What is your new City?
it works maybe?

What is your new State?
works?

What is your new Zip Code
workks?

Maria Munoz
this works road
it works maybe?, works? workks?
Current Balance is $329.00
 */