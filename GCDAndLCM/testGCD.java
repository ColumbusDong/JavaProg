/*
Programmer: Columbus Dong
Date: January 23, 2015
Assignment: GCD
School: Manteo High

Description: Program to find the GCD
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class testGCD
{
	public static void main(String args[])
	{
		/*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("GCD.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Declare Variables for the Numbers*/
        int Number1, Number2;

        while (inFile.hasNext())
        {
        	/*Get The First Number*/
        	Number1 = inFile.nextInt();

        	/*Get The Second Number*/
        	Number2 = inFile.nextInt();

        	/*Output*/
        	GCD findGCD = new GCD(Number1, Number2);
        	System.out.println("" + findGCD);
        }

	}
}

/*Output:
The GCD of 25 and 10 is 5
The GCD of 81 and 41 is 1
The GCD of 255 and 138 is 3
The GCD of 847 and 624 is 1
The GCD of 84 and 420 is 84
The GCD of 182 and 637 is 91
The GCD of 620 and 420 is 20
The GCD of 36 and 24 is 12
The GCD of 75 and 125 is 25
The GCD of 1 and 17 is 1
 */