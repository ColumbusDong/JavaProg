/*
Programmer: Columbus Dong
Date: November 26, 2014
Assignment: Vowel Star
School: Manteo High

Description: Program that replaces all vowels in a name with *
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class Vowels
{
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);
        
        /*Declare String Object*/
        String FirstName, LastName, FullName, AstName, Letter;
        
        /*Set up Object*/
        FullName = new String();
        AstName = new String();
        Letter = new String();
        /*Declare Variables for Length*/
        int FirstLength, LastLength, FullNameLength;
        
        /*Declare Varibles For Loop*/
        int Counter = 0;
        
        /*Prompt for the Name*/
        System.out.print("Enter Your Name: ");
        FirstName = new String(Input.next());
        LastName = new String(Input.next());
        
        /*Space Infront of Last Name*/
        LastName = " " + LastName;
        
        /*Find Length of First Name*/
        FirstLength = FirstName.length();
        
        /*Find Length of Last Name*/
        LastLength = LastName.length();
        
        /*Check if Odd or Even Number*/
        if ( (FirstLength + LastLength) % 2 == 0)
        {
            /*If it is Even*/
            /*Two Spaces*/
            FullName = FirstName + " " + LastName;
            
            /*Find Length of Full Name*/
            FullNameLength = FullName.length();
        }
        else
        {
            /*If it is Odd*/
            /*One Space*/
            FullName = FirstName + LastName;
            
            /*Find Length of Full Name*/
            FullNameLength = FullName.length();
        }
        
        /*Format Spaces*/
        /*Variables for Spaces*/
        int HalfLength = (int) (FullNameLength / 2);
        int MidpointColumn = (37);  //*Assume Default Console Size around 74 Columns
        
        for (int X = 1; X <= (MidpointColumn - HalfLength); X++)
        {
            System.out.print(" ");
        }
        
        /*Reprint the Name with * */
        while (Counter <= FullNameLength) 
        {
           /*Print Out the Letter*/
           System.out.print(Letter);
           
           /*Check to See if the Index is within Bounds*/
           try 
           {
               /*Current Letter*/
               Letter = Character.toString(FullName.charAt(Counter));
            
               /*Check if a Vowel*/
               if (Letter.equals("a") || Letter.equals("e") || Letter.equals("i") || Letter.equals("o") || Letter.equals("u"))
               {
                   /*Change Character to a Star*/
                   Letter = "*";
               }
           }         
           catch (StringIndexOutOfBoundsException e)
           {
               /*Nothing*/
           }
           
           /*Concat the Ltters Together Again*/
           AstName.concat(Letter);
           
           /*Add 1 to the Counter*/
           Counter++;
        }
        
    }
}

/*Output*/
/*Enter Your Name: Micky Mouse
                                M*cky M**s*
*/