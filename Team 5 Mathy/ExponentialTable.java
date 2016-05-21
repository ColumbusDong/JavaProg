/*
Programmer: Columbus Dong
Date: Feburary 1-7, 2015
Program: Mathy
*/

import java.text.DecimalFormat;

public class ExponentialTable
{
    /*Instance Variables*/
    private double initial;
    private double rate;
    private int start;
    private int end;
    private int step;
    private double endAmount;
    private String str;

    /*Default*/
    public ExponentialTable()
    {
        initial = 0;
        rate = 0;
        start = 0;
        end = 0;
        endAmount = 0;
    }

    /*Regular*/
    public ExponentialTable(double amount, double percent, int timeStart, int timeEnd, int increase)
    {
        initial = amount;
        rate = percent;
        start = timeStart;
        end = timeEnd;
        step = increase;

        /*Add 1 to Rate*/
        rate += 1;

        DecimalFormat numbers = new DecimalFormat("##.##");

        /*Header*/
        str = "X" + "\t*" + "Y = " + initial + "(" + rate + ")^X" + "*\t" + "Y";
        str += "\n*****************************************";

        while (timeStart <= timeEnd)
        {
            endAmount = initial * (Math.pow(rate, timeStart));

            str += "\n" + numbers.format(timeStart) + "\t*" + "Y = " + initial + "(" + rate + ")^" + timeStart + "*\t" + numbers.format(endAmount);

            timeStart += step;
        }
    }

    public String toString()
    {
        return str;
    }
}