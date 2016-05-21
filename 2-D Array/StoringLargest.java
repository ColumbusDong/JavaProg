/*
Programmer: Columbus Dong
Assignment: Storing Largest
Date: April 9, 2015
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;

public class StoringLargest
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Largest.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }


        /*2-D Array*/
        int baseArray1[][] = new int[4][4];
        int baseArray2[][] = new int[4][4];
        int largestArray[][] = new int[4][4];

        /*While File has Items*/
        while (inFile.hasNext())
        {
            /*Array 1*/
            for (int xRow = 0; xRow < 4; xRow++)
            {
                for (int xColumn = 0; xColumn < 4; xColumn++)
                {
                    baseArray1[xRow][xColumn] = inFile.nextInt();
                }
            }

            /*Array 2*/
            for (int xRow1 = 0; xRow1 < 4; xRow1++)
            {
                for (int xColumn1 = 0; xColumn1 < 4; xColumn1++)
                {
                    baseArray2[xRow1][xColumn1] = inFile.nextInt();
                }
            }
        }

        /*Largest Value Array*/
        for (int x = 0; x < 4; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                /*Compare the Array at Same Indexes*/
                if (baseArray1[x][y] >= baseArray2[x][y])
                {
                    largestArray[x][y] = baseArray1[x][y];
                }
                else
                {
                    largestArray[x][y] = baseArray2[x][y];
                }
            }
        }

        /*Output in a Neat Fasion*/
        System.out.println("Original Arrays: ");
        System.out.println("\tArray 1:\t\t\t\t\t Array2:");

        for (int i = 0; i < 4; i++)
        {
            /*Print Rows for Array 1*/
            for (int a1 = 0; a1 < 4; a1++)
            {
                System.out.print(baseArray1[i][a1] + "\t");
            }

            System.out.print("\t\t");

            /*Print Rows for Array 2*/
            for (int a2 = 0; a2 < 4; a2++)
            {
                System.out.print(baseArray1[i][a2] + "\t");
            }

            System.out.println("");
        }

        System.out.println("\t\t    The Largest Values in Each Index:");

        for (int l = 0; l < 4; l++)
        {
            System.out.print("\t\t\t");
            
            for (int l1 = 0; l1 < 4; l1++)
            {
                System.out.print(largestArray[l][l1] + "\t");
            }

            System.out.println("");
        }


    }
}

/*Output:
Original Arrays: 
    Array 1:               Array2:
2   7   6   4           2   7   6   4   
6   1   2   4           6   1   2   4   
9   7   2   6           9   7   2   6   
8   3   2   1           8   3   2   1   
    The Largest Values in Each Index:
            4   7   6   7   
            6   2   3   8   
            9   7   2   6   
            8   3   3   1   
*/