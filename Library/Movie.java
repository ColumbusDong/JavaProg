/*
Programmer: Columbus Dong
Date: March 26, 2015
Assignment: Library
*/

/*Import Ultities*/
import java.util.Calendar;


public class Movie extends Media
{
    /*Instance Variables*/
    private int year;
    private String director;

    /*Default*/
    public Movie()
    {
        /*Get Data From Parent[Media], Default*/
        super(null, null);

        year = 0;
        director = null;
    }

    /*Regular*/
    public Movie(String t, Calendar c, int y, String d)
    {
        /*Get Data From Parent[Media], Regular*/
        super(t, c);

        year = y;
        director = d;
    }

    /*Copy Movie*/
    public Movie(Movie m)
    {
        super(m.title, m.today);
        year = m.year;
        director = m.director;
    }

    /*Return Date from Media class*/
    public Calendar getReturnDate()
    {
        /*New Calendar for Return Date*/
        Calendar dueDate = Calendar.getInstance();

        /*Month is Current Month*/
        dueDate.set(today.MONTH, today.get(today.MONTH)); //Number 0 - 11
        /*Year is Current Year*/
        dueDate.set(today.YEAR, today.get(today.YEAR));
        /*Due Date is 7 Days Later*/
        dueDate.add(today.DATE, 7);
        //Can be written as dueDate.add(today.DATE, 7);
        
        return dueDate;
    }

    /*Output Specs*/
    public String toString()
    {
        String str = "Movie Info: ";
        str += "\n\t Title: " + title;
        str += "\n\t Director: " + director;
        str += "\n\t Year Published: " + year;
        str += "\n\t Checkout Date: " + (getReturnDate().MONTH + 1) + "/" + getReturnDate().DATE;
        return str;
    }

    /*---------------Accessors---------------*/
    public int getYear()
    {
        return year;
    }

    public String getDirector()
    {
        return director;
    }

    /*---------------Mutators---------------*/
    public void setYear(int y)
    {
        year = y;
    }

    public void setDirector(String d)
    {
        director = d;
    }
}