/*
Programmer: Columbus Dong
Date: March 26, 2015
Assignment: Library
*/

/*Import Ultities*/
import java.util.Calendar;

public class Book extends Media
{
    /*Instance Variables*/
    private String title;
    private String author;
    private Calendar today;

    /*Default*/
    public Book()
    {
        /*Assign Literals*/
        title = null;
        author = null;
        today = Calendar.getInstance();
    }

    /*Regular*/
    public Book(String t, String a, Calendar c)
    {
        /*Assign Literals*/
        title = t;
        author = a;
        today = c;
    }

    /*Copy Book*/
    public Book(Book b)
    {
        title = b.title;
        author = b.author;
        today = b.today;
    }

    /*Return Date from Media class*/
    public Calendar getReturnDate()
    {
        /*New Calendar for Return Date*/
        Calendar dueDate = Calendar.getInstance();

        /*Month is Current Month*/
        dueDate.set(today.MONTH, today.get(today.MONTH));
        /*Year is Current Year*/
        dueDate.set(today.YEAR, today.get(today.YEAR));
        /*Due Date is 21 Days Later*/
        dueDate.set(today.DATE, today.get(today.DATE + 21));

        return dueDate;
    }

    /*Output Specs*/
    public String toString()
    {
        String str = "The specs of this book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        str += "\n\t Checkout  Date: " + today; 
        return str;
    }

    /*-----------------------Accessors (Getters a.k.a. Get Info)-----------------------*/
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public Calendar getToday()
    {
        return today;
    }

    /*-----------------------Mutator (Setters a.k.a Set Info)-----------------------*/
    public void setTitle(String t)
    {
        title = t;
    }

    public void setAuthor(String a)
    {
        author = a;
    }

    public void setToday(Calendar c)
    {
        today = c;
    }
}