/*
Programmer: Columbus Dong
Date: November 26, 2014
Assignment: Alphabet Numbers
School: Manteo High

Description: Program convert the letters in a phone number back to numbers
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Triangle
{
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);

        /*Declare Variables For Information*/
        int AngleInfo, LengthInfo;

        /*Declare Variables For Angles*/
        double LowerAngle, UpperAngle;

        /*Declare Variables For Lengths*/
        double HoriLength, VertLength, Hypotenuse;

        /*Assign Placeholder Literals*/
        LowerAngle = 0;
        UpperAngle = 0;
        HoriLength = 0;
        VertLength = 0;
        Hypotenuse = 0;

        /*Angle Header*/
        System.out.println("Angle Choices:");

        /*Angle Choices*/
        System.out.println("1. Lower Angle");
        System.out.println("2. Upper Angle");

        /*Prompt User For Known Angle*/
        System.out.print("What Angle Do You Know? ");
        AngleInfo = Input.nextInt();
        
        /*Space*/
        System.out.println("");
        
        /*Side Length Header*/
        System.out.println("Side Choices:");

        /*Side Length Choices*/
        System.out.println("1. Horizontal Side");
        System.out.println("2. Vertical Side");
        System.out.println("3. Hypotenuse");

        /*Prompt User For Knowen Side Length*/
        System.out.print("What Side Length Do You Know? ");
        LengthInfo = Input.nextInt();
        
        /*Space*/
        System.out.println("");
        
        /*Decision Making For Angle Prompt*/
        System.out.print("What is the Angle? ");

        switch (AngleInfo)
        {
            /*If User Knows Lower Angle*/
            case 1:
                /*Lower Angle*/
                LowerAngle = Input.nextDouble();
                break;

            /*If User Knows Upper Angle*/
            case 2:
                /*Upper Angle*/
                UpperAngle = Input.nextDouble();
                break;

            /*Default*/
            default: 
                System.out.println("You Have Entered Something Incorrectly.");
                break;

        }

        /*Make Sure Angle Is Between 1-89*/
        if (LowerAngle >= 90 || UpperAngle >= 90)
        {
            System.out.println("Warning: Your Angle Lengths Are Invalid!");
            System.exit(1);
        }

        /*Decision Making For Length Prompt*/
        System.out.print("What Is The Length?");

        switch (LengthInfo)
        {
            /*Horizontal Length*/
            case 1:
                HoriLength = Input.nextDouble();
                break;

            /*Vertical Length*/
            case 2:
                VertLength = Input.nextDouble();
                break;

            /*Hypotenuse*/
            case 3:
                Hypotenuse = Input.nextDouble();
                break;

            /*Default*/
            default:
                System.out.println("You Have Entered Something Incorrectly.");
                break;
                
        }

        /*Solve For the Other Angle*/
        if (LowerAngle > 0)
        {
            UpperAngle = 90 - LowerAngle;
        }
        else if (UpperAngle > 0)
        {
            LowerAngle = 90 - UpperAngle;
        }

        /*Solve For the Side Lengths*/
        if (HoriLength > 0)
        {
            /*Solve For Hypotenuse*/
            Hypotenuse = (HoriLength / (Math.cos(Math.toRadians(LowerAngle))));
            Hypotenuse = (int) ((Hypotenuse * 1000));
            Hypotenuse = Hypotenuse/1000;
            
            /*Solve For the Verticle Side*/
            VertLength = (HoriLength * Math.tan(Math.toRadians(LowerAngle)));
            VertLength = (int) ((VertLength * 1000));
            VertLength = VertLength/1000;
        }
        else if (VertLength > 0)
        {
            /*Solve For Hypotenuse*/
            Hypotenuse = (VertLength / (Math.sin(Math.toRadians(LowerAngle))));
            Hypotenuse = (int) ((Hypotenuse * 1000));
            Hypotenuse = Hypotenuse/1000;
            
            /*Solve For Horizontal Side*/
            HoriLength = (VertLength / (Math.tan(Math.toRadians(LowerAngle))));
            HoriLength = (int) ((HoriLength * 1000));
            HoriLength = HoriLength/1000;
        }
        else if (Hypotenuse > 0)
        {
            /*Solve For Horizontal Side*/
            HoriLength = (Hypotenuse * Math.cos(Math.toRadians(LowerAngle)));
            HoriLength = ((int) ((HoriLength * 1000)));
            HoriLength = HoriLength/1000;
            
            /*Solve For Verticle Side*/
            VertLength = (Hypotenuse * Math.sin(Math.toRadians(LowerAngle)));
            VertLength = ((int) ((VertLength * 1000)));
            VertLength = VertLength/1000;
        }
        
        /*Space*/
        System.out.println("");
        
        /*Output*/
        System.out.println("The Final Dimensions of the Tipi are:");
        System.out.println("Lower Angle: " + LowerAngle);
        System.out.println("Upper Angle: " + UpperAngle);
        System.out.println("Horizontal Side Length: "+ HoriLength);
        System.out.println("Vertical Side Length: " + VertLength);
        System.out.println("Hypotenuse: " + Hypotenuse);
    }
}
