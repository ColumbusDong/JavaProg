public class Testing
{
    public static void main(String args[])
    {
        int x = 1;
    
        while (x <= 31)
        {
            System.out.println("Day: " + x + "\t\tRemainder: " + x%7);
            x++;
        }
    }
}