/*
Programmer: Columbus Dong
Date: January 15, 2015
Assignment: Charting Sales
School: Manteo High

Description: Program that outputs randomly generated sales data and models it
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.lang.Math;

public class ChartingSales
{
    /*Main*/
    public static void main(String args[])
    {
        /*Declare Variables For Days*/
        int Days = 1;

        /*Print Header*/
        System.out.println("Each $ Represents $500");
        System.out.println("Day" + "\tDaily" + "\tSales Graph");

        while (Days <= 31)
        {
            /*Sunday*/
            if (Days % 7 == 1)
            {
                System.out.println(Days + "\tClosed");
            }
            /*Monday*/
            else if (Days % 7 == 2)
            {
                /*Execute RandomMonday*/
                RandomMonday(Days);
            }
            /*Tuesday*/
            else if (Days % 7 == 3)
            {
                /*Execute RandomTuesday*/
                RandomTuesday(Days);
            }
            /*Saturday*/
            else if (Days % 7 == 0)
            {
                /*Execute RandomSaturday*/
                RandomSaturday(Days);
            }
            /*Any other Day*/
            else
            {
                /*Execute RegularDay*/
                RegularDay(Days);
            }

            Days++;
        }
    }

    /*Random Regular Day*/
    public static void RegularDay(int Sales)
    {
        /*Remake Variable for Days*/
        int Days = Sales;

        /*Random Number Generator*/
        Random RandomSale = new Random();

        /*Make Sales Equal to Random Number*/
        /*Make Sales Range from $10,000 to $40,000*/
        Sales = RandomSale.nextInt(30001);
        Sales += 100;

        /*Declare Variable for Counter*/
        int Counter = 1;

        /*Variable For Rounded Sales*/
        double RoundSales;

        /*Rounding Sales to 100's*/
        RoundSales = (Sales/100);
        RoundSales = Math.round(RoundSales) * 100;

        /*Output*/
        System.out.print(Days + "\t" + Sales + "\t");

        while (Counter <= RoundSales)
        {
            /*Print Out the Character*/
            System.out.print("$");
            
            /*Add 1 to Counter*/
            Counter += 500;
        }

        /*Space*/
        System.out.println();
    }

    /*Random Monday*/
    public static void RandomMonday(int Sales)
    {
        /*Remake Variable for Days*/
        int Days = Sales;

        /*Random Number Generator*/
        Random RandomSale = new Random();

        /*Make Sales Equal to Random Number*/
        /*Make Sales Range from $30,000 to $40,000*/
        Sales = RandomSale.nextInt(100);
        Sales += 30001;

        /*Declare Variable for Counter*/
        int Counter = 1;

        /*Variable For Rounded Sales*/
        double RoundSales;

        /*Rounding Sales to 100's*/
        RoundSales = (Sales/100);
        RoundSales = Math.round(RoundSales) * 100;

        /*Output*/
        System.out.print(Days + "\t" + Sales + "\t");

        while (Counter <= RoundSales)
        {
            /*Print Out the Character*/
            System.out.print("$");
            
            /*Add 1 to Counter*/
            Counter += 500;
        }

        /*Space*/
        System.out.println();

    }

    /*Random Tuesday*/
    public static void RandomTuesday(int Sales)
    {
        /*Remake Variable for Days*/
        int Days = Sales;

        /*Random Number Generator*/
        Random RandomSale = new Random();

        /*Make Sales Equal to Random Number*/
        /*Make Sales Range from $20,000 to $40,000*/
        Sales = RandomSale.nextInt(20000);
        Sales += 20001;  

        /*Declare Variable for Counter*/
        int Counter = 1;

        /*Variable For Rounded Sales*/
        double RoundSales;

        /*Rounding Sales to 100's*/
        RoundSales = (Sales/100);
        RoundSales = Math.round(RoundSales) * 100;

        /*Output*/
        System.out.print(Days + "\t" + Sales + "\t");

        while (Counter <= RoundSales)
        {
            /*Print Out the Character*/
            System.out.print("$");
            
            /*Add 1 to Counter*/
            Counter += 500;
        }

        /*Space*/
        System.out.println();   
    }

    /*Random Saturday*/
    public static void RandomSaturday(int Sales)
    {
        /*Remake Variable for Days*/
        int Days = Sales;

        /*Random Number Generator*/
        Random RandomSale = new Random();

        /*Make Sales Equal to Random Number*/
        /*Make Sales Range from $0 to $15,000*/
        Sales = RandomSale.nextInt(15000);

        /*Declare Variable for Counter*/
        int Counter = 1;

        /*Variable For Rounded Sales*/
        double RoundSales;

        /*Rounding Sales to 100's*/
        RoundSales = (Sales/100);
        RoundSales = Math.round(RoundSales) * 100;
        
        /*Output*/
        System.out.print(Days + "\t" + Sales + "\t");

        while (Counter <= RoundSales)
        {
            /*Print Out the Character*/
            System.out.print("$");
            
            /*Add 1 to Counter*/
            Counter += 500;
        }

        /*Space*/
        System.out.println();
    }
}

/*Output:
Each $ Represents $500
Day	Daily	Sales Graph
1	Closed
2	30040	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
3	32377	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
4	29744	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
5	24875	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
6	23944	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
7	1500	$$$
8	Closed
9	30072	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
10	22267	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
11	15075	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
12	11172	$$$$$$$$$$$$$$$$$$$$$$$
13	29005	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
14	2107	$$$$$
15	Closed
16	30037	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
17	26708	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
18	29596	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
19	11775	$$$$$$$$$$$$$$$$$$$$$$$$
20	22419	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
21	753	$$
22	Closed
23	30072	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
24	23904	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
25	11090	$$$$$$$$$$$$$$$$$$$$$$
26	26502	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
27	18383	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
28	10243	$$$$$$$$$$$$$$$$$$$$$
29	Closed
30	30053	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
31	29655	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
*/