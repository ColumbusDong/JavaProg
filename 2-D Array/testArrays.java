/*
Programmer: Columbus Dong
Assignment: testArray - Main Program
Date: April 6, 2015
*/

/*Import Java Utilities*/
import java.io.*;
import java.util.*;

public class testArrays
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Array.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*2-D Array*/
        int originalArray[][] = new int[5][5];

        System.out.println("Original Array: \n");

        /*While File has Items*/
        while (inFile.hasNext())
        {
            for (int xRow = 0; xRow < 5; xRow++)
            {
                for (int xColumn = 0; xColumn < 5; xColumn++)
                {
                    originalArray[xRow][xColumn] = inFile.nextInt();

                    System.out.print(originalArray[xRow][xColumn] + "\t");
                }

                /*Space*/
                System.out.println("\n");
            }
        }

        superArray array = new superArray(originalArray);
        
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        int choice;

        /*Prompt*/
        System.out.println("Choices: ");
        System.out.println("1: \tTranspose Array");
        System.out.println("2: \tFind Diagonal Sum");
        System.out.println("3: \tFind Sums of the Rows and Columns");
        System.out.println("");
        System.out.print("Which option would you like? [ 1, 2, or 3]: ");
        choice = Input.nextInt();
        

        /*Do what was requested*/
        switch (choice)
        {
            case 1:
                array.Transpose();
                break;

            case 2:
                array.Diagonals();
                break;

            case 3:
                array.Totals();
                break;

            default:
                System.out.println("ERROR! ERROR! ERROR! Invalid Choice");
                break;
        }
    }
}

/*
Output:
[prog 464d]

Original Array: 

45  67  89  12  -3  

-3  -6  -7  -4  -9  

96  81  -8  52  12  

14  -7  72  29  -1  

19  43  28  63  87  

Choices: 
1:  Transpose Array
2:  Find Diagonal Sum
3:  Find Sums of the Rows and Columns

Which option would you like? [ 1, 2, or 3]: 1
Transposed Array: 

45  -3  96  14  19  

67  -6  81  -7  43  

89  -7  -8  72  28  

12  -4  52  29  63  

-3  -9  12  -1  87  

--------------------------------------------------------
[prog 470b]

Original Array: 

45  67  89  12  -3  

-3  -6  -7  -4  -9  

96  81  -8  52  12  

14  -7  72  29  -1  

19  43  28  63  87  

Choices: 
1:  Transpose Array
2:  Find Diagonal Sum
3:  Find Sums of the Rows and Columns

Which option would you like? [ 1, 2, or 3]: 2
Main Diagonal Sum: 147
Other Diagonal Sum: -3

-------------------------------------------------------
[prog 470c]

Original Array: 

45  67  89  12  -3  

-3  -6  -7  -4  -9  

96  81  -8  52  12  

14  -7  72  29  -1  

19  43  28  63  87  

Choices: 
1:  Transpose Array
2:  Find Diagonal Sum
3:  Find Sums of the Rows and Columns

Which option would you like? [ 1, 2, or 3]: 3
45  67  89  12  -3  210

-3  -6  -7  -4  -9  -29

96  81  -8  52  12  233

14  -7  72  29  -1  107

19  43  28  63  87  240

171 178 174 152 86  761

*/