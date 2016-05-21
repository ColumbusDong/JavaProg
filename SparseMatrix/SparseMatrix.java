/*
Programmer: Columbus Dong
Assignment: Sparse Matrix
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
                inFile = new Scanner (new File("Matrix.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*2-D Arrays*/
        int originalArray[][];
        int reducedArray[][];

        /*Loop While File has Values*/
        while (inFile.hasNext())
        {
            /*Get the Column*/
        }

    }
}