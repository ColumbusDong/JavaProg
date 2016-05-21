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
    private String author;

    /*Default*/
    public Book()
    {
        /*Get Data From Parent[Media], Default*/
        super();
        
        /*Assign Literals*/
        author = null;
    }

    /*Regular*/
    public Book(String t, String a, Calendar c)
    {
        /*Get Data From Parent[Media], Regular*/
        super(t, c);
        
        /*Assign Literals*/
        author = a;
    }

    /*Copy Book*/
    public Book(Book b)
    {
        super(b.title, b.today);
        author = b.author;
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
        dueDate.add(today.DATE, 21);

        return dueDate;
    }

    /*Output Specs*/
    public String toString()
    {
        String str = "The specs of this book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        str += "\n\t Checkout Date: " + (getReturnDate().MONTH + 1) + "/" + getReturnDate().DATE; 
        return str;
    }

    /*-----------------------Accessors (Getters a.k.a. Get Info)-----------------------*/
    public String getAuthor()
    {
        return author;
    }

    /*-----------------------Mutator (Setters a.k.a Set Info)-----------------------*/
    public void setAuthor(String a)
    {
        author = a;
    }
}