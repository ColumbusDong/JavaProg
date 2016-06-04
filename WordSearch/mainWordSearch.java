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
    //Word Search Array
    public static char wordSearchArray[][] = new char[15][25];

    //Parts of Search Words Array
    public static String[] fullLine = new String[10];
    public static String[] searchWord = new String[10];
    public static int wordStartRow[] = new int[10];
    public static int wordStartColumn[] = new int[10];
    public static char wordOrientation[] = new char[10];

    public static void main(String args[])
    {
      Scanner userInput = new Scanner(System.in);
      Scanner inFile = null;

      //Variables
      int userIntChoice = chooseGame();
      int counter;

      //Get WordSearch Start
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
      //Get WordSearch End

      //Fill Character 2-D Array with Random Characters
      for (int x = 0; x < 15; x++)
      {
        for (int y = 0; y < 25; y++)
        {
          wordSearchArray[x][y] = randomChar();
          //wordSearchArray[x][y] = ' ';
        }
      }

      //Clear Terminal
      System.out.print("\f");

      //Get Title from Text File
      String searchTitle = inFile.nextLine();

      //Get Lines from Word Search
      counter = 0;
      while (inFile.hasNext())
      {
        fullLine[counter] = inFile.nextLine();
        counter += 1;
      }

      //Assign Parts of Line to Respective Variable Arrays
      for (int i = 0; i < 10; i++)
      {
        String[] lineParts = fullLine[i].split(" ");

        searchWord[i] = lineParts[0];
        wordStartRow[i] = Integer.parseInt(lineParts[1]);
        wordStartColumn[i] = Integer.parseInt(lineParts[2]);
        wordOrientation[i] = lineParts[3].charAt(0);
      }

      //Enter Words Into Search
      for (int i = 0; i < 10; i++)
      {
        if (wordOrientation[i] == 'H')
        {
          addHorizontal(wordStartRow[i], wordStartColumn[i], searchWord[i]);
        }
        else if (wordOrientation[i] == 'V')
        {
          addVertical(wordStartRow[i], wordStartColumn[i], searchWord[i]);
        }
        else
        {
          System.out.println("We have an Error");
        }
      }

      //Prints Word Search
      System.out.println("\t\t\t" + searchTitle);
      printSearch();
      System.out.println("\n");

      int guessWrong = 5;
      int guessRight = 10;
      String wordGuess = "";

      while (true)
      {
        System.out.println("You have " + guessWrong + " Incorrect Guesses Left!");
        System.out.println("Type Your Finded Word:");
        wordGuess = userInput.next();
        wordGuess = wordGuess.toUpperCase();

        if (checkWord(wordGuess))
        {
          System.out.print("\f");
          printSearch();
          guessRight = guessRight - 1;
          System.out.println("You only have " + guessRight + " words to go!");
        }
        else
        {
          guessWrong = guessWrong - 1;
        }

        if (guessRight == 0)
        {
          System.out.print("\f");
          System.out.println("YOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\nYOU WON!\n");
          break;
        }
        else if (guessWrong == 0)
        {
          System.out.print("\f");
          System.out.println("YOU LOST!\nYOU LOST!\nYOU LOST!\nYOU LOST!\nYOU LOST!\n");
          break;
        }

        System.out.println("\n");
      }
    }

    /*----------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------*/

    //Add Word Horizontally

    public static void addHorizontal(int startRow, int startColumn, String word)
    {
      int counter = 0;
      for (int i = startColumn - 1; i < word.length() + (startColumn - 1); i++)
      {
        wordSearchArray[startRow - 1][i] = word.charAt(counter);
        counter++;
      }

    }

    //Add Word Vertically
    public static void addVertical(int startRow, int startColumn, String word)
    {
      int counter = 0;
      for (int i = startRow - 1; i < word.length() + (startRow - 1); i++)
      {
        wordSearchArray[i][startColumn-1] = word.charAt(counter);
        counter++;
      }
    }

    public static void removeWord(int startRow, int startColumn, String word, char orient)
    {
      if (orient == 'H')
      {
        for (int i = startColumn - 1; i < word.length() + (startColumn - 1); i++)
        {
          wordSearchArray[startRow - 1][i] = '*';
        }
      }
      else if (orient == 'V')
      {
        for (int i = startRow - 1; i < word.length() + (startRow - 1); i++)
        {
          wordSearchArray[i][startColumn-1] = '*';
        }
      }
    }

    public static boolean checkWord(String wordGuess)
    {
      for (int i = 0; i < 10; i++)
      {
        if (wordGuess.equals(searchWord[i]))
        {
          System.out.println("They do match");
          removeWord(wordStartRow[i], wordStartColumn[i], searchWord[i], wordOrientation[i]);
          return true;
        }
      }

      return false;
    }


    //Print WordSearch
    public static void printSearch()
    {
      System.out.println("------------------------------------------------------------------------------");

      for (int x = 0; x < 15; x++)
      {
        System.out.print("| ");
        for (int y = 0; y < 25; y++)
        {
          System.out.print(wordSearchArray[x][y] + "  ");
        }
        System.out.print("|\n");
      }

      System.out.println("------------------------------------------------------------------------------");
    }

    //Random Character Generator
    public static char randomChar()
    {
      Random random = new Random();

      int randomNumber = random.nextInt(26) + 65;

      return (char)randomNumber;

    }

    //Choose Word Search
    public static int chooseGame()
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
            System.out.print("\f");
          }
      }

      return userIntChoice;
    }
}
