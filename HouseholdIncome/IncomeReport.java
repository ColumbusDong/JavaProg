/*
Programmer: Columbus Dong
Date: March 2, 2015
Assignment: Household Income report
*/

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class IncomeReport
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile1 = null; 
        Scanner inFile2 = null;

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile1 = new Scanner (new File("Report1.txt"));
                inFile2 = new Scanner (new File("Report2.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Arrays*/
        String[] householdID = new String[25];
        int[] householdIncome = new int[25];
        int[] householdMembers = new int[25];

        /*Survey One*/
        System.out.println("Survey 1:");

        /*Assigning*/
        for (int i = 0; inFile1.hasNext(); i++)
        {
            householdID[i] = inFile1.next();
            householdIncome[i] = inFile1.nextInt();
            householdMembers[i] = inFile1.nextInt();
        }

        Survey household1 = new Survey(householdID, householdIncome, householdMembers);

        /*Space*/
        System.out.println("");

        /*Clear Out Arrays*/
        Arrays.fill(householdID, 0, 25, null);
        Arrays.fill(householdIncome, 0, 25, 0);
        Arrays.fill(householdMembers, 0, 25, 0);

        /*Survey 2*/
        System.out.println("Survey 2:");

        /*Assigning*/
        for (int x = 0; inFile2.hasNext(); x++)
        {
            householdID[x] = inFile2.next();
            householdIncome[x] = inFile2.nextInt();
            householdMembers[x] = inFile2.nextInt();
        }

        Survey household2 = new Survey(householdID, householdIncome, householdMembers);

    }
}

/*Output
Survey 1:
ID	Income	Members
2497	12500	2
3323	13000	5
4521	18210	4
6789	8000	2
5476	6000	1
4423	16400	3
6587	25000	4
3221	10500	4
5555	15000	2
1085	19700	3
3097	20000	8
4480	23400	5
2065	19700	2
8901	13000	3

The following Households had above the average income($15743.57):
4521	18210	4
4423	16400	3
6587	25000	4
1085	19700	3
3097	20000	8
4480	23400	5
2065	19700	2

.00% of households under poverty level.

Survey 2:
ID	Income	Members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1

The following Households had above the average income($12707.38):
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2

7.69% of households under poverty level.
 */