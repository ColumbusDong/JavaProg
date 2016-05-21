/**
 * Prints out a string with the point slope form.
 * 
 * @author will lewis
 */
public class PointSlope
{
    private double m;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public PointSlope(int X1, int Y1, int X2, int Y2)
    {
        x1 = X1;
        x2 = X2;
        y1 = Y1;
        y2 = Y2;

        m = ((double) (y2 - y1)/(y2 - y1));
    }

    public String PointForm()
    {
        String str = "Point slope form is: Y-(" + y1 + ")= (" + m + ")(X-(" + y1 + "))";
        return str;
    }

}
