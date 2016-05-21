import java.text.DecimalFormat;

public class Survey
{
    /*Instance Variables*/
    private double incomeAverage;

    public Survey()
    {
        System.out.println("Nothing Received!");
    }

    public Survey(String ID[], int Income[], int Members[])
    {
        int households = 0;
        int above = 0;
        int aboveCounter = 0;
        int povertyCounter = 0;

        double poverty = 0;

        incomeAverage = 0;

        /*Find Sum and Amount of Households*/
        for (int i = 0; (ID[i] != null && Income[i] != 0 && Members[i] != 0); i++)
        {
            households++;
            incomeAverage += Income[i];
        }

        /*Find Income Average*/
        incomeAverage = incomeAverage/households;

        /*Arrays*/
        String[] householdID = new String[households];
        int[] householdIncome = new int[households];
        int[] householdMembers = new int[households];

        /*Households*/
        for (int x = 0; x < householdID.length; x++)
        {
            householdID[x] = ID[x];
            householdIncome[x] = Income[x];
            householdMembers[x] = Members[x];

            /*Check How Many Are Above Avg*/
            if (householdIncome[x] > incomeAverage)
            {
                above++;
            }
        }

        /*Above Avg Arrays*/
        String[] aboveID = new String[above];
        int[] aboveIncome = new int[above];
        int[] aboveMembers = new int[above];

        /*Check Households for Above Avg & Poverty*/
        for (int t = 0; t < householdIncome.length; t++)
        {
            /*Calculate Poverty*/
            poverty = 3750.00 + (750 * (householdMembers[t] - 2));

            /*Check for Above Average*/
            if (householdIncome[t] > incomeAverage)
            {
                aboveID[aboveCounter] = householdID[t];
                aboveIncome[aboveCounter] = householdIncome[t];
                aboveMembers[aboveCounter] = householdMembers[t];

                aboveCounter++;
            }

            /*Check For Poverty*/
            if (householdIncome[t] < poverty)
            {
                povertyCounter++;
            }
        }

        DecimalFormat money = new DecimalFormat("$##.00");
        DecimalFormat percent = new DecimalFormat("##.00%");

        /*Calculate Total Poverty %*/
        poverty = ((double) povertyCounter/households);

        /*Output Everything*/
        /*Households*/
        System.out.println("ID\tIncome\tMembers");

        for (int o = 0; o < households; o++)
        {
            System.out.println(householdID[o] + "\t" + householdIncome[o] + "\t" + householdMembers[o]);
        }

        System.out.println("");

        /*Above Average*/
        System.out.println("The following Households had above the average income(" + money.format(incomeAverage) + "):");
        for (int p = 0; p < above; p++)
        {
            System.out.println(aboveID[p] + "\t" + aboveIncome[p] + "\t" + aboveMembers[p]);
        }

        System.out.println("");

        /*Poverty*/
        System.out.println(percent.format(poverty) + " of households under poverty level.");

    }
}