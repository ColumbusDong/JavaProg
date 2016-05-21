/*
Programmer: Columbus Dong
Date: March 13, 2015
Assignment: Roman Numerals
*/

import java.io.*;
import java.util.*;

public class Roman
{
    public static void main(String args[])
    {
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        /*User Choice*/
        int userChoice;
        System.out.println("Choices:\n\t1. Roman Numeral to Decimal\n\t2. Decimal to Roman Numeral");
        System.out.print("Enter your choice: ");
        userChoice = Input.nextInt();

        String romanNumerals = "";
        int decimalNumbers = 0;

        /*Roman to Decimal*/
        if (userChoice == 1)
        {
            /*Prompt*/
            System.out.print("Enter the Roman Numeral[EX. CCLIX]: ");
            romanNumerals = Input.next();

            System.out.println("");

            toDecimal(romanNumerals);
        }
        else if (userChoice == 2)
        {
            /*Prompt*/
            System.out.print("Enter the Decimal Number[EX. 259]: ");
            decimalNumbers = Input.nextInt();

            System.out.println("");

            toRoman(decimalNumbers);
        }
        else
        {
            System.out.println("ERROR! ERROR! Unidentifiable Choice!");
        }
    }

    /*Converting Roman to Decimal*/
    public static void toDecimal(String romanNumerals)
    {
        int totalResult = 0;

        /*Make Sure All Caps*/
        romanNumerals = romanNumerals.toUpperCase();

        for (int i = 0; i < romanNumerals.length() - 1; i++)
        {
            /*Current character has lower value than next character*/
            if (singleRoman(romanNumerals.charAt(i)) < singleRoman(romanNumerals.charAt(i + 1)))
            {
                /*Subtract*/
                totalResult -= singleRoman(romanNumerals.charAt(i));
            }
            else
            {
                /*Addition*/
                totalResult += singleRoman(romanNumerals.charAt(i));
            }
        }

        /*Last character always added*/
        totalResult += singleRoman(romanNumerals.charAt(romanNumerals.length() - 1));

        System.out.println("The Decimal Equivalent is: " + totalResult);
    }

    public static int singleRoman(char romanCharacter)
    {
        switch(romanCharacter)
        {
            case 'M':
                return 1000;

            case 'D':
                return 500;

            case 'C':
                return 100;

            case 'L':
                return 50;

            case 'X':
                return 10;

            case 'V':
                return 5;

            case 'I':
                return 1;

            default:
                return 0;
        }
    }

    /*Decimal to Roman*/
    public static void toRoman(int decimalNumbers)
    {
        String roman = "";

        while (decimalNumbers > 0)
        {
            if (decimalNumbers >= 1000)
            {
                decimalNumbers -= 1000;
                roman += "M";
            }
            else if (decimalNumbers >= 900)
            {
                decimalNumbers -= 900;
                roman += "CM";
            }
            else if (decimalNumbers >= 500)
            {
                decimalNumbers -= 500;
                roman += "D"; 
            }
            else if (decimalNumbers >= 400)
            {
                decimalNumbers -= 400;
                roman += "CD";
            }
            else if (decimalNumbers >= 100)
            {
                decimalNumbers -= 100;
                roman += "C";
            }
            else if (decimalNumbers >= 90)
            {
                decimalNumbers -= 90;
                roman += "XC";
            }
            else if (decimalNumbers >= 50)
            {
                decimalNumbers -= 50;
                roman += "L";
            }
            else if (decimalNumbers >= 40)
            {
                decimalNumbers -= 40;
                roman += "XL";
            }
            else if (decimalNumbers >= 10)
            {
                decimalNumbers -= 10;
                roman += "X";
            }
            else if (decimalNumbers >= 9)
            {
                decimalNumbers -= 9;
                roman += "IX";
            }
            else if (decimalNumbers >= 5)
            {
                decimalNumbers -= 5;
                roman += "V";
            }
            else if (decimalNumbers >= 4)
            {
                decimalNumbers -= 4;
                roman += "IV";
            }
            else if (decimalNumbers >= 1)
            {
                decimalNumbers -= 1;
                roman += "I";
            }
        }

        System.out.println("The Roman Numeral Equivalent is: " + roman);
    }
}

/*Output
Choices:
    1. Roman Numeral to Decimal
    2. Decimal to Roman Numeral
Enter your choice: 1

Enter the Roman Numeral[EX. CCLIX]: Cclix
The Decimal Equivalent is: 259

Choices:
    1. Roman Numeral to Decimal
    2. Decimal to Roman Numeral
Enter your choice: 2

Enter the Decimal Number[EX. 259]: 3892
The Roman Numeral Equivalent is: MMMDCCCXCII

*/