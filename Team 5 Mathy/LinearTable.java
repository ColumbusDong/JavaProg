/*
Programmer: Columbus Dong
Date: Feburary 1-7, 2015
Program: Mathy
*/
import java.text.DecimalFormat;

public class LinearTable
{
    /*Instance Variables*/
    private double slope;
    private double intercept;
    private double y;
    private int step;
    private int start;
    private int stop;
    private String str;
    /*Default Constructor*/
    public LinearTable()
    {
        slope = 0;
        intercept = 0;
        step = 0;
    }

    /*Regular Constructor*/
    public LinearTable(double m, double b, int begin, int end, int skip)
    {
        slope = m;
        intercept = b;
        start = begin;
        stop = end;
        step = skip;
        
        DecimalFormat numbers = new DecimalFormat("##.##");
        str = "X" + "\t*" + "Y = " + slope + "X + " + intercept + "*\t" + "Y";
        str += "\n*****************************************";

        while (start <= stop)
        {
            y = (slope * start) + intercept;

            str += "\n" + numbers.format(start) + "\t*" + "Y = " + slope + "(" + start + ") + " + intercept + "*\t" + numbers.format(y);

            start += step; 
        }
    }

    /*Output*/
    public String toString()
    {
        return str;
    }

}