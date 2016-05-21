/*
Programmer: Columbus dong
Date: 3/25/2015
Assignment: Base Coverter
*/


/*Java Utilities*/
import java.io.*;
import java.util.*;


public class BaseConvert
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

        if (baseNumber < 11)
        {
            baseConverter(originalNumber, baseNumber, newNumber);
        }
        else
        {
            letterBases(originalNumber, baseNumber);
        }
    }

    public static void baseConverter(int n, int base, String numbers)
    {
        double divided;

        /*When it gets to final value*/
        if (n == 1)
        {
            /*1 Always at the End*/
            numbers += "" + 1;
            /*Organize the remainders*/
            reorganizedBase(numbers);
        }
        else
        {
            /*Divide*/
            divided = (double) n/base;
            
            int remain = n%base;
            
            numbers += remain;
            
            /*Make what was divided a whole number*/
            n = (int) divided;

            /*Recursion*/
            baseConverter(n, base, numbers);

        }
    }
    
    public static void letterBases(int n, int base)
    {
        double divided;
        String numbers = "";
        
        /*When it gets to final value*/
        if (n == 1)
        {
            /*Organize the remainders*/
            reorganizedBase(numbers);
        }
        else
        {
            /*Divide*/
            divided = (double) n/base;
            
            int remain = n%base;
            
            switch (remain)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    numbers += "" + remain;
                    break;
                case 10:
                    numbers += "A";
                    break;
                case 11:
                    numbers += "B";
                    break;
                    
                case 12:
                    numbers += "C";
                    break;
                        
                case 13:
                    numbers += "D";
                    break;
                    
                case 14:
                    numbers += "E";
                    break;
                    
                case 15:
                    numbers += "F";
                    break;
                    
                default:
                    break;
            }
            
            /*Make what was divided a whole number*/
            n = (int) divided;

            /*Recursion*/
            baseConverter(n, base, numbers);

        }
        
        
    }
    public static void reorganizedBase(String n)
    {
        String reorganized = "";

        for (int i = n.length() - 1; i >= 0; i--)
        {
            reorganized += Character.toString(n.charAt(i));
        }

        System.out.println(reorganized);
    }
}
