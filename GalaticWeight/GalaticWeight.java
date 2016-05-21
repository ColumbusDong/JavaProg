/*Programmer: Columbus
Date: March 5, 2015
Assignment: Galatic Weight
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class GalaticWeight
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.####");

        double[] weightConversion = {.27, .85, .16, .38, 2.64, 1.17, 1.12, .25};
        String[] destination = {"Mercury", "Venus", "Moon", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};

        final double kilogramConversion = .453592;

        int planetChoice = 0;
        double weight;
        double weightNew;
        
        /*Choices*/
        System.out.println("Find your weight at the following destinations:\n1. Mercury\n2. Venus\n3. Moon\n4. Mars\n5. Jupiter\n6. Saturn\n7. Neptune\n8. Pluto\n9. Quit");

        /*Space*/
        System.out.println("");

        while (planetChoice == 0)
        {
            /*Prompt*/
            System.out.print("Select a Destination by Number(or 9 to Quit): ");
            planetChoice = Input.nextInt();

            if (planetChoice > 9 || planetChoice <= 0)
            {
                System.out.println("ERROR - Invalid Choice!");
                System.out.println("Please enter a valid choice.");
                System.out.println("");

                planetChoice = 0;
            }

            if (planetChoice == 9)
            {
                System.exit(0);
            }
        }

        /*Prompt*/
        System.out.print("Enter your current weight: ");
        weight = Input.nextDouble();

        weightNew = weight * weightConversion[planetChoice - 1];

        System.out.println("Your weight on " + destination[planetChoice - 1] + " would be " + format.format(weightNew) + " lbs. or " + format.format((weightNew * kilogramConversion)) + " kg.");

    }
}

/*Output
Find your weight at the following destinations:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit

Select a Destination by Number(or 9 to Quit): 5
Enter your current weight: 220
Your weight on Jupiter would be 580.8 lbs. or 263.4462 kg.
*/