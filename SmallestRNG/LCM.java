import java.util.Scanner;
public class LCM
{
  public static void main(String args[])
    {
      Scanner sin=new Scanner(System.in);
      int n1,n2;
      System.out.println("Enter First Number : ");
      n1=sin.nextInt();
      System.out.println("Enter Second Number : ");
      n2=sin.nextInt();
      int lcm=(n1*n2)/GCD(n1,n2);
      System.out.println("LCM is : "+lcm);
    }
  public static int GCD(int n1,int n2)
    {
      while(n1!=n2)   
   {
  if(n1>n2)
    n1=n1-n2;
  else
    n2=n2-n1;
   }
      return n1;
    }
}