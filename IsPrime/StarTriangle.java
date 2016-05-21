/*
Programmer: Columbus Dong
Date: December 16, 2014
Assignment: Is Prime
School: Manteo High

Description: Program that taakes user input and finds if the number is prime and the lowest or highest nmber
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class StarTriangle
{
    /*Main*/
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variable For the Number*/
        int Number, UpperPrime, LowerPrime;
        
        /*Prompt For the Number*/
        System.out.print("Enter An Integer Greater Than or Equal To 2: ");
        Number = Input.nextInt();
        
    }
    
    /*Check Lower Prime*/
    public static int LowerPrimeNum(int Number)
    {
        /*Declare Variables*/
        int NumberChange, LastDigit , DigitTotal = 0, PrevDigitTotal = 0;
        
        /*Digit Total Counter*/
        int CounterMax = 0;
        
        /*Declare String Object*/
        String StringNum = new String();
        String StringDigit = new String();
        
        /*LowerPrime = 0*/
        int LowerPrime = 0;
        
        /*Make Number Change Equal to Number*/
        NumberChange = Number;
        
        /*Loop While Lower Prime Equals 0*/
        while (LowerPrime == 0)
        {
            DigitTotal = 0;
            
            StringNum = Integer.toString(NumberChange);
            
            /*Declare Counter*/
            int Counter = 0;
            
            CounterMax = StringNum.length() - 1;
            
            while (Counter <= CounterMax)
            {
                StringDigit = Character.toString(StringNum.charAt(Counter));
                
                LastDigit = Integer.parseInt(StringDigit);
                
                DigitTotal += LastDigit;
            }
            
            PrevDigitTotal = Integer.parseInt(StringNum.substring(0, StringNum.length() - 1));
            
            int ElevenCounter;
            
            
            StringDigit = StringNum.substring(StringNum.length() - 1);
            
            LastDigit = Integer.parseInt(StringDigit);
            
            if (LastDigit % 2 == 0 || DigitTotal % 3 == 0 || LastDigit % 5 == 0 || ((PrevDigitTotal - (2 * LastDigit))) % 7 == 0 || )
            {
                
            }
        }
        
    }
}
        