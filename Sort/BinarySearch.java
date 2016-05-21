/*
Programmer: Columbus Dong
Date: March 13, 2015
Assignment: Binary Search
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class BinarySearch
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Sorted.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Array*/
        int[] sortNums = new int[60];

        /*Assign  Values*/
        for (int i = 0; inFile.hasNext(); i++)
        {
            sortNums[i] = inFile.nextInt();
        }

        /*Variables*/
        int indexResult = 0;
        int indexLength = sortNums.length;
        int targetNumber = 0;

        Scanner Input = new Scanner(System.in);

        /*Prompt User For Number*/
        System.out.print("Enter a number to search for: ");
        targetNumber = Input.nextInt();

        indexResult = binarySearch(sortNums, indexLength, targetNumber);

        if (indexResult == -1)
        {
            System.out.println("Your number does not occur in this list");
        }
        else
        {
            System.out.println("Your number occurs at position: " + (indexResult + 1));
        }
    }

    public static int binarySearch(int[] dataNumbers, int arraySize, int targetNumber)
    {
        /*Set Bounds*/
        int lowerBound = 0;
        int upperBound = arraySize - 1;
        int middleBound = 0;

        while (upperBound >= lowerBound)
        {
            /*Find Center*/
            middleBound = (lowerBound + upperBound) / 2;

            /*Finds a Match*/
            if (dataNumbers[middleBound] == targetNumber)
            {
                return middleBound;
            }

            /*Change the bounds*/
            if (dataNumbers[middleBound] < targetNumber)
            {
                lowerBound = middleBound + 1;
            }
            else if (dataNumbers[middleBound] > targetNumber)
            {
                upperBound = middleBound - 1;
            }
        }

        /*No match found*/
        return -1;
    }
}

/*Output
Enter a number to search for: 110
Your number does not occur in this list

Enter a number to search for: 60
Your number occurs at position: 41

Enter a number to search for: 1
Your number occurs at position: 1

Enter a number to search for: 92
Your number occurs at position: 53

Enter a number to search for: 17
Your number does not occur in this list
*/