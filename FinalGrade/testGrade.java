/*
Programmer: Columbus Dong
Date: January 31, 2015
Assignment: Final Grade
School: Manteo High
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;

public class testGrade
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Grades.text"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }


        /*Declare Variables*/
        int quiz1, quiz2, midterm, finalExam, student = 0;

        /*Header*/
        System.out.println("Student\t" + "Quiz 1\t" + "Quiz 2\t" + "Midterm\t" + "Final Exam\t" + "Final %\t" + "Grade"); 
        
        while (inFile.hasNext())
        { 
                /*Assign All Literals*/
                quiz1 = inFile.nextInt();
                quiz2 = inFile.nextInt();
                midterm = inFile.nextInt();
                finalExam = inFile.nextInt();

                /*Add 1 to Student*/
                student++;

                Grade grades = new Grade(quiz1, quiz2, midterm, finalExam);
                System.out.println(student + "\t" + quiz1 + "\t" + quiz2 + "\t" + midterm + "\t" + finalExam + "\t\t" + grades);
            }
    }
}

/*Output:
Student	Quiz 1	Quiz 2	Midterm	Final Exam	Final %	Grade
1	      8	      7	    89	       94		88.0	B
2	      9	      6	    77	       90		83.0	B
3	      10      10	65	       88		85.25	B
4	      7	      5   	80	       81		75.5	C

 */