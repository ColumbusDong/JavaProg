/*
Programmer: Columbus Dong
Date: March 26, 2015
Assignment: Library
*/

public class testPatron
{
    public static void main(String args[])
    {
        Patron paEmily = new Patron();
        Media myBook = new Book();
        Media myMovie = new Movie();

        /*Set Book*/
        myBook.setTitle("ABC");
        ((Book) myBook).setAuthor("Suzie Smith"); //(Book) is a cast, allows media to access "Book"

        /*Set Movie*/
        myMovie.setTitle("Rush Hour 3");
        ((Movie) myMovie).setYear(2006);
        ((Movie) myMovie).setDirector("Brett Ratner");

        /*Print */
        System.out.print(myBook);
        System.out.println("");
        System.out.print(myMovie);
    }
}