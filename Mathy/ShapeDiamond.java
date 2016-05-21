import java.util.Scanner;

public class ShapeDiamond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = input.nextInt();
        input.close();
        
        {
        for (int i = 0; i < n;i++) {
        for (int g = 0; g <=i; g++)
            System.out.print ("*");
       System.out.print ("\n");
        //
        for (int t = 0; t <= i; t++)    
        for (int j = 0; j < t;j++)
            System.out.print (" ");
        }
        System.out.print ("\n");
        }
    }      
}