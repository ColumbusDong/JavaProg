/*Programmer: Columbus
Date: February 13, 2015
Assignment: The Sock Hop
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class newSock
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Sock.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        String Line;

        while (inFile.hasNext())
        {
            Line = inFile.nextLine();
                
            Sock sockHop = new Sock(Line);
        }

    }
}

/*
Output:
Students: 16	Total Money: $40.00
Students: 22	Total Money: $55.00
Students: 28	Total Money: $70.00
Students: 32	Total Money: $80.00
 */