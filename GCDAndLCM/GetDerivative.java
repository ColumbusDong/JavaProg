import java.util.*;
/** AP Computer Science Group 5
  * Written by: Benjamin Pachter
  * Assistance from: Columbus Dong, Johnny Styles
  * 
  * This program asks for the attributes of a polynomial function and prints the resulting derivative of the function.
  * 2/2/2015
  */
public class GetDerivative
{ 
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("What order is the polynomial?"); 
        int order = sc.nextInt(); 
        int[] coeffs = new int[order]; 
        for(int i = 0; i < coeffs.length; i++)
        { 
            System.out.println("What is the x^" + (order-i) + " term?"); 
            coeffs[i] = sc.nextInt(); 
        } 
        int[] newCoeffs = new int[order]; 
        for(int i = 0; i < newCoeffs.length; i++)
        { 
            newCoeffs[i] = coeffs[i]*(order-i); 
        } 
        String output = ""; 
        for(int i = 0; i < newCoeffs.length; i++)
        { 
            output = output + newCoeffs[i] + "x^" + (order-i-1); 
            if(order-i != 1) output = output + " + "; 
        } 
        System.out.println("Answer is " + output); 
    } 
}