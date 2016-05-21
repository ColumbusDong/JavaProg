/*
Programmer: Columbus Dong
Date: December 16, 2014
Assignment: Soh Cah Toa
School: Manteo High

Description: Program that calculates the missing side length or angle of a Triangle
*/

//System.out.println(Math.cos(Math.toRadians(50)));

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class SohCahToa
{
    /*Main*/
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variables*/
        int GivenInfo1, GivenInfo2;
        
        /*Print Out Right Triangle*/
        Triangle();
        
        /*Prompt User For Known Info*/
    }
    
    /*Extra Credit For Visuals*/
    public static void Triangle()
    {
        /*Stars*/
        int StarCounter, StarMax;
        
        /*Rows*/
        int RowCounter, RowMax;
        
        /*Max Rows*/
        RowMax = 15;
        
        /*Assign Literals*/
        StarCounter = 1;
        RowCounter = 1;
        
        while (RowCounter <= RowMax)
        {
            /*Assign Literals/Reset*/
            StarCounter = 1;
            
            /*Add 1 to Row*/
            RowCounter++;
            
            /*Stars*/
            System.out.print("*");
            while (StarCounter < RowCounter - 2)
            {
                System.out.print(" ");
                StarCounter++;
            }
            System.out.print("*");
            
            System.out.println(""); //Put next loop on different line
        }
        
    }
}
        