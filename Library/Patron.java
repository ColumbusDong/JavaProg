/*
Programmer: Columbus Dong
Date: March 26, 2015
Assignment: Library
*/

public class Patron
{
    /*Instance Variables*/
    private String FName;
    private String LName;
    private String libNum;
    private Media myMedia;


    /*Default*/
    public Patron()
    {
        FName = null;
        LName = null;
        libNum = null;
        myMedia = null;
    }

    /*Regular*/
    public Patron(String f, String l, String ln, Media m)
    {
        FName = f;
        LName = l;
        libNum = ln;
        myMedia = m;
    }

    /*-----------------------Accessors (Getters a.k.a. Get Info)-----------------------*/
    public String getFName()
    {
        return FName;
    }

    public String getLName()
    {
        return LName;
    }

    public String getLibNum()
    {
        return libNum;
    }

    public Media getMedia()
    {
        return myMedia;
    }

    /*-----------------------Mutator (Setters a.k.a Set Info)-----------------------*/
    public void setFName(String f)
    {
        FName = f;
    }

    public void setLName(String l)
    {
        LName = l;
    }

    public void setLibNum(String ln)
    {
        libNum = ln;
    }

    public void setMedia(Media m)
    {
        myMedia = m;
    }

    /*Output Specs*/
    public String toString()
    {
        String str = "The Specs of This Patron are:";
        str += "\n\t FName: " + FName;
        str += "\n\t LName: " + LName;
        str += "\n\t Library Number: " + libNum;
        str += "\n\n\t Media: " + myMedia;
        return str;
    }
}