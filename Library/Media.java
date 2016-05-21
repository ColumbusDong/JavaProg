/*
Programmer: Columbus Dong
Date: March 26, 2015
Assignment: Library
*/

/*Import Utilities*/
import java.util.Calendar;  //Calender

public abstract class Media
{
    /*Instance Variables*/
    public String title;
    public Calendar today;

    /*Default*/
    public Media()
    {
        title = null;
        today = Calendar.getInstance();
    }

    /*Regular*/
    public Media(String t, Calendar c)
    {
        title = t;
        today = c;
    }

    /*---------------Accessors---------------*/
    public Calendar getToday()
    {
        return today;
    }

    public String getTitle()
    {
        return title;
    }

    /*---------------Mutators---------------*/
    public void setTitle(String t)
    {
        title = t;
    }

    public void setToday(Calendar c)
    {
        today = c;
    }

    /*Return Date on the Media*/
    public abstract Calendar getReturnDate();

}