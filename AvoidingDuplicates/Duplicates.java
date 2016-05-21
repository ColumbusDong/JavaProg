/*
Programmer: Columbus Dong
Date: March 4, 2015
Assignment Avoiding Duplicates
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class Duplicates
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Duplicate.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Arrays*/
        int[] numberSet = new int[20];
        int[] numberDiff = new int[20];

        /*Variables*/
        int numberCurrent = 0;
        int differenceCounter = 0;
        String numberSetOutput = "The Original Set of Numbers: ";
        String numberDiffOutput = "The Difference Numbers from the Set: ";

        /*Set All Numbers*/
        for (int i = 0; inFile.hasNext(); i++)
        {
            numberSet[i] = inFile.nextInt();
            numberSetOutput += numberSet[i] + " ";
        }

        /*Check Numbers For Similarity*/
        for (int x = 0; x < numberSet.length; x++)
        {
            if (numberSet[x] != 0)
            {
                numberCurrent = numberSet[x];
                numberDiff[differenceCounter] = numberCurrent;

                numberDiffOutput += numberCurrent + " ";

                differenceCounter++;
            }


            for (int o = x + 1; o < numberSet.length; o++)
            {
                if (numberCurrent == numberSet[o])
                {
                    numberSet[o] = 0;
                }
            }
        }

        System.out.println(numberSetOutput);
        System.out.println(numberDiffOutput);
    }
}

/*Output
The Original Set of Numbers: 12 12 30 12 45 66 78 30 82 19 99 11 11 15 31 18 51 17 12 17 
The Difference Numbers from the Set: 12 30 45 66 78 82 19 99 11 15 31 18 51 17 
*/