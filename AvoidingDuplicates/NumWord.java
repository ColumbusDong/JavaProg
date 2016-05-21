/*
Programmer: Columbus Dong
Date: March 5, 2015
Assignment: Number to Word
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class NumWord
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);  

        /*Variables*/
        double userNumber;
        int wholeValue;
        double changeValue;
        int change;

        int repeat = -1;
        String response;

        while (repeat == -1)
        {
            /*Prompt*/
            System.out.print("Enter a Number to Convert: ");
            userNumber = Input.nextDouble();

            /*Find Whole and Change Value*/
            wholeValue = (int) userNumber;

            /*Coins*/
            changeValue = Math.round((userNumber - wholeValue) * 100);
            change = (int) changeValue;

            /*Change*/
            String fullChange = Change(wholeValue);

            fullChange += " and " + change + "/100 Dollars";

            System.out.println(fullChange);

            System.out.println("");

            System.out.print("Would you like to repeat?[Y/N] ");
            response = Input.next();

            if (response.toUpperCase().equals("N"))
            {
                repeat = 1;
            }

            System.out.println("");
        }

    }

    /*Changes*/
    public static String Change(int numberInteger)
    {
        /*Variables*/
        String fullChange = "";
        String numberString = new String("" + numberInteger);
        
        int numberLength = numberString.length();
        int[] numberDigits = new int[numberLength];
        ////////////////////////////////////////////////////
        /*Convert String Array to Integer Array*/
        for (int i = 0; i < numberLength; i++)
        {
            numberDigits[i] = Integer.parseInt(numberString.substring(i, i + 1));
        }
        ////////////////////////////////////////////////////

        switch (numberLength)
        {
            /*Single Digit*/
            case 1:
                fullChange = "" + SingleDigit(numberDigits[0]);
                break;

            /*Two Digit*/
            case 2:
                fullChange = "" + TwoDigit(numberDigits[0], numberDigits[1]);
                break;

            case 3:
                fullChange = "" + ThreeDigit(numberDigits[0], numberDigits[1], numberDigits[2]);
                break;

            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                fullChange = "" + GreaterDigit(numberDigits, numberLength);
                break;

            default:
                System.out.println("ERROR! ERROR! INVALID OR TOO LARGE OF A NUMBER!");
                break;
        }

        return fullChange;

    }

    ////////////////////////////////////////////////////
    public static String SingleDigit(int number)
    {
        String changed = "";

        changed = Basic(number);

        return changed;
    }

    public static String TwoDigit(int digit1, int digit2)
    {
        String changed = "";

        if (digit1 < 2)
        {
            changed = Teens(digit2);
        }
        else
        {
            changed = Tens(digit1);
            changed += "-" + Basic(digit2);
        }
        
        return changed;
    }

    public static String ThreeDigit(int digit1, int digit2, int digit3)
    {
        String changed = "";

        changed = SingleDigit(digit1);

        if (digit1 == 0 && digit2 == 0 && digit3 == 0)
        {
            changed = "";
        }
        else if (digit2 == 0 && digit3 != 0 && digit1 == 0)
        {
            changed += SingleDigit(digit3);
        }
        else if (digit2 == 0 && digit3 != 0)
        {
            changed += " " + Magnitude(0) + " " + "and ";
            changed += SingleDigit(digit3);
        }
        else if (digit1 == 0)
        {
            changed += TwoDigit(digit2, digit3);
        }
        else 
        {
            changed += " " + Magnitude(0) + " ";
            changed += TwoDigit(digit2, digit3);
        }

        return changed;
    }

    public static String GreaterDigit(int digits[], int length)
    {
        String changed = "";

        int changingIndex = length - 3;
        int zeroCounter = 0;

        /*All Require Basic Prefixes*/
        if (length % 3 == 1)
        {
            changed = SingleDigit(digits[0]);

            for (int i = 1; changingIndex >= 1; i += 3)
            {
                changed += " " + Magnitude(changingIndex);

                /*If Three Zeroes in a Row*/
                if (digits[i] == 0 && digits[i + 1] == 0 && digits[i + 2] == 0)
                {
                    changingIndex -= 3;
                    zeroCounter = 0;

                    /*Make Sure Number Isn't Just All Zeroes*/
                    for (int x = i; x < length; x++)
                    {
                        zeroCounter++;

                        if (zeroCounter == length - 1)
                        {
                            changingIndex -= 3;
                        }
                    }

                    if (digits[i + 3] != 0 || digits[i + 4] != 0 || digits[i + 5] != 0) 
                    {
                        changed += ", " + ThreeDigit(digits[i + 3], digits[i + 4], digits[i + 5]);
                    }
                }
                else
                {
                    changed += ", " + ThreeDigit(digits[i], digits[i + 1], digits[i + 2]);
                }

                changingIndex -= 3;
            }
        }
        /*All Require Teen Prefixes*/
        else if (length % 3 == 2)
        {
            changed = TwoDigit(digits[0], digits[1]);

            for (int i = 2; changingIndex >= 1; i += 3)
            {
                changed += " " + Magnitude(changingIndex);

                /*If Three Zeroes in a Row*/
                if (digits[i] == 0 && digits[i + 1] == 0 && digits[i + 2] == 0)
                {
                    changingIndex -= 4;
                    zeroCounter = 0;

                    /*Make Sure Number Isn't Just All Zeroes*/
                    for (int x = i; x < length; x++)
                    {
                        zeroCounter++;

                        if (zeroCounter == length - 1)
                        {
                            changingIndex -= 4;
                        }
                    }

                    if (digits[i + 3] != 0 || digits[i + 4] != 0 || digits[i + 5] != 0) 
                    {
                        changed += ", " + ThreeDigit(digits[i + 3], digits[i + 4], digits[i + 5]);
                    }
                }
                else
                {
                    changed += ", " + ThreeDigit(digits[i], digits[i + 1], digits[i + 2]);
                }

                changingIndex -= 4;
            }

        }
        /*All Require Hundred Prefixes*/
        else if (length % 3 == 0)
        {
            changed = ThreeDigit(digits[0], digits[1], digits[2]);

            for (int i = 3; changingIndex >= 1; i += 3)
            {
                changed += " " + Magnitude(changingIndex);

                /*If Three Zeroes in a Row*/
                if (digits[i] == 0 && digits[i + 1] == 0 && digits[i + 2] == 0)
                {
                    changingIndex -= 5;
                    zeroCounter = 0;

                    /*Make Sure Number Isn't Just All Zeroes*/
                    for (int x = i; x < length; x++)
                    {
                        zeroCounter++;

                        if (zeroCounter == length - 1)
                        {
                            changingIndex -= 5;
                        }
                    }

                    if (digits[i + 3] != 0 || digits[i + 4] != 0 || digits[i + 5] != 0) 
                    {
                        changed += ", " + ThreeDigit(digits[i + 3], digits[i + 4], digits[i + 5]);
                    }
                }
                else
                {
                    changed += ", " + ThreeDigit(digits[i], digits[i + 1], digits[i + 2]);
                }

                changingIndex -= 5;
            }
        }

        return changed;
    }

    ///////////////////////////////////////////
    /*Ones Digit Numbers*/
    public static String Basic(int number)
    {
        String[] numberBasic =
        {
            "",             //Index: 0
            "One",              //Index: 1
            "Two",              //Index: 2
            "Three",            //Index: 3
            "Four",             //Index: 4
            "Five",             //Index: 5
            "Six",              //Index: 6
            "Seven",            //Index: 7
            "Eight",            //Index: 8
            "Nine",             //Index: 9
        };

        String output = numberBasic[number];

        return output;
    }

    /*Two Digit Teens Numbers*/
    public static String Teens(int number)
    {
        String[] numberTeens = 
        {
            "Ten",              //Index: 0
            "Eleven",           //Index: 1
            "Twelve",           //Index: 2
            "Thirteen",         //Index: 3
            "Fourteen",         //Index: 4
            "Fifteen",          //Index: 5
            "Sixteen",          //Index: 6
            "Seventeen",        //Index: 7
            "Eighteen",         //Index: 8
            "Nineteen",         //Index: 9
        };
        String output = numberTeens[number];
        
        return output;
    }

    /*Two Digit Tens Number*/
    public static String Tens(int number)
    {
        String[] numberTens = 
        {
            "Twenty",           //Index: 0  Length: 2
            "Thirty",           //Index: 1  Length: 2
            "Forty",            //Index: 2  Length: 2
            "Fifty",            //Index: 3  Length: 2
            "Sixty",            //Index: 4  Length: 2
            "Seventy",          //Index: 5  Length: 2
            "Eighty",           //Index: 6  Length: 2
            "Ninety",           //Index: 7  Length: 2
        };
        String output = numberTens[(number) - 2];
        
        return output;
    }

    /*Magnitudes/Units*/
    public static String Magnitude(int number)
    {
        String[] numberMagnitude = 
        {
            "Hundred",          //Index: 0  Length: 3
            "Thousand",         //Index: 1  Length: 4
            "Thousand",         //Index: 2  Length: 5
            "Thousand",         //Index: 3  Length: 6
            "Million",          //Index: 4  Length: 7
            "Million",          //Index: 5  Length: 8
            "Million",          //Index: 6  Length: 9
            "Billion",          //Index: 7  Length: 10

        };
        String output = numberMagnitude[number];
        
        return output;
    }
}

/*output
Enter a Number to Convert: 54.00
Fifty-Four and 0/100 Dollars

Would you like to repeat?[Y/N] y

Enter a Number to Convert: 975231.10
Nine Hundred Seventy-Five Thousand, Two Hundred Thirty-One and 10/100 Dollars

Would you like to repeat?[Y/N] y

Enter a Number to Convert: 32004.99
Thirty-Two Thousand, Four and 99/100 Dollars

Would you like to repeat?[Y/N] 3018.01

Enter a Number to Convert: 3018.01
Three Thousand, Eighteen and 1/100 Dollars

Would you like to repeat?[Y/N] y

Enter a Number to Convert: .98
 and 98/100 Dollars

Would you like to repeat?[Y/N] n
*/