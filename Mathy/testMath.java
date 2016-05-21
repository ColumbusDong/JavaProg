/*
Team 5 Leader: Columbus Dong
Team 5: Ben Pachter, Will Lewis, Johnny Styles
Date: Feburary 1-7, 2015
Program: Mathy

Jobs/Programs:
Ben Pachter - Midpoint and Distance && Slope and Equation of a Line given 2 points && Deriative
Will Lewis - Point Slope Form given 2 points && Find parabola given 
Johnny Styles - Volume && Pythagorean Theorem
Columbus Dong - X/Y Table for Linear Equations && X/Y Table for Exponential Equations && Solve Right Triangle
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class testMath
{
    public static void main(String args[])
    {
        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);

        /*Declare variables for responses*/
        int choiceResponse;

        /*Prompt user to select a program*/
        System.out.println("Algebra 1 Buddy by Ben, Columbus, Johnny, and Will");
        System.out.println("Choices: ");
        System.out.println("\t1: Find Midpoint and Distance");
        System.out.println("\t2: Find Slope and the Equation of the Line");
        System.out.println("\t3: Find Point Slope Form");
        System.out.println("\t4: Find the Equation of a Parabola");
        System.out.println("\t5: Find Volume of a Shape");
        System.out.println("\t6: Do Pythagorean Theorem");
        System.out.println("\t7: Show a X/Y Table for a Linear Equation");
        System.out.println("\t8: Show a X/Y Table for an Exponential Equation");
        System.out.println("\t9. Get Derivatives (The Power Rule)");
        System.out.println("\t10. Solve a Right Triangle");
        System.out.print("\nEnter the number of the choice: ");
        choiceResponse = Input.nextInt();

        /*Space*/
        System.out.println("");

        /*Decision Making*/
        /*Many of the programs use similar info, so it is possible for the data to be reused*/
        switch (choiceResponse)
        {
            /*All Use X and Y*/
            case 1:
            case 2:
            case 3:
                UsingXandY(choiceResponse);
                break;

            case 4:
                UsingParabola();
                break;

            case 5:
                UsingVolume();
                break;

            case 6:
                PythagoreanTheorem();
                break;

            case 7:
                LinearTable();
                break;

            case 8:
                ExponentialTable();
                break;

            case 9:
                Deriative();
                break;

            case 10:
                RightTriangle();
                break;

            default:
                System.out.println("Something Went Wrong");
                break;
        }

    }

    /*Choice 1, 2, and 3*/
    public static void UsingXandY(int choice)
    {
        /*Variable for Repeat*/
        boolean repeat = true;

        /*Variables For Coordinates*/
        int X1 = 0, Y1 = 0;     //First Coordinates
        int X2 = 0, Y2 = 0;     //Second Coordinates
        double slope = 1, intercept = 1;

        /*Variables*/
        String response;
        int selection = choice;

        /*Declare a Scanner*/
        Scanner Input = new Scanner(System.in);

        /*First Coordinate*/
        while (repeat == true)
        {

            /*Prompt User For X1 and Y1*/
            System.out.print("Enter the First Point(No Spaces, X and Y Seperated by a comma) [EX: 5,3]: ");
            String fstCoor = Input.nextLine();

            final String coor1[] = fstCoor.split(",");
            X1 = Integer.parseInt(coor1[0]);
            Y1 = Integer.parseInt(coor1[1]);

            /*Ask User If Coordinate is Correct*/
            System.out.print("Is (" + X1 + ", " + Y1 + ") correct(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
                repeat = false;
            }
        }

        /*Space and Reset repeat*/
        repeat = true;
        System.out.println("");

        /*Second Coordinate*/
        while (repeat == true)
        {

            /*Prompt User For X2 and Y2*/
            System.out.print("Enter the Second Point(No Spaces, X and Y Seperated by a comma) [EX: 5,3]: ");
            String sndCoor = Input.nextLine();

            final String coor2[] = sndCoor.split(",");
            X2 = Integer.parseInt(coor2[0]);
            Y2 = Integer.parseInt(coor2[1]);

            /*Ask User If Coordinate is Correct*/
            System.out.print("Is (" + X2 + ", " + Y2 + ") correct(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
                repeat = false;
            }
        }

        System.out.println("");

        /*Decide Which Program It Was*/
        if (selection == 1)
        {
            /*Midpoint and Distance Area - Ben*/
            DistanceAndMidpoint Distance = new DistanceAndMidpoint(X1, Y1, X2, Y2);
            System.out.println(Distance);
            
            System.out.println("");

            /*Ask User If They Want the Slope and Equation of the Line*/
            System.out.print("Would you like the slope and the equation of the line as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            System.out.println("");

            if (response.equals("Y"))
            {
                /*Slope and Equation of the Line - Ben*/
                SlopeMxB Linear = new SlopeMxB(X1, Y1, X2, Y2);
                System.out.println(Linear);
                slope = Linear.getSlope();
                intercept = Linear.getIntercept();
            }

            System.out.println("");

            /*Ask User If They Want the Point Slope Form*/
            System.out.print("Would you like it in the point slope form as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
                /*Point Slope Form - Will*/
                PointSlope newForm = new PointSlope(X1, Y1, X2, Y2);
                System.out.println(newForm.PointForm());
            }

            System.out.println("");

            /*Ask If They Want A Table As Well*/
            System.out.print("Would you like a X/Y Table as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
            	System.out.println("");

                /*Linear Table - Columbus*/
                System.out.print("Beginning X Value: ");
                int start = Input.nextInt();

                System.out.println("");

                System.out.print("Ending X Value: ");
                int end = Input.nextInt();

                System.out.println("");

                System.out.print("Increase X by: ");
                int step = Input.nextInt();
                SpecialLinearTable(slope, intercept, start, end, step);
            }

        }
        else if (selection == 2)
        {
            /*Slope and Equation of the Line - Ben*/
            SlopeMxB Linear = new SlopeMxB(X1, Y1, X2, Y2);
            System.out.println(Linear);
            
            slope = Linear.getSlope();
			intercept = Linear.getIntercept();
			
            System.out.println("");

            /*Ask User If they want Distance and MidPoint*/
            System.out.print("Would you like the distance and midpoint as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            System.out.println("");

            if (response.equals("Y"))
            {
                /*Distance and Midpoint - Ben*/
                DistanceAndMidpoint Distance = new DistanceAndMidpoint(X1, Y1, X2, Y2);
                System.out.println(Distance);
            }

            System.out.println("");

            /*Ask User If They Want the Point Slope Form*/
            System.out.print("Would you like it in the point slope form as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            System.out.println("");

            if (response.equals("Y"))
            {
                /*Point Slope Form - Will*/
                PointSlope newForm = new PointSlope(X1, Y1, X2, Y2);
                System.out.println(newForm.PointForm());
            }

            System.out.println("");

            /*Ask If They Want A Table As Well*/
            System.out.print("Would you like a X/Y Table as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
            	System.out.println("");

                /*Linear Table - Columbus*/
                System.out.print("Beginning X Value: ");
                int start = Input.nextInt();

                System.out.println("");

                System.out.print("Ending X Value: ");
                int end = Input.nextInt();

                System.out.println("");

                System.out.print("Increase X by: ");
                int step = Input.nextInt();
                SpecialLinearTable(slope, intercept, start, end, step);
            }

        }
        else if (selection == 3)
        {
            /*Point Slope Form - Will*/
            PointSlope newForm = new PointSlope(X1, Y1, X2, Y2);
            System.out.println(newForm.PointForm());

            System.out.println("");

            /*Ask User If they want Distance and MidPoint*/
            System.out.print("Would you like the distance and midpoint as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            System.out.println("");

            if (response.equals("Y"))
            {
                /*Distance and Midpoint - Ben*/
                DistanceAndMidpoint Distance = new DistanceAndMidpoint(X1, Y1, X2, Y2);
                System.out.println(Distance);
            }

            System.out.println("");

            /*Ask User If They Want the Slope and Equation of the Line*/
            System.out.print("Would you like the slope and the equation of the line as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            System.out.println("");

            if (response.equals("Y"))
            {
                /*Slope and Equation of the Line - Ben*/
                SlopeMxB Linear = new SlopeMxB(X1, Y1, X2, Y2);
                System.out.println(Linear);
                
                slope = Linear.getSlope();
				intercept = Linear.getIntercept();
            }

            System.out.println("");

            /*Ask If They Want A Table As Well*/
            System.out.print("Would you like a X/Y Table as well(Y/N)? ");
            response = Input.nextLine();

            response = response.toUpperCase();

            if (response.equals("Y"))
            {
            	System.out.println("");


                /*Linear Table - Columbus*/
                System.out.print("Beginning X Value: ");
                int start = Input.nextInt();

                System.out.println("");

                System.out.print("Ending X Value: ");
                int end = Input.nextInt();

                System.out.println("");

                System.out.print("Increase X by: ");
                int step = Input.nextInt();
                SpecialLinearTable(slope, intercept, start, end, step);
            }
        }
    }

    /*Choice 4*/
    public static void UsingParabola()
    {
        Parabola pt = new Parabola();
        
        System.out.print(pt.findParabola());
    }

    /*Choice 5*/
    public static void UsingVolume()
    {
        Vol Volume = new Vol();
    }

    /*Choice 6*/
    public static void PythagoreanTheorem()
    {
        /**
         * inputs for the three sides
         */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A(enter 0 if not given): ");
        int a=input.nextInt();
        
        System.out.println("");
        System.out.print("Enter B(enter 0 if not given): ");
        int b=input.nextInt();
        
        System.out.println("");
        System.out.print("Enter C(enter 0 if not given): ");
        int c=input.nextInt();

        PT Triangle = new PT(a, b, c);
    }

    /*Choice 7*/
    public static void LinearTable()
    {
        Scanner Input = new Scanner(System.in);
        String response = "N";
        double slope = 1, intercept = 1;
        int start = 1, end = 1, step = 1;

        while (response.equals("N"))
        {
            /*Prompts*/
            System.out.print("The Slope: ");
            slope = Input.nextDouble();

            System.out.println("");

            System.out.print("The Y-intercept(B): ");
            intercept = Input.nextDouble();

            System.out.println("");

            System.out.print("Beginning X Value: ");
            start = Input.nextInt();

            System.out.println("");

            System.out.print("Ending X Value: ");
            end = Input.nextInt();

            System.out.println("");

            System.out.print("Increase X by: ");
            step = Input.nextInt();

            //System.out.println("");

            /*Ask If Equation is Correct*/
            System.out.println("Is the equation Y = " + slope + "X + " + intercept + " correct? (Y/N): ");
            response = Input.next();
            response = response.toUpperCase();
        }
            System.out.println("");
        
            LinearTable Table = new LinearTable(slope, intercept, start, end, step);
            System.out.println(Table);


    }

    public static void SpecialLinearTable(double m, double b, int start, int end, int step)
    {
            LinearTable Table = new LinearTable(m, b, start, end, step);
            System.out.println(Table);
    }

    /*Choice 8*/
    public static void ExponentialTable()
    {
        Scanner Input = new Scanner(System.in);
        String response = "N";

        double initialAmount, rate;
        int startTime, endTime, step;

        /*Prompts*/
        System.out.print("Initial Amount: ");
        initialAmount = Input.nextDouble();

        System.out.println("");

        System.out.println("**For Growth = Positive Rate***For Decay = Negative Rate***\nEX. 6% Growth = .06 *** EX. 6% Decay = -.06");

        System.out.print("Rate: ");
        rate = Input.nextDouble();

        System.out.println("");

        System.out.print("Starting Time: ");
        startTime = Input.nextInt();

        System.out.println("");

        System.out.print("Ending Time: ");
        endTime = Input.nextInt();

        System.out.print("Increase Time by: ");
        step = Input.nextInt();
        
        System.out.println("");
        
        ExponentialTable Table = new ExponentialTable(initialAmount, rate, startTime, endTime, step);
        System.out.println(Table);

        System.out.println("");
    }

    /*Choice 9*/
    public static void Deriative()
    {
        GetDerivative derive = new GetDerivative();
    }

    /*Choice 10*/
    public static void RightTriangle()
    {
        Triangle solve = new Triangle();
    }
}