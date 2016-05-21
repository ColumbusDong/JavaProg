/*
Programmer: Columbus Dong
Date: January 14, 2015
Assignment: Histogram Function
School: Manteo High

Description: Program that outputs a histogram based on a floating number and a character
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Histogram
{
    /*Main*/
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare Variables for Floating Number*/
        float Number;
        
        /*Declare Variable for Graphing Character Response*/
        String Response;
        
        /*Declare Variable for User Character*/
        String Character;
        
        /*Prompt User For the Floating Number*/
        System.out.print("Enter Value to Chart: ");
        Number = Input.nextFloat();
        
        /*Prompt For If User Character*/
        System.out.print("Do You Wish to Supply the Graphing Character (Y/N): ");
        Response = Input.next();
        
        if (Response.equals("Y")|| Response.equals("y"))
        {
            /*Prompt For The Character*/
            System.out.print("Enter the Character: ");
            Character = Input.next();
            
            /*Execute Histogram*/
            Histogram(Number, Character);
        }
        else
        {
            /*Execute Histogram*/
            Histogram(Number);
        }
        
    }
    
    /*If Response was No*/
    public static void Histogram(float Length)
    {
        /*Declare Variable for Counter*/
        int Counter = 1;
        
        /*Declare Variable for Rounded Number*/
        int Round = Math.round(Length);
        
        while (Counter <= Round)
        {
            /*Print Out Stars*/
            System.out.print("*");
            
            /*Add 1 to Counter*/
            Counter++;
        }
        
        /*Print Out the Original Number*/
        System.out.print(" " + Length);
        
        /*Space*/
        System.out.println();
    }
    
    /*If Response was Yes*/
    public static void Histogram(float Length, String Bar)
    {
        /*Declare Variable for Counter*/
        int Counter = 1;
        
        /*Declare Variable for Rounded Number*/
        int Round = Math.round(Length);
        
        while (Counter <= Round)
        {
            /*Print Out the Character*/
            System.out.print(Bar);
            
            /*Add 1 to Counter*/
            Counter++;
        }
        
        /*Print Out the Original Number*/
        System.out.print(" " + Length);
        
        /*Space*/
        System.out.println();
    }
}

/*Output:
Enter Value to Chart: 13.5
Do You Wish to Supply the Graphing Character (Y/N): y
Enter the Character: #
############## 13.5

Enter Value to Chart: 13.4
Do You Wish to Supply the Graphing Character (Y/N): y
Enter the Character: $
$$$$$$$$$$$$$ 13.4
*/