/** Benjamin Pachter
 * Slope mx+B thingy
 */
 
public class SlopeMxB
{ 
    private int firstX;
    private int secondX;
    private int firstY;
    private int secondY;
    private double m;
    private double b;
    
    public SlopeMxB()
    {
        //Default Constructor
        firstX = 0;
        secondX = 0;
        firstY = 0;
        secondY = 0;
    }
    
    public SlopeMxB(int X1, int Y1, int X2, int Y2)
    {
        //Normal Constructor
        firstX = X1;
        firstY = Y1;
        secondX = X2;
        secondY = Y2;
        
        m = ((double)secondY-firstY)/((double)secondX-firstX); 
        b = (double)firstY - m*firstX;
    }  
    
    public String toString()
    {                 
        String str = "Slope: " + m;
        str += ("\nEquation: y = " + m + "x + " + b);
        return str;
    }
    
        /*getters*/
    public double getSlope()
    {
        return m;
    }

    public double getIntercept()
    {
        return b;
    }
}