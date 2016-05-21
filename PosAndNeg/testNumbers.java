/*
Programmer: Columbus Dong
Assignment: Positive and Negative
Date: February 20, 2015
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class testNumbers
{
	public static void main(String args[])
	{
		/*Scanner from File Stuff*/
        Scanner inFile1 = null; 
        Scanner inFile2 = null;

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile1 = new Scanner (new File("Numbers1.txt"));
                inFile2 = new Scanner (new File("Numbers2.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("Files not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Files to Strings*/
        String fileOneNumbers = "";
        String fileTwoNumbers = "";

        while (inFile1.hasNext())
        {
        	/*Create a String from all the Numbers*/
        	fileOneNumbers += inFile1.next() + " ";
        }

        while (inFile2.hasNext())
        {
        	/*Create a String from all the Numbers*/
        	fileTwoNumbers += inFile2.next() + " ";
        }

        Seperate sep1 = new Seperate(fileOneNumbers);
        Seperate sep2 = new Seperate(fileTwoNumbers);

        /*Number Set 1*/
        System.out.println("Set 1: ");
        System.out.println(sep1);

        /*Space*/
        System.out.println("");
        
        /*Number Set 2*/
        System.out.println("Set 2: ");
        System.out.println(sep2);
	}
}

/*
Output:
Set 1: 
Positive: 3  66  54  22  19  21  34  64  55  9  39  54  33  
Total # of Positive #: 13

Negative: -8  -16  -56  -34  -22  -55  -3  -55  -76  -45  
Total # of Negative #: 10

Set 2: 
Positive: 8  10  56  34  22  55  3  55  76  45  
Total # of Positive #: 10

Negative: -3  -66  -54  -22  -19  -21  -34  -64  -55  -9  -89  -54  -33  
Total # of Negative #: 13
 */