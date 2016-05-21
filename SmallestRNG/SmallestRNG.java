/*
Programmer: Columbus Dong
Date: January 15, 2015
Assignment: Smallest RNG
School: Manteo High

Description: Program that obtains three values and multiplies the sum of the 2 largest by the smallest
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.String;

public class SmallestRNG
{
    /*Main*/
    public static void main(String args[])
    {
        /*Declare Variables*/
        boolean Repeat = true;
        Random RandomNG = new Random();
        int Num1, Num2, Num3;
        int Smallest, Largest, Middle;
        int Maths;
        Scanner Input = new Scanner(System.in);
        String Response;
        
        /*Loop*/
        while (Repeat == true)
        {
            /*RNG a number between 0 and 24*/
            Num1 = RandomNG.nextInt(25);
            Num2 = RandomNG.nextInt(25);
            Num3 = RandomNG.nextInt(25);
            
            /*Bring Back The Result As a String*/
            String Result = new String();
            Result = NumOrder(Num1, Num2, Num3);
            
            /*Seperate The String*/
            Smallest = Integer.parseInt(Result.split(",.,")[0]);
            Middle = Integer.parseInt(Result.split(",.,")[1]);
            Largest = Integer.parseInt(Result.split(",.,")[2]);
            
            /*Execute the Calculations Method*/
            Maths = Calculations(Largest, Middle, Smallest);

            /*Print the Numbers*/
            System.out.println("Your Three Numbers are: " + Num1 + "\t" + Num2 + "\t" + Num3);
            System.out.println("The Smallest # Times the Sum of the Other Two # is: " + Maths);
            
            /*Prompt User If Do Again*/
            System.out.print("Repeat? (Y/N): ");
            Response = Input.next();
            
            if (Response.equals("Y") || Response.equals("y"))
            {
                Repeat = true;
            }
            else
            {
                Repeat = false;
            }
            
            /*Space*/
            System.out.println("");
        }
    }

    /*Find the Order*/
    public static String NumOrder(int Num1, int Num2, int Num3)
    {

        /*Check For the Same Number*/
        if (Num1 == Num2 && Num2 == Num3)
        {
            return (Num1 + ",.," + Num2 + ",.," + Num3);
        }
        else if (Num1 == Num2 && Num1 < Num3)
        {
            return (Num1 + ",.," + Num2 + ",.," + Num3);
        }
        else if (Num1 == Num2 && Num1 > Num3)
        {
            return (Num3 + ",.," + Num1 + ",.," + Num2);
        }
        else if (Num1 == Num3 && Num1 < Num2)
        {
            return (Num1 + ",.," + Num3 + ",.," + Num2);
        }
        else if (Num1 == Num3 && Num1 > Num2)
        {
            return (Num2 + ",.," + Num1 + ",.," + Num3);
        }
        else if (Num2 == Num3 && Num2 < Num1)
        {
            return (Num2 + ",.," + Num3 + ",.," + Num1);
        }
        else if (Num2 == Num3 && Num2 > Num1)
        {
            return (Num1 + ",.," + Num2 + ",.," + Num3);
        }
        
        /*Check For the Smallest*/
        if (Num1 < Num2 && Num2 < Num3)
        {   
            /*Num1 < Num2 < Num3*/
            return (Num1 + ",.," + Num2 + ",.," + Num3);
        }
        else if (Num1 < Num2 && Num2 > Num3 && Num1 < Num3)
        {
            /*Num1 < Num3 < Num2*/
            return (Num1 + ",.," + Num3 + ",.," + Num2);
        }
        else if (Num1 < Num2 && Num2 > Num3 && Num1 > Num3)
        {
            /*Num3 < Num1 < Num2*/
            return (Num3 + ",.," + Num1 + ",.," + Num2);
        }
        else if (Num1 > Num2 && Num2 > Num3)
        {
            /*Num3 < Num2 < Num1*/
            return (Num3 + ",.," + Num2 + ",.," + Num1);
        }
        else if (Num1 > Num2 && Num1 < Num3)
        {
            /*Num2 < Num1 < Num3*/
            return (Num2 + ",.," + Num1 + ",.," + Num3);
        }
        else
        {
            /*Num2 < Num3 < Num1*/
            return (Num2 + ",.," + Num3 + ",.," + Num1);
        }
    }
    
    /*For Math*/
    public static int Calculations(int Largest, int Middle, int Smallest)
    {
        return (Smallest * (Largest + Middle));
    }
}

/*Output:
Your Three Numbers are: 1	3	2
The Smallest # Times the Sum of the Other Two # is: 5
Repeat? (Y/N): y

Your Three Numbers are: 0	5	11
The Smallest # Times the Sum of the Other Two # is: 0
Repeat? (Y/N): y

Your Three Numbers are: 17	11	5
The Smallest # Times the Sum of the Other Two # is: 140
Repeat? (Y/N): y

Your Three Numbers are: 5	11	9
The Smallest # Times the Sum of the Other Two # is: 100
Repeat? (Y/N): y

Your Three Numbers are: 4	5	6
The Smallest # Times the Sum of the Other Two # is: 44
Repeat? (Y/N): y

Your Three Numbers are: 24	6	17
The Smallest # Times the Sum of the Other Two # is: 246
Repeat? (Y/N): n
*/