/*
Programmer: Columbus Dong
Date: March 2, 2015
Assignment: Snake Eyes Not
*/

import java.util.Arrays;

public class SnakeEyes
{
	public static void main(String args[])
	{
		int[] diceCombinations = new int[18];

		Arrays.fill(diceCombinations, 0, 18, 0);

		int[] dice1 = {1, 2, 3, 4, 5, 6};
		int[] dice2 = {1, 2, 3, 4, 5, 6};
		int[] dice3 = {1, 2, 3, 4, 5, 6};

		int total;

		for (int x = 0; x < 6; x++)
		{
			for (int y = 0; y < 6; y++)
			{
				for (int z = 0; z < 6; z++)
				{
					total = dice1[x] + dice2[y] + dice3[z];

					for (int i = 0; i < 18; i++)
					{
						if (i + 1 == total)
						{
							diceCombinations[i]++;
						}
					}
				}
			}
		}

		/*Header*/
		System.out.println("Number\tPossible Combinations");

		for (int t = 0; t < 18; t++)
		{
			System.out.println((t + 1) + "\t\t" + diceCombinations[t]);
		}
	}
}

/*Output
Number	Possible Combinations
1		0
2		0
3		1
4		3
5		6
6		10
7		15
8		21
9		25
10		27
11		27
12		25
13		21
14		15
15		10
16		6
17		3
18		1
*/