public class Sort
{
    /*Instance Variables for Numbers*/
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int totalNum;

    /*Instance Variables for Place*/
    private int smallest;
    private int fstMiddle;
    private int middle;
    private int sndMiddle;
    private int largest;

    /*Default Constructor*/
    public Sort()
    {
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
    }

    /*Regular Constructor for 3 Nums*/
    public Sort(int n1, int n2, int n3)
    {
        /*Assign Literals*/
        num1 = n1;
        num2 = n2;
        num3 = n3;
        totalNum = 3;

        /*Sort Numbers*/

        /*Between 1 and 2, Who's Bigger*/
        if (num1 > num2)
        {

            /*1 Bigger Than 2*/
            largest = num1;
            smallest = num2;

            if (num3 > num1)
            {
                /*3 Bigger Than 1*/
                largest = num3;
                middle = num1;
            }
            else if (num3 < num2)
            {
                /*3 Smaller Than 2*/
                smallest = num3;
                middle = num2;
            }
            else
            {
                middle = num3;
            }
        }
        else
        {
            /*2 Bigger Than 1*/
            smallest = num1;
            largest = num2;

            if (num3 > num2)
            {
                /*3 Bigger Than 2*/
                largest = num3;
                middle = num2;
            }
            else if (num3 < num1)
            {
                /*3 Smaller Than 1*/
                smallest = num3;
                middle = num1;
            }
            else
            {
                middle = num3;
            }
        }
    }
    /*3 Number End*/

    /*Regular Constructor for 4 Numbers*/
    public Sort(int n1, int n2, int n3, int n4)
    {
        /*Assign Literals*/
        num1 = n1;
        num2 = n2;
        num3 = n3;
        num4 = n4;
        totalNum = 4;

        /*Sort*/

        /*Find the Largest*/

        /*If 1 is the Biggest*/
        if (num1 > num2 && num1 > num3 && num1 > num4)
        {
            largest = num1;

            /*Between 2 and 3*/
            if (num2 > num3)
            {
                /*2 is Bigger*/
                sndMiddle = num2;
                smallest  = num3;

                
                if (num4 > num2)
                {
                    /*4 is Bigger Than 2*/
                    sndMiddle = num4;
                    fstMiddle = num2;
                }
                else if (num4 < num3)
                {
                    /*4 is Smaller than 3*/
                    smallest = num4;
                    fstMiddle = num3;
                }
                else
                {
                    fstMiddle = num4;
                }
            }
            else
            {
                /*3 is Bigger*/
                smallest = num2;
                sndMiddle = num3;

                if (num4 > num3)
                {
                    /*4 is Bigger Than 3*/
                    sndMiddle = num4;
                    fstMiddle = num3;
                }
                else if (num4 < num2)
                {
                    /*4 is Smaller than 2*/
                    smallest = num4;
                    fstMiddle = num2;
                }
                else
                {
                    fstMiddle = num4;
                }
            }
        }
        /*********************Done*********************/
        /*If 2 is the Biggest*/
        else if (num2 > num1 && num2 > num3 && num2 > num4)
        {
            largest = num2;

            /*Between 3 and 4*/
            if (num3 > num4)
            {
                /*3 is Bigger*/
                sndMiddle = num3;
                smallest = num4;

                
                if (num1 > num3)
                {
                    /*1 is Bigger Than 3*/
                    sndMiddle = num1;
                    fstMiddle = num3;
                }
                else if (num1 < num4)
                {
                    /*1 is Smaller than 4*/
                    smallest = num1;
                    fstMiddle = num4;
                }
                else
                {
                    fstMiddle = num1;
                }
            }
            else
            {
                /*4 is Bigger*/
                smallest = num3;
                sndMiddle = num4;

                if (num1 > num4)
                {
                    /*1 is Bigger Than 4*/
                    sndMiddle = num1;
                    fstMiddle = num4;
                }
                else if (num1 < num3)
                {
                    /*1 is Smaller than 3*/
                    smallest = num1;
                    fstMiddle = num3;
                }
                else
                {
                    fstMiddle = num1;
                }
            }
        }
        /*********************Done*********************/
        /*If 3 is the Biggest*/
        else if (num3 > num1 && num3 > num2 && num3 > num4)
        {
            largest = num3;

            /*Between 1 and 2*/
            if (num1 > num2)
            {
                /*1 is Bigger*/
                sndMiddle = num1;
                smallest = num2;

                
                if (num4 > num1)
                {
                    /*4 is Bigger Than 1*/
                    sndMiddle = num4;
                    fstMiddle = num1;
                }
                else if (num4 < num2)
                {
                    /*4 is Smaller than 2*/
                    smallest = num4;
                    fstMiddle = num2;
                }
                else
                {
                    fstMiddle = num4;
                }
            }
            else
            {
                /*2 is Bigger*/
                smallest = num1;
                sndMiddle = num2;

                if (num4 > num2)
                {
                    /*4 is Bigger Than 2*/
                    sndMiddle = num4;
                    fstMiddle = num2;
                }
                else if (num4 < num1)
                {
                    /*4 is Smaller than 1*/
                    smallest = num4;
                    fstMiddle = num1;
                }
                else
                {
                    fstMiddle = num4;
                }
            }           
        }
        /*********************Done*********************/
        /*If 4 is the Biggest*/
        else if (num4 > num1 && num4 > num2 && num4 > num3)
        {
            largest = num4;

            /*Between 1 and 2*/
            if (num1 > num2)
            {
                /*1 is Bigger*/
                sndMiddle = num1;
                smallest = num2;

                
                if (num3 > num1)
                {
                    /*3 is Bigger Than 1*/
                    sndMiddle = num3;
                    fstMiddle = num1;
                }
                else if (num3 < num2)
                {
                    /*3 is Smaller than 2*/
                    smallest = num3;
                    fstMiddle = num2;
                }
                else
                {
                    fstMiddle = num3;
                }
            }
            else
            {
                /*2 is Bigger*/
                smallest = num1;
                sndMiddle = num2;

                if (num3 > num2)
                {
                    /*3 is Bigger Than 2*/
                    sndMiddle = num3;
                    fstMiddle = num2;
                }
                else if (num3 < num1)
                {
                    /*3 is Smaller than 1*/
                    smallest = num3;
                    fstMiddle = num1;
                }
                else
                {
                    fstMiddle = num3;
                }
            }
        }
        /*********************Done*********************/
    }
    /*4 Number End*/

    /*Output*/
    public String toString()
    {
        if (totalNum == 3)
        {
            return ("The Numbers in order are[Greatest to Smallest]: " + largest + ", " + middle + ", " + smallest + "\n");
            
		}
		else
		{
			return ("The Numbers in order are[Greatest to Smallest]: " + largest + ", " + sndMiddle + ", " + fstMiddle + ", " + smallest + "\n");
		}
	}
}