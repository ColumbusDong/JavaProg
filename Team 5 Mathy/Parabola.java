import java.util.Scanner;
/**
 * Returns the equation of a parabola given one point on the pararbola and the vertex assuming a is an integer.
 * 
 * @author will lewis 
 */
public class Parabola
{
    public Parabola()
    {
        
    }

    public String findParabola()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please input the vertex (h, k) and one point on the parabola (x1, y1) (INTEGERS ONLY)");
        
        System.out.print("\nPlease enter h: ");
        int h = kb.nextInt();
        System.out.print("Please enter k: ");
        int k = kb.nextInt();
        System.out.print("Please enter X1: ");
        int x1 = kb.nextInt();
        System.out.print("Please enter Y1: ");
        int y1 = kb.nextInt();
        int a = ((y1-k)/((x1-h)*(x1-h)));
        return ("The parabola in vertex form is: " + "Y=(" + a + ")(X-(" + h + "))^2+(" + k +")");
    }

}

