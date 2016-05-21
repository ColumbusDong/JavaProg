/*Programmer: Columbus
Date: February 13, 2015
Assignment: The Sock Hop
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class Factor
{
    public static void main(String args[])
    {
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        int userNumber = 1;
        int totalFactors = 0;
        String allFactors = "";

        while (userNumber != 0)
        {
            /*Reset*/
            totalFactors = 0;
            allFactors = "";

            /*Prompt User For Number*/
            System.out.print("Enter A Number To Factor: ");
            userNumber = Input.nextInt();

            /*Set X equal to 2 since we dont coun't 1, set x to less than b/c we don't count the number itself*/
            for (int x = 2; x < userNumber; x++)
            {
                /*Mod the User Number by X*/
                if (userNumber % x == 0)
                {
                    allFactors += x + "  ";
                    totalFactors++;
                }
            }

            /*If No Factors*/
            if (totalFactors == 0 && userNumber != 0)
            {
                allFactors = "None";
            }
            else if (userNumber != 0)
            {
                System.out.println("Factors: " + allFactors);
                System.out.println("");
            }   
        }
    }
}

/*
Output:
Enter A Number To Factor: 20
Factors: 2  4  5  10  

Enter A Number To Factor: 40
Factors: 2  4  5  8  10  20  

Enter A Number To Factor: 60
Factors: 2  3  4  5  6  10  12  15  20  30  

Enter A Number To Factor: 80
Factors: 2  4  5  8  10  16  20  40  

Enter A Number To Factor: 100
Factors: 2  4  5  10  20  25  50  

Enter A Number To Factor: 1000
Factors: 2  4  5  8  10  20  25  40  50  100  125  200  250  500  

Enter A Number To Factor: 2000
Factors: 2  4  5  8  10  16  20  25  40  50  80  100  125  200  250  400  500  1000  

Enter A Number To Factor: 0
*/