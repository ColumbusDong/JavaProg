public class Seperate
{   
    /*Instance Variables*/
    String fullOutput;

    public Seperate()
    {
        System.out.println("Nothing Happened");
    }

    public Seperate(String n)
    {
        /*Arrays*/
        final String allNumbers[] = n.split(" ");
        int[] numbers = new int[allNumbers.length];

        /*Counters*/
        int posCounter = 1;
        int negCounter = 1;

        /*Convert and Assign Literals*/
        for (int i = 0; i <= allNumbers.length - 1; i++)
        {
            numbers[i] = Integer.parseInt(allNumbers[i]);

            /*Count How Many of Each*/
            if (numbers[i] >= 0)
            {
                posCounter++;
            }
            else if (numbers[i] < 0)
            {
                negCounter++;
            }
        }

        /*Postive and Negative Arrays*/
        int[] posNumbers = new int[posCounter];
        int[] negNumbers = new int[negCounter];

        /*Reset Counter*/
        posCounter = 0;
        negCounter = 0;

        /*String Outputs*/
        String posOutput = "Positive: ";
        String negOutput = "Negative: ";

        for (int x = 0; x <= numbers.length - 1; x++)
        {
            if (numbers[x] >= 0)
            {
                posNumbers[posCounter] = numbers[x];
                posOutput += posNumbers[posCounter] + "  ";
                posCounter++;
            }
            else if (numbers[x] < 0)
            {
                negNumbers[negCounter] = numbers[x];
                negOutput += negNumbers[negCounter] + "  ";
                negCounter++;
            }
        }

        posOutput += "\nTotal # of Positive #: " + posCounter;
        negOutput += "\nTotal # of Negative #: " + negCounter;

        fullOutput = posOutput + "\n\n" + negOutput;
    }

    public String toString()
    {
        return fullOutput;
    }
}