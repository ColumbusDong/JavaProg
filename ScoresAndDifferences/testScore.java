/*
Programmer: Columbus Dong
Date: February 20, 2015
Assignment: Scores and Differences
School: Manteo High
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class testScore
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Scores.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Array Variables*/
        int[] studentID = new int[21];
        int[] studentScore = new int[21];
        int studentCount = 0;
        int scoreSum = 0;
        int indexCounter = 0;
        
        while (inFile.hasNext())
        {
            /*Set Student Info*/
            studentID[indexCounter] = inFile.nextInt();
            studentScore[indexCounter] = inFile.nextInt();

            /*Add to Student Count*/
            studentCount++;

            /*Add to Student Sum*/
            scoreSum = scoreSum + studentScore[indexCounter];
            
            System.out.println("Student Score: " + studentScore[indexCounter]);
            System.out.println("Student Score 15: " + studentScore[15]);
            while (indexCounter < 20)
            {
                indexCounter++;
            }
        }
           
		double scoreAverage = (double) scoreSum/studentCount;
		

        for (int index = 0; index < 20; index++)
        { 
            double scoreDifference;
            scoreDifference = scoreAverage - studentScore[index];

            System.out.println(studentID[index] + "\t" + studentScore[index] + "\t" + scoreDifference);
        }
    }
    
}