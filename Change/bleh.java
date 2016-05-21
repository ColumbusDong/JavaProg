public class bleh
{
    
    public static void main(String args)
    {
        int[] A = new int[3];
        int[]B;
 
    for (int j=0;j<A.length;j++)
  A[j]=j;
  B=A;
    for (int j=0;j<A.length;j++ )
    A[j]++;
  for (int j=0;j<A.length;j++)
    System.out.print (A[j] + " "+ B[j] + " ");
  System.out.println();
    }
    }
