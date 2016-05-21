/*
Programmer: Columbus Dong
Assignment: Scores
Date: February 20, 2015
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.*;

public class Scores
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

        /*Score Variables*/
        int scoreSum = 0;
        int studentCount = 0;
        double scoreAverage = 0;
        int index = 0;

        while (inFile.hasNext())
        {
            /*Give Array Indexes Literals*/
            studentID[index] = inFile.nextInt();
            studentScore[index] = inFile.nextInt();

            /*Add to studentCount*/
            studentCount++;

            /*Add to Score Sum*/
            scoreSum += studentScore[index];

            if (index < 21)
            {
                index++;
            } 
        }

        scoreAverage = averageScores(scoreSum, studentCount);

        /*Header*/
        System.out.println("ID\tScore\tAverage");

        /*Output*/
        DecimalFormat twoPlaces = new DecimalFormat("0.00");

        for (int pIndex = 0; pIndex < 21; pIndex++)
        {
            final double scoreDifference;
            scoreDifference = scoreAverage - studentScore[pIndex];

            System.out.println(studentID[pIndex] + "\t" + studentScore[pIndex] + "\t" + twoPlaces.format(scoreDifference));
        }

        System.out.println("");
        System.out.println("Stats:");
        System.out.println("Total Students: " + studentCount);
        System.out.println("Score Sum: " + scoreSum);
        System.out.println("Score Average: " + twoPlaces.format(scoreAverage));

    }

    public static double averageScores(int Sum, int Count)
    {
        double avg;

        avg = (double) Sum/Count;
        return avg;
    }
}	

/*Output:
ID	Score	Average
115	257	-14.38
123	253	-10.38
116	246	-3.38
113	243	-0.38
112	239	3.62
104	239	3.62
110	238	4.62
218	243	-0.38
208	242	0.62
222	223	19.62
223	230	12.62
213	229	13.62
207	228	14.62
203	224	18.62
305	265	-22.38
306	262	-19.38
311	256	-13.38
325	246	-3.38
321	245	-2.38
323	245	-2.38
302	242	0.62

Stats:
Total Students: 21
Score Sum: 5095
Score Average: 242.62
*/