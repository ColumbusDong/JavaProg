import java.util.*;
import java.io.*;
/**
 * class that determines volume
 */

public class Vol
{
    public int L;
    public int W;
    public int H;
    public int B;
    public int R;
    public int R1;
    public int R2;
    public int R3;
    public double pi=3.14;
    public int choice;
    public double Vol;
    public double D;
    public Vol()
    {
      Scanner input = new Scanner(System.in);
      
      System.out.println("1. Cube");
      System.out.println("2. Rectangular prism");
      System.out.println("3. Irregular prism");
      System.out.println("4. Cylinder");
      System.out.println("5. Pyramid");
      System.out.println("6. Cone");
      System.out.println("7. Sphere");
      System.out.println("8. Ellipsoid");
      
      System.out.println("");
      
      System.out.print("Enter the number of you choice(1-8): ");
      choice = input.nextInt();
      
      System.out.println("");
      /**
       * cube and rectangular prism volume formula
       */
      if (choice==1 || choice==2)
      {
      System.out.print("Enter Length: ");
      L = input.nextInt();
      System.out.println("");
      System.out.print("Enter Width: ");
      W = input.nextInt();
      System.out.println("");
      System.out.print("Enter Height: ");
      H = input.nextInt();
      System.out.println("");
      Vol = L*W*H;
      System.out.println("The volume is: " + Vol);
    }
    /**
     * irregular prism volume formula
     */
    if (choice==3)
    {
      System.out.print("Enter base: ");
      B = input.nextInt();
      System.out.println("");
      System.out.print("Enter Height: ");
      H = input.nextInt();
      System.out.println("");
      Vol = B*H;
      System.out.println("The volume of the irregular prism is: " + Vol);
    }
    /**
     * cylinder volume formula
     */
    if (choice==4)
    {
      System.out.print("Enter radius: ");
      R = input.nextInt();
      System.out.println("");
      System.out.print("Enter height: ");
      H = input.nextInt();
      System.out.println("");
      R= R*R;
      Vol = pi*R*H;
      System.out.println("The volume of the cylinder is: "+ Vol);
    }
    /**
     * pyramid volume formula
     */
    if (choice==5)
    {
      System.out.print("Enter the base: ");
      B=input.nextInt();
      System.out.println("");
      System.out.print("Enter the height: ");
      H=input.nextInt();
      System.out.println("");
      D=1/3;
      Vol =B*H/D;
      System.out.println("The volume of the pyramid is: "+ Vol);
    }
    /**
     * cone volume formula
     */
    if (choice==6)
    {
       System.out.print("Enter the radius: ");
       R=input.nextInt();
       System.out.println("");
       System.out.print("Enter the height: ");
       H=input.nextInt();
       System.out.println("");
       D=1/3;
       R=R*R;
       Vol = D*pi*R*H;
       System.out.println("The volume of the cone is: "+ Vol);
    }
    /**
     * sphere volume formula
     */
    if (choice==7)
    {
       System.out.print("Enter the radius: ");
       R=input.nextInt();
       System.out.println("");
       R=R*R*R;
       D=4/3;
       Vol = pi*R*D;
       System.out.println("The volume of the sphere is: "+Vol);
    }
    /**
     * ellipsoid volume formula
     */
    if (choice==8)
    {
       System.out.print("Enter the first radius: ");
       R1= input.nextInt();
       System.out.println("");
       System.out.print("Enter the second radius: ");
       R2=input.nextInt();
       System.out.println("");
       System.out.print("Enter the third radius: ");
       R3=input.nextInt();
       System.out.println("");
       D=4/3;
       Vol= R1*R2*R3*D*pi;
       System.out.println("The volume of the ellipsoid is: "+ Vol);
    }
    
    }
}