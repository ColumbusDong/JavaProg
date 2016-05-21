/*
Programmer: Columbus Dong
Date: February 26, 2015
Assignment: Sieve of Erantosthenes
*/

public class Sieve
{
	public static void main(String args[])
	{
		/*Array*/
		int[] allNums = new int[1000];

		/*Set The Numbers*/
		for (int i = 0; i <= allNums.length - 1; i++)
		{
			allNums[i] = i + 1;
		}

		String primeNums = "Prime Numbers: \n";
		int spaceCounter = 1;

		/*Find the Prime Numbers Starting from 2*/
		for (int x = 1; x <= allNums.length - 1; x++)
		{
			/*Checking for Prime*/
			if ((((allNums[x] * allNums[x]) - 1) % 24) == 0)
			{
				primeNums += allNums[x] + "  ";
				spaceCounter++;
			}

			if (spaceCounter % 10 == 0)
			{
				primeNums += "\n";
			} 
		}

		System.out.println(primeNums);
	}
}