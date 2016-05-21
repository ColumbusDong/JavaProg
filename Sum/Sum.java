/*
Programmer:Columbus Dong
Date: May 1, 2015
ASsignment Sum Sum Sum
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.*;

public class Sum
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Sums.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Arrays*/
        double[][] sales = new double[4][6];
        double[] dayTotals = new double[6];

        while (inFile.hasNext())
        {
            int saleRep = inFile.nextInt() - 1;     //Hold Sale Rep 
            int saleDay = inFile.nextInt() - 1;     //Hold Sale Day
            double saleValue = inFile.nextDouble(); //Hold Sale Value

            sales[saleRep][saleDay] = saleValue;    //Add to Array
        }

        double total;

        /*Find the Week Total for Each Rep*/
        for (int repNum = 0; repNum < 4; repNum++)
        {
            total = 0;

            for (int repDay = 0; repDay < 5; repDay++)
            {
                total += sales[repNum][repDay]; //total up days for the rep
            }

            sales[repNum][5] = total;   //set Value in the 5th Colum to the rep total
        }

        /*Find the Daily Total*/
        for (int repDay = 0; repDay < 6; repDay++)
        {
            total = 0;  //Reuse total

            for (int repNum = 0; repNum < 4; repNum++)
            {
                total += sales[repNum][repDay]; //total up the days
            }

            dayTotals[repDay] = total;  //set the values
        }

        /*Output*/
        DecimalFormat df = new DecimalFormat("$#.00"); 

        System.out.println("Sales Representative:\t  1\t  2\t  3\t  4\t  5\t Total");

        /*Print Out Table*/
        for (int repNum = 0; repNum < 4; repNum++)
        {
            System.out.print("\t"+ (repNum + 1) + "\t\t");
            
            for (int repDay = 0; repDay < 6; repDay++)
            {
                System.out.print(df.format(sales[repNum][repDay]) + "\t");
            }

            System.out.println("");
        }

        /*Print Out Last Row*/
        System.out.print("\tTotal\t\t");
        for(int i = 0; i < 6; i++)
        {
            System.out.print(df.format(dayTotals[i]) + "\t");
        }
    }
}

/*
Output:
Sales Representative:     1   2   3   4   5  Total
    1       $97.55  $121.77 $.00    $253.66 $184.22 $657.20 
    2       $152.44 $104.53 $.00    $189.97 $247.88 $694.82 
    3       $97.55  $301.00 $122.15 $301.33 $235.87 $1057.90    
    4       $125.66 $315.88 $231.45 $200.10 $.00    $873.09 
    Total   $473.20 $843.18 $353.60 $945.06 $667.97 $3283.01    
    */