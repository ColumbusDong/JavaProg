/*Programmer: Columbus
Date: February 13, 2015
Assignment: The Source
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class theSource
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Source.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*String Variable*/
        String Line = new String();

        /*Data Variables*/
        String accountNumber;
        double hours;
        int priorityCode;

        /*Header*/
        System.out.println("Account\tHours\tCode\tAmount Due");
    
        while (inFile.hasNext())
        {
             /*Line from file*/
             Line = inFile.nextLine();

             /*Line to Array*/
             final String Full[] = Line.split(" ");

             accountNumber = Full[0];
             hours = Double.parseDouble(Full[1]);
             priorityCode = Integer.parseInt(Full[2]);

             Source newAccount = new Source(accountNumber, hours, priorityCode);
             System.out.println(newAccount);

         }
    }
}

/*Output:
Account	Hours	Code	Amount Due
1825	3.25	0	$200.00
14063	17.06	1	$661.80
17185	7.93	1	$337.90
19111	12.0	2	$560.00
20045	5.0	1	$250.00
21352	5.84	0	$225.20
22841	27.9	2	$1087.00
23051	1.55	2	$350.00
29118	15.02	0	$550.60
 */