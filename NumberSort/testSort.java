/*
Programmer: Columbus Dong
Date: January 30, 2015
Assignment: Number Sort
School: Manteo High
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;

public class testSort
{
    public static void main(String args[])
    {
        /*Scanner*/
        Scanner Input = new Scanner(System.in);

        /*Declare Variables*/
        int num1, num2, num3, num4, totalNumbers;
        String response;
        boolean repeat = true;

        /*Loop While Boolean Is True*/
        while (repeat == true)
        {
            /*Prompt User For Numbers*/
            System.out.print("Enter 3 or 4 Numbers with a space between them[EX: 3 4 3 3]: ");
            response = Input.nextLine();

            /*Create an Array*/
            final String Numbers[] = response.split(" ");

            /*Find How Many Numbers*/
            totalNumbers = Numbers.length;

            if (totalNumbers == 3)
            {
                num1 = Integer.parseInt(Numbers[0]);
                num2 = Integer.parseInt(Numbers[1]);
                num3 = Integer.parseInt(Numbers[2]);

                Sort sorter = new Sort(num1, num2, num3);
                System.out.println(sorter);
            }
            else if (totalNumbers == 4)
            {
                num1 = Integer.parseInt(Numbers[0]);
                num2 = Integer.parseInt(Numbers[1]);
                num3 = Integer.parseInt(Numbers[2]);
                num4 = Integer.parseInt(Numbers[3]);

                Sort sorter = new Sort(num1, num2, num3, num4);
                System.out.println(sorter);
            }
            
            /*Prompt For Repeat*/
            System.out.print("Repeat? (Y/N)");
            response = Input.next();
            response = response.toUpperCase();
            if (response.equals("N"))
            {
                repeat = false;
            }
        }
    }
}

/*Output:
Enter 3 or 4 Numbers with a space between them[EX: 3 4 3 3]: 56 76 34 23
The Numbers in order are[Greatest to Smallest]: 76, 56, 34, 23
 */