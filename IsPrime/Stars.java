/* Programmer: Columbus Dong
  Date: October 16, 2014
  Assignment: Stars
  School: Manteo High
  
  Description: Create a program that creates rows of stars
  
  Difficulties: 
  
  What I Learned: 
 */

//Import Java Utilities
import java.io.*;
import java.util.*;

public class Stars
{
    public static void main(String args[])
    {
        //Create a Scanner
        Scanner Input = new Scanner(System.in);
        
        //Create Variables
        int Rows, Counter;
        
        //Prompt User for Input
        System.out.println("Enter the Starting Size");
        
        //Obtain a Literal from User
        Rows = Input.nextInt();
        
        //Loop
        while (Rows >= 0) //While Row is Greater than 0
        {
            Counter = Rows; //Set the Counter equal to # of Rows
        
            while (Counter >= 0) //While Counter is Greater than 0
            {
                System.out.print("*"); //Make the Stars
                /*
                Use print rather than println since println
                skips lines every loop, while print puts it
                on the same line
                */
                
                Counter = Counter - 1; //Subtract 1 from Counter
            }
            
            System.out.println(""); //Put next loop on different line
            
            Rows = Rows - 1; //Subtract 1 from Rows
        }
    }
}

/*Output:
Enter the Starting Size
12
*************
************
***********
**********
*********
********
*******
******
*****
****
***
**
*
*/