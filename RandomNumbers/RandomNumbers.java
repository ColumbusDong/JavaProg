/*Programmer: Columbus
Date: February 23, 2015
Assignment: 20 Random Numbers
*/
import java.util.Random;

public class RandomNumbers
{
	public static void main(String args[])
	{
		/*Random Number Generator*/
		Random genRNG = new Random();

		/*Array*/
		int[] numRNG = new int[20]; //20 Values in Array

		/*Variable*/
		int similarCounter;
		String printTable = "";

		/*Assigning Literals*/
		for (int i = 0; i <= numRNG.length - 1; i++)
		{
			/*Default Literal is 0*/
			while (numRNG[i] == 0)
			{
				/*Assign Literal*/
				numRNG[i] = genRNG.nextInt(25) + 1;	//Numbers 1-25

				/*Default*/
				similarCounter = 0;

				/*Check Number*/
				for (int x = 0; x <= numRNG.length - 1; x++)
				{
					/*If Numbers Are Similar*/
					if (numRNG[i] == numRNG[x])
					{
						similarCounter++;
					}
				}

				/*Should Only Be 1 Instance of Similarity*/
				if (similarCounter != 1)
				{
					/*Loop Again*/
					numRNG[i] = 0;
				}
			}

			/*Add to the table*/
			printTable += numRNG[i] + "\t";	//Number Plus A Tab

			/*Add a Line after every 5 Numbers*/
			if ((i + 1) % 5 == 0)
			{
				printTable += "\n";
			}
		}

		/*Print Out Table*/
		System.out.println(printTable);
	}
}

/*
Output 1:
23	6	12	15	25	
2	19	13	16	3	
21	20	8	24	4	
11	14	18	5	17	

Output 2:
12	2	24	1	13	
21	20	11	23	9	
17	25	10	18	8	
15	3	22	7	6	

Output 3:
22	3	8	6	18	
17	19	14	4	16	
11	2	24	20	9	
25	7	13	12	5	

*/