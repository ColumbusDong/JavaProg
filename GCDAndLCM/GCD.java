/*
Programmer: Columbus Dong
Date: January 23, 2015
Assignment: GCD
School: Manteo High

Description: Program to find the GCD
*/

public class GCD
{
    /*Declare Instance Variables*/
    private int Number1;
    private int Number2;
    private int BiggerNum;
    private int SmallerNum;

    /*Create Default Constructor*/
    public GCD()
    {
        /*Initialize Instace Variables*/
        Number1 = 0;
        Number2 = 0;
        BiggerNum = 0;
        SmallerNum = 0;
    }

    public GCD(int Num1, int Num2)
    {        
        Number1 = Num1;
        Number2 = Num2;
        
        /*Find The Bigger of Two Numbers*/
        if (Num1 > Num2)
        {
            BiggerNum = Num1;
            SmallerNum = Num2;
        }
        else if (Num1 < Num2)
        {
            BiggerNum = Num2;
            SmallerNum = Num1;
        }

        while (SmallerNum != 0 && BiggerNum != 0)
        {
            int OtherNum = SmallerNum;
            SmallerNum = BiggerNum%SmallerNum; 
            BiggerNum = OtherNum;
        }
    
    }
    
    public String toString()
    {
        String str = "The GCD of";
        str += " " + Number1;
        str += " and " + Number2;
        str += " is " + (BiggerNum + SmallerNum);
        return str;
    }
}