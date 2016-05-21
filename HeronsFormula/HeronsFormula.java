/*
Programmer: Columbus Dong
Date: January 15, 2015
Assignment: Heron's Formula
School: Manteo High

Description: Program that finds the area of a triangle using Heron's Formula
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;
import java.text.*;

public class HeronsFormula
{
    /*Main*/
    public static void main(String args[])
    {
       /*Scanner from File Stuff*/
        Scanner inFile = null; 
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("SideLengths.text"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Declare Variables*/
        int A, B, C;
        double Area;

        /*Header*/
        System.out.println("A" + "\t" + "B" + "\t" + "C" + "\tArea");
        
        /*Loop While File Has Numbers*/
        while (inFile.hasNext())
        {
            /*Get A*/
            A = inFile.nextInt();
            /*Get B*/
            B = inFile.nextInt();
            /*Get C*/
            C = inFile.nextInt();

            if (CheckTriangle(A, B, C) == true)
            {
                Herons(A, B, C);
            }
            else
            {
                System.out.println(A + "\t" + B + "\t" + C + "\tThis is NOT a Triangle");
            }
        }

    }

    /*Check if Side Lengths Make a Triangle*/
    public static boolean CheckTriangle(int A, int B, int C)
    {
        /*If Side Lengths fufill Condition of Triangle*/
        if (A + B > C && A + C > B && B + C > A)
        {
            /*Return True*/
            return true;
        }

        return false;
    }

    /*Calculate Heron's Formula*/
    public static void Herons(int A, int B, int C)
    {
        /*Calculate S*/
        double S;
        S = (A + B + C)/2;
        
        /*Find the Area*/
        double Area;
        Area = Math.sqrt((S)*(S - A)*(S - B)*(S - C));
        
        /*Declare a Decimal Format*/
        DecimalFormat Round = new DecimalFormat ("##.000");
        
        System.out.println(A + "\t" + B + "\t" + C + "\t" + Round.format(Area));
    }
}

/*Output:
A	B	C	Area
7	8	9	26.833
9	9	12	40.249
6	5	21	This is NOT a Triangle
24	7	25	84.000
13	12	5	30.000
50	40	30	600.000
10	10	10	43.301
82	34	48	This is NOT a Triangle
4	5	6	6.481
*/