/*
Programmer: Columbus Dong
Date: January 23, 2015
Assignment: LCM
School: Manteo High

Description: Find the LCM of Given Numbers
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class testLCM
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("LCM.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Declare Variables for the Numbers*/
        int Number1, Number2, Number3, TotalNumbers;

        while (inFile.hasNext())
        {
            /*Find How Many Numbers Does It Have*/
            /*Get Line from file*/
            String Line = inFile.nextLine();

            /*Turn Line Into Array*/
            final String Numbers[] = Line.split(" ");

            /*Find How Many Numbers*/
            TotalNumbers = Numbers.length;

            if (TotalNumbers == 2)
            {
                Number1 = Integer.parseInt(Numbers[0]);
                Number2 = Integer.parseInt(Numbers[1]);

                LCM findLCM = new LCM(Number1, Number2);
                System.out.println("(" + Number1 + ", " + Number2 + ") LCM is " + findLCM);
            }
            else if (TotalNumbers == 3)
            {
                Number1 = Integer.parseInt(Numbers[0]);
                Number2 = Integer.parseInt(Numbers[1]);
                Number3 = Integer.parseInt(Numbers[2]);
                int LCM;
                
                LCM findLCM = new LCM(Number1, Number2);
                
                LCM = findLCM.getLCM();
                
                LCM findLCM2 = new LCM(LCM, Number3);
                System.out.println("(" + Number1 + ", " + Number2 + ", " + Number3 + ") LCM is " + findLCM2);

                //LCM findLCM = new LCM(Number1, Number2, Number3);
                //System.out.println("" + findLCM);
            }
        }        
    }
}

/*Output
(25, 10) LCM is 50
(81, 41) LCM is 3321
(255, 138) LCM is 11730
(847, 624) LCM is 528528
(84, 420) LCM is 420
(182, 637) LCM is 1274
(620, 420) LCM is 13020
(36, 24) LCM is 72
(75, 125) LCM is 375
(1, 17) LCM is 17
(5, 10, 20) LCM is 20
(18, 24, 52) LCM is 936
(12, 10, 26) LCM is 780
(99, 63, 24) LCM is 5544
(62, 16, 24) LCM is 1488

 */