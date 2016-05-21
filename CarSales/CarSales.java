/*
Programmer: Columbus Dong
Date: March 2, 2015
Assignment: Used Car Sales
*/

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class CarSales
{
	public static void main(String args[])
	{
		/*Scanner from File Stuff*/
        Scanner inFile = null; 

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Sales.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        int[] saleRanges = new int[9];
        Arrays.fill(saleRanges, 0, 9, 0); //Fill with Zeros

        int grossSale;
        double totalSalaries;

        while (inFile.hasNext())
        {
        	grossSale = inFile.nextInt();

        	/*Base $200 Pay*/
        	totalSalaries = 200;

        	/*Additional*/
        	totalSalaries += (.09 * grossSale);

        	if (totalSalaries >= 200 && totalSalaries < 300)
        	{
        		saleRanges[0]++;
        	}
        	else if (totalSalaries >= 300 && totalSalaries < 400)
        	{
        		saleRanges[1]++;
        	}
        	else if (totalSalaries >= 400 && totalSalaries < 500)
        	{
        		saleRanges[2]++;
        	}
        	else if (totalSalaries >= 500 && totalSalaries < 600)
        	{
        		saleRanges[3]++;
        	}
        	else if (totalSalaries >= 600 && totalSalaries < 700)
        	{
        		saleRanges[4]++;
        	}
        	else if (totalSalaries >= 700 && totalSalaries < 800)
        	{
        		saleRanges[5]++;
        	}
        	else if (totalSalaries >= 800 && totalSalaries < 900)
        	{
        		saleRanges[6]++;
        	}
        	else if (totalSalaries >= 900 && totalSalaries < 1000)
        	{
        		saleRanges[7]++;
        	}
        	else if (totalSalaries >= 1000 && totalSalaries < 1100)
        	{
        		saleRanges[8]++;
        	}
        }

        String[] output = {"$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599", "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 - $1099", "$1100 - $1199"};

        /*Output*/
        System.out.println("Salary\t\tFrequency");

        for (int i = 0; i < 9; i++)
        {
        	System.out.println(output[i] + "\t    " + saleRanges[i]);
        }
	}
}

/*Output
Salary		Frequency
$200 - $299	    5
$300 - $399	    2
$400 - $499	    2
$500 - $599	    1
$600 - $699	    3
$700 - $799	    1
$800 - $899	    2
$900 - $999	    1
$1000 - $1099	    2
*/