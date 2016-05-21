/*
Programmer:Columbus Dong
Date: May 1, 2015
ASsignment: Up, Up, and Away
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;

public class Flight
{
    
    /*Flight Plan Array*/
    /*Y Axis Indicates the "From" and the X Axis Indicates the "To"*/
        public static String[][] flightPlan = 
        {
            {"N", "Y", "Y", "N", "N", "Y"},
            {"Y", "N", "Y", "N", "N", "Y"},
            {"N", "N", "N", "Y", "N", "N"},
            {"N", "Y", "N", "N", "Y", "Y"},
            {"N", "Y", "N", "Y", "N", "N"},
            {"N", "Y", "N", "N", "Y", "N"}
        };
        
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Flights.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Array Lists*/
        ArrayList<String> custNumber = new ArrayList<String>();
        ArrayList<String> custFlight = new ArrayList<String>();

        /*Populate Array List*/
        while (inFile.hasNext())
        {
            custNumber.add(inFile.next());  //Add Customer Number
            custFlight.add(inFile.next());  //Add Customer Flight Plan
        }

        /*Print Out the Flight Plan*/
        System.out.println("Flight Plans: ");
        for (int i = 0; i < 6; i++)
        {
            for (int x = 0; x < 6; x++)
            {
                System.out.print(flightPlan[i][x] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        /*Call to Check the Flights*/
        for (int i = 0; i < custNumber.size(); i++)
        {
            System.out.println("Customer Number: " + custNumber.get(i) + "\tFlight Plan: " + custFlight.get(i));
            checkFlights(custFlight.get(i));
            System.out.println("\n");
        }
    }

    public static void checkFlights(String custFlight)
    {
       
        /*Split the Flight Numbers Up, Convert them to Integer from String*/
        String[] strFlightRoutes = custFlight.split("");
        int[] flightRoutes = new int[strFlightRoutes.length];
        for (int i = 0; i < custFlight.length(); i++)
        {
            flightRoutes[i] = Integer.parseInt(strFlightRoutes[i]);
        }

        String flightStatement = "From\tTo\tAvailable\n";   //Will be Output
        
        /*Go through the Flight Plan*/
        int flightFrom = -1;
        int flightTo = -1;
        int flightCounter = 0;
        String flightAvailable = "";

        while (flightCounter < custFlight.length() - 1)
        {
            /*Set the Flights*/
            flightFrom = flightRoutes[flightCounter];
            flightTo = flightRoutes[flightCounter + 1];
            
            /*If Flight didn't have 4 flights*/
            if (flightTo == 0)
            {
                flightStatement += "The Flight is Valid";
                break;
            }
            
            /*Check to see if flight is Available*/
            flightAvailable = flightPlan[flightFrom - 1][flightTo - 1];
            
            
            if (flightAvailable.equals("Y"))
            {
                flightStatement += "  " + flightFrom + "\t " + flightTo + "\t  Available\n";
            }
            else
            {
                flightStatement += "  " + flightFrom + "\t " + flightTo + "\tUnavailable\nThe Flight is Invalid";
                break;
            }
            
            flightCounter++;
        }
        
        /*If loop ran all the way through and the last result was a Y, but wasn't ended by a 0*/
        if (flightAvailable.equals("Y") && flightTo != 0)
        {
            flightStatement += "The Flight is Valid";
        }
        
        System.out.println(flightStatement);
    }
}
/*
Output:

Flight Plans: 
N  Y  Y  N  N  Y  
Y  N  Y  N  N  Y  
N  N  N  Y  N  N  
N  Y  N  N  Y  Y  
N  Y  N  Y  N  N  
N  Y  N  N  Y  N  


Customer Number: 10123  Flight Plan: 13426
From    To  Available
  1  3    Available
  3  4    Available
  4  2    Available
  2  6    Available
The Flight is Valid


Customer Number: 11305  Flight Plan: 62000
From    To  Available
  6  2    Available
The Flight is Valid


Customer Number: 13427  Flight Plan: 42320
From    To  Available
  4  2    Available
  2  3    Available
  3  2  Unavailable
The Flight is Invalid


Customer Number: 18211  Flight Plan: 34212
From    To  Available
  3  4    Available
  4  2    Available
  2  1    Available
  1  2    Available
The Flight is Valid


Customer Number: 19006  Flight Plan: 65426
From    To  Available
  6  5    Available
  5  4    Available
  4  2    Available
  2  6    Available
The Flight is Valid


Customer Number: 20831  Flight Plan: 52500
From    To  Available
  5  2    Available
  2  5  Unavailable
The Flight is Invalid


Customer Number: 21475  Flight Plan: 32000
From    To  Available
  3  2  Unavailable
The Flight is Invalid


Customer Number: 22138  Flight Plan: 13424
From    To  Available
  1  3    Available
  3  4    Available
  4  2    Available
  2  4  Unavailable
The Flight is Invalid


Customer Number: 24105  Flight Plan: 65231
From    To  Available
  6  5    Available
  5  2    Available
  2  3    Available
  3  1  Unavailable
The Flight is Invalid


Customer Number: 24216  Flight Plan: 34250
From    To  Available
  3  4    Available
  4  2    Available
  2  5  Unavailable
The Flight is Invalid


Customer Number: 25009  Flight Plan: 43621
From    To  Available
  4  3  Unavailable
The Flight is Invalid
*/