/**
 * Pythagorean Theorem
 */
//for testing purposes
//import java.util.*;
//import java.io.*;
public class PT
{
    public int a;
    public int b;
    public int c;
    public int d;
    public PT(int sidea, int sideb, int sidec)
    {  
        /**
         * A^2 + B^2 = C^2
         */
        
        a = sidea;
        b = sideb;
        c = sidec;
        
        a=(a*a);
        b=(b*b);
        c=(c*c);
        
        /**
         * since the uses enters 0 for the missing side it will always multiply to 0
         * the if statements find the value of the missing side
         */
        if (a==0)
        {
          d=c-b;
          System.out.println("A equals: "+Math.sqrt(d));
        }
        
        if (b==0)
        {
          d=c-a; 
          System.out.println("B equals: "+Math.sqrt(d));
        }
        
        if (c==0)
        {
          d=a+b; 
          System.out.println("C equals: "+Math.sqrt(d));
        }
    }
}