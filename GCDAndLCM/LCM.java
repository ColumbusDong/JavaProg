/*
Programmer: Columbus Dong
Date: January 23, 2015
Assignment: LCM
School: Manteo High

Description: Find the LCM of Given Numbers
*/
public class LCM
{
    /*Instance Variables*/
    private int LCM2;
    private int Number3;
    
    public LCM()
    {
        LCM2 = 0;

        System.out.println("Nothing Entered");
    }

    /*Method*/
    public static int Denominator(int Num1, int Num2)
    {
        while (Num1 != Num2)
        {
            /*The First Number from the Second until They are Equal*/
            if (Num1 > Num2)
            {
                Num1 = Num1 - Num2;
            }
            else
            {
                Num2 = Num2 - Num1;
            }
        }

        return Num1;
    }

    /*Regular Constructor*/
    public LCM(int Num1, int Num2)
    {
        LCM2 = (Num1 * Num2)/Denominator(Num1, Num2);
    }

    /*Regular Constructor*/
    public LCM(LCM Num1, int Num2)
    {
        LCM2 = (LCM2 * Num2)/Denominator(LCM2, Num2);
    }
    
    /*String*/
    public String toString()
    {
        String str = "" + LCM2;
        return str;
    }
    
    /*Getter*/
    public int getLCM()
    {
        return LCM2;
    }
}