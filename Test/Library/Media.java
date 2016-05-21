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
    private String title;
    private Calendar checkOut;

    /*Default*/
    public Media()
    {
        title = null;
        checkOut = Calendar.getInstance();
    }

    /*Regular*/
    public Media(String t, Calendar c)
    {
        title = t;
        checkOut = c;
    }

    /*Return Date on the Media*/
    public abstract Calendar getReturnDate();
}