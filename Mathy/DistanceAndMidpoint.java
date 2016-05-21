public class DistanceAndMidpoint
{
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;  
    private double distance;
    private double midX;
    private double midY;
    
    public DistanceAndMidpoint()
    {
        //default constructor
        firstX = 0;
        secondX = 0;
        firstY = 0;
        secondY = 0;
    }
    
    public DistanceAndMidpoint(int X1, int Y1, int X2, int Y2)
    {
        //normal constructor
        firstX = X1;
        firstY = Y1;
        secondX = X2;
        secondY = Y2;       
        
        distance = Math.sqrt(((secondX-firstX)*(secondX-firstX)) + ((secondY-firstY) * (secondY-firstY)));       
        distance = (double)Math.round(distance*100)/100;
        
        midX = ((double) (firstX+secondX)/2);
        midY = ((double) (firstY+secondY)/2);
    }
    
    public String toString()
    {
        //return string
        String str = "The Midpoint of the two points is (" + midX + ", " + midY + ").";
        str += "\nThe Distance between the two points is " + distance;
        
        return str;
    }    
}