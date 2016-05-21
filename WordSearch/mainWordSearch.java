/*
  Author: Columbus Dong
  Date: April 10. 2016
  Project: Word Search
*/

//Java Utilities
import java.io.*;
import java.util.*;

public class mainWordSearch
{
    public static void main(String args[])
    {
      Scanner userInput = new Scanner(System.in);
      Scanner inFile = null;

      //Variables
      int userIntChoice = preGame();

      switch (userIntChoice)
      {
          case 1:
              try
                  {
                  // Create a scanner to read the file, file name is parameter
                      inFile = new Scanner (new File("NCState.txt"));
                  }
              catch (FileNotFoundException e)
                  {
                  System.out.println ("File not found!");
                  /*Stop Program if no file s found*/
                  System.exit(0);
                  }
              break;

          case 2:
            try
                {
                // Create a scanner to read the file, file name is parameter
                    inFile = new Scanner (new File("Presidents.txt"));
                }
            catch (FileNotFoundException e)
                {
                System.out.println ("File not found!");
                /*Stop Program if no file s found*/
                System.exit(0);
                }
            break;

          case 3:
            try
                {
                // Create a scanner to read the file, file name is parameter
                    inFile = new Scanner (new File("VideoGames.txt"));
                }
            catch (FileNotFoundException e)
                {
                System.out.println ("File not found!");
                /*Stop Program if no file s found*/
                System.exit(0);
                }
            break;

          default:
            System.out.println("ERROR! ERROR! ERROR!");
            break;
      }

      String content = "";

      while (inFile.hasNext())
      {
        content += inFile.next();
        System.out.println(content + "\n");
      }

    }


    public static int preGame()
    {
      Scanner userInput = new Scanner(System.in);

      //Variables
      int userIntChoice;
      String userStrChoice = "";
      String userResponse = "";

      while (true)
      {
        //Prompt User for Word Search of Choice
        System.out.println("Please Enter the Corresponding Number of the Word Search[EX: 2]:");
        System.out.println("1. NC State\n2. Presidents\n3. Video Games\n");
        System.out.print("Please Enter Your Choice: ");
        userIntChoice = userInput.nextInt();

        switch (userIntChoice)
        {
            case 1:
              userStrChoice = "NC State";
              break;

            case 2:
              userStrChoice = "Presidents";
              break;

            case 3:
              userStrChoice = "Video Games";
              break;

            default:
              System.out.println("Please Enter A Valid Option");
              break;
        }

        if (userIntChoice < 0 || userIntChoice > 3) {}
          else
          {
            System.out.println("\nIs " + userStrChoice + " the correct Word Search? [Y/N]");
            userResponse = userInput.next();

            if (userResponse.toUpperCase().equals("Y"))
            {
              break;
            }
          }
      }

      return userIntChoice;
    }
}
