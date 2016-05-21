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
        
        UpperPrime = Number;
        LowerPrime = Number;
        
        boolean Low = true;
        while (Low == true)
        {
            for (int Count = 2; Count < Number; Count++)
            {
                if (LowerPrime % Count == 0)
                {
                    LowerPrime--;
                }
                else
                {
                    System.out.println("Lower Prime is " + LowerPrime);
                    Low = false;
                    Count = Number;
                }
            }
        }
    }
}