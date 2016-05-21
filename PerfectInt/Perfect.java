/*
Programmer: Columbus Dong
Date: January 16, 2015
Assignment: Perfect Int
School: Manteo High

Description: Program that finds all the perfect integers up to 100

Note: I prefered to do this assignment in one class because it seemed more natural/more efficient in the method I used to find Perfect Integers

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class PerfectInteger
{
    /*Main*/
    public static void main(String args[])
    {
    	/*Declare Variables*/
    	int Divisor = 1;
    	int Sum = 0;
    	int Number = 1;

    	/*Header*/
    	System.out.println("The following numbers between 1 and 100 are: ");

    	/*Loop from 1 to 100*/
    	while (Number <= 100)
    	{
    		/*Reset Values*/
    		Sum = 0;
    		Divisor = 1;

    		/*Checking Factors*/
    		while (Divisor <= Number/2)
    		{
    			/*Check If Factor, If Factor, Mod should result in 0*/
    			if ((Number % Divisor) == 0)
    			{
    				/*Total Up All Factors*/
    				Sum = Sum + Divisor;
    			}

    			/*Add One to Divisor*/
    			Divisor++;
    		}

    		/*Check if the Sum of Divisor is Squal to the Current Number*/
    		if (Sum == Number)
    		{
    			System.out.println(Number + " Is A Perfect Integer");
    		}

    		/*Add One to Number*/
    		Number++;
    	}


    }
}

/*Output
The following numbers between 1 and 100 are: 
6 Is A Perfect Integer
28 Is A Perfect Integer
*/