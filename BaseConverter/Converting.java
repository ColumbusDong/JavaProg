/*
Programmer: Columbus dong
Date: 3/25/2015
Assignment: Base Coverter
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class Converting
{
    public static void main(String args[])
    {
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        /*Variables*/
        int originalNumber;
        int baseNumber;
        String newNumber = "";

        /*Prompt For Original Number*/
        System.out.print("Enter any number that is in base 10 to convert: ");
        originalNumber = Input.nextInt();

        /*Prompt for Base*/
        System.out.print("Enter a base to convert to [2 - 32]: ");
        baseNumber = Input.nextInt();

        String converted = convert(originalNumber, baseNumber);
        
        System.out.println("The number, " + originalNumber + "[base 10], equals " + converted + " [base " + baseNumber + "].");
    }
    
    public static String convert(int number, int base)
    {
        /*Find Quotient and Remainder*/
        int quotient = number / base;
        int remainder = number % base;

        
        if(quotient == 0)
        {
            return Integer.toString(remainder);      
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }      
        
    }
}

/*Output
Enter any number that is in base 10 to convert: 83
Enter a base to convert to [2 - 32]: 8
The number, 83[base 10], equals 123 [base 8].
 */