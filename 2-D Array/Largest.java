/*
Programmer: Columbus Dong
Assignment: Storing Largest Element
Date: March 6, 2015
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;

public class Largest
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Array.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }


        /*2-D Array*/
        int originalArray[][] = new int[5][5];

        /*Array*/
        int largest[] = new int[5];

        System.out.println("Original Array: \n");

        /*While File has Items*/
        while (inFile.hasNext())
        {
            for (int xRow = 0; xRow < 5; xRow++)
            {
                for (int xColumn = 0; xColumn < 5; xColumn++)
                {
                    originalArray[xRow][xColumn] = inFile.nextInt();

                    System.out.print(originalArray[xRow][xColumn] + "\t");
                }

                /*Space*/
                System.out.println("\n");
            }
        }

        System.out.println("New Array: \n");
        
        /*Find the Largest in Each Row*/
        for (int row = 0; row < 5; row++)
        {
            /*Set largest to first value in row Temporarily*/
            largest[row] = originalArray[row][0];

            for (int column = 0; column < 5; column++)
            {
                /*If Current Value is Larger than the one in "largest"*/
                if (originalArray[row][column] > largest[row])
                {
                    /*Set Largest to the new larger number*/
                    largest[row] = originalArray[row][column];
                }

                /*Print out the Row*/
                System.out.print(originalArray[row][column] + "\t");
            }

            /*Print out Largest on same row*/
            System.out.print(largest[row]);

            /*Space*/
            System.out.println("\n");

        }
    }
}

/*
Output:
Original Array: 

45  67  89  12  -3  

-3  -6  -7  -4  -9  

96  81  -8  52  12  

14  -7  72  29  -1  

19  43  28  63  87  

New Array: 

45  67  89  12  -3  89

-3  -6  -7  -4  -9  -3

96  81  -8  52  12  96

14  -7  72  29  -1  72

19  43  28  63  87  87
*/