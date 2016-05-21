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

public class IsPrime
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
        
        /*Call The Methods*/
        LowerPrime = Lower(Number);
        UpperPrime = Upper(Number);
        
        /*Output: */
        System.out.println("The Number Entered is Between The Prime Numbers: " + LowerPrime + " And " + UpperPrime);
    }
    
    /*Lower Prime Number*/
    public static int Lower(int X)
    {
        /*Declare Variable*/
        int LowerNum = X;
        int FakeNum = 1;
        boolean Loops = true;
        
        /*Loop While Loops Is True*/
        while (Loops == true)
        {
            /*Use The Prime Numbers Square Minus 1 Divided by 24 Rule To Check Prime*/
            if ((((LowerNum * LowerNum) - 1)%24) == 0)
            {
                /*If Prime Number Found, Make Loops False To Stop Loop*/
                Loops = false;
                
                /*Return LowerNum*/
                return LowerNum;
            }
            
            /*Subtract One From Lower Num*/
            LowerNum -= 1;
        }
        
        /*Backup*/
        return FakeNum;
    }
    
    /*Upper Prime Number*/
    public static int Upper(int X)
    {
        /*Declare Variable*/
        int UpperNum = X;
        int FakeNum = 1;
        boolean Loops = true;
        
        /*Loop While Loops Is True*/
        while (Loops == true)
        {
            /*Use The Prime Numbers Square Minus 1 Divided by 24 Rule To Check Prime*/
            if ((((UpperNum * UpperNum) - 1)%24) == 0)
            {
                /*If Prime Number Found, Make Loops False To Stop Loop*/
                Loops = false;
                
                /*Return UpperNum*/
                return UpperNum;
            }
            
            /*Add One To Upper Num*/
            UpperNum += 1;
        }
        
        /*Backup*/
        return FakeNum;
    }
}

/*Output:
Enter An Integer Greater Than or Equal To 2: 15
The Number Entered is Between The Prime Numbers: 13 And 17

Enter An Integer Greater Than or Equal To 2: 13
The Number Entered is Between The Prime Numbers: 13 And 13

Enter An Integer Greater Than or Equal To 2: 19292
The Number Entered is Between The Prime Numbers: 19291 And 19295
*/