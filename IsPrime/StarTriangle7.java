/*
Programmer: Columbus Dong
Date: December 16, 2014
Assignment: Star Triangle
School: Manteo High

Description: Program that taakes user input number of rows and choice of Triangle
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class StarTriangle7
{
    /*Choice 1*/
    public static void RightTriangle()
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variables*/
        
        /*Spaces*/
        int SpaceCounter, SpaceMax;
        
        /*Stars*/
        int StarCounter;
        
        /*Rows*/
        int RowCounter, RowMax;
        
        /*Prompt User For Max Rows*/
        System.out.print("How Many Rows? ");
        RowMax = Input.nextInt();
        
        /*Assign Literals*/
        SpaceMax = RowMax;
        SpaceCounter = 1;
        StarCounter = 1;
        RowCounter = 1;
        
        while (RowCounter <= RowMax)
        {
            /*Assign Literals/Reset*/
            SpaceCounter = 1;
            StarCounter = 1;
        
            /*Subtract 1 From Space Max Each Iteration*/
            SpaceMax -= 1;
            
            /*Make Sure That When Space Hits 0, Doesnt Crash*/
            if (SpaceMax >= SpaceCounter)
            {
                /*Print Spaces*/
                while (SpaceCounter <= SpaceMax)
                {
                    System.out.print(" ");
                    SpaceCounter++;
                }
            }
            
            /*Add 1 to Row*/
            RowCounter++;
            
            /*Stars*/
            while (StarCounter < RowCounter)
            {
                System.out.print("*");
                StarCounter++;
            }
            
            System.out.println(""); //Put next loop on different line
        }
        
    }
    
    /*Choice 2*/
    public static void LeftTriangle()
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variables*/
        
        /*Stars*/
        int StarCounter, StarMax;
        
        /*Rows*/
        int RowCounter, RowMax;
        
        /*Prompt User For Max Rows*/
        System.out.print("How Many Rows? ");
        RowMax = Input.nextInt();
        
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
            while (StarCounter < RowCounter)
            {
                System.out.print("*");
                StarCounter++;
            }
            
            System.out.println(""); //Put next loop on different line
        }
        
    }
    
    /*Choice 3*/
    public static void CenterTriangle()
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variables*/
        
        /*Spaces*/
        int SpaceCounter, SpaceMax;
        
        /*Stars*/
        int StarCounter, StarMax;
        
        /*Rows*/
        int RowCounter, RowMax;
        
        /*Prompt User For Max Rows*/
        System.out.print("How Many Rows? ");
        RowMax = Input.nextInt();
        
        /*Assign Literals*/
        SpaceMax = RowMax;
        SpaceCounter = 1;
        StarCounter = 1;
        RowCounter = 1;
        StarMax = 1;
        
        while (RowCounter <= RowMax)
        {
            /*Assign Literals/Reset*/
            SpaceCounter = 1;
            StarCounter = 1;
        
            /*Subtract 1 From Space Max Each Iteration*/
            SpaceMax -= 1;
            
            /*Make Sure That When Space Hits 0, Doesnt Crash*/
            if (SpaceMax >= SpaceCounter)
            {
                /*Print Spaces*/
                while (SpaceCounter <= SpaceMax)
                {
                    System.out.print(" ");
                    SpaceCounter++;
                }
            }
            
            
            /*Stars*/
            while (StarCounter <= StarMax)
            {
                System.out.print("*");
                StarCounter++;
            }
            
            /*Add 2 To Star Max*/
            StarMax += 2;
            
            /*Add 1 to Row*/
            RowCounter++;
            
            System.out.println(""); //Put next loop on different line
        }
    }
    
    /*Main Screen*/
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variable*/
        int Choice;
        
        /*Display Options*/
        System.out.println("Types Of Triangles");
        System.out.println("\t 1. Left");
        System.out.println("\t 2. Right");
        System.out.println("\t 3. Center");
        
        /*Prompt For Choice*/
        System.out.print("Enter A Number (1-3): ");
        Choice = Input.nextInt();
        
        switch (Choice)
        {
            case 1:
                LeftTriangle();
                break;
                
            case 2:
                RightTriangle();
                break;
                
            case 3:
                CenterTriangle();
                break;
            
            default:
                System.out.println("Something Went Wrong!");
                break;
        }
    }
}

/*Output:
Types Of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter A Number (1-3): 1
How Many Rows? 5
*
**
***
****
*****

Types Of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter A Number (1-3): 2
How Many Rows? 5
    *
   **
  ***
 ****
*****

Types Of Triangles
	 1. Left
	 2. Right
	 3. Center
Enter A Number (1-3): 3
How Many Rows? 5
    *
   ***
  *****
 *******
*********
 */