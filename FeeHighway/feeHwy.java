/*
Programmer: Columbus Dong
Date: March 2, 2-15
Assignment Fee Highway
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class feeHwy
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        DecimalFormat money = new DecimalFormat("$##.00");

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Highway.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Arrays*/
        String[][] vehicleType =
        {
        /*Types: */{"1.0", "1.3", "1.6", "2.0", "2.4", "2.7"},
        /*Cars:  */{"Compact Car", "Small Car", "Mid Sized Car", "Full Size Car", "Truck\t", "16 Wheeler"}
        };
        
        double[] gateToll = {1.35, 2.00, 2.50, 3.25, 4.10, 4.8, 5.5, 6.00};

        /*Variables*/
        int gate, vehicle;
        double factor, toll, totalCost;

        /*Header*/
        System.out.println("Car Type\t\tBase Toll\tFactor\tCost");

        while (inFile.hasNext())
        {
            /*Assign Literals*/
            vehicle = inFile.nextInt();
            gate = inFile.nextInt();

            factor = Double.parseDouble(vehicleType[0][vehicle - 1]);
            toll = gateToll[gate - 1];

            /*Find Total Cost*/
            totalCost = factor * toll;

            System.out.println(vehicleType[1][vehicle - 1] + "\t\t  " + money.format(toll) + "\t\t " + factor + "\t" + money.format(totalCost)); 
        }
    }
}

/*Output
Car Type		Base Toll	Factor	Cost
Compact Car		  $1.35		 1.0	$1.35
Small Car		  $2.50		 1.3	$3.25
Mid Sized Car	  $4.10		 1.6	$6.56
Full Size Car	  $5.50		 2.0	$11.00
Truck			  $2.00		 2.4	$4.80
16 Wheeler		  $3.25		 2.7	$8.78
Compact Car		  $4.80		 1.0	$4.80
Small Car		  $6.00		 1.3	$7.80
Mid Sized Car     $1.35		 1.6	$2.16
Full Size Car	  $2.50		 2.0	$5.00
Truck			  $4.10		 2.4	$9.84
16 Wheeler		  $5.50		 2.7	$14.85
Compact Car		  $6.00		 1.0	$6.00
Small Car		  $1.35		 1.3	$1.76
Mid Sized Car	  $2.00		 1.6	$3.20
Full Size Car	  $2.50		 2.0	$5.00
Truck			  $3.25		 2.4	$7.80
16 Wheeler		  $4.10		 2.7	$11.07
 */