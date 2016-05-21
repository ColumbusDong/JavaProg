/*
Programmer: Columbus Dong
Assignment: Transposing an Array, Diagonal Totals, Row and Column Totals
Date: April 6, 2015
*/

public class superArray
{
    private int[][] originalArray = new int[5][5];

    public superArray()
    {

    }

    public superArray(int normalArray[][])
    {
        originalArray = normalArray;
    }

    /*Transpose*/
    public void Transpose()
    {
        System.out.println("Transposed Array: \n");

        /*Tranpose Array*/
        for (int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {
                System.out.print(originalArray[y][x] + "\t");
            }

            /*Space*/
            System.out.println("\n");
        }
    }

    /*Diagonal Sum*/
    public void Diagonals()
    {
        /*Variables*/
        int mainDiag = 0;
        int otherDiag = 0;
        int mainDiagCounter = 0;
        int otherDiagCounter = 4;

        for (int x = 0; x < 5; x++)
        {
            /*Totaling Main Diagonal*/
            mainDiag += originalArray[x][mainDiagCounter];
            mainDiagCounter++;

            /*Totaling Other Diagonal*/
            otherDiag += originalArray[x][otherDiagCounter];
            otherDiagCounter--;
        }

        System.out.println("Main Diagonal Sum: " + mainDiag);
        System.out.println("Other Diagonal Sum: " + otherDiag);
    }

    /*Row and Column Sum*/
    public void Totals()
    {
        int rowTotal = 0;
        int columnTotal = 0;
        int columnCulmulativeTotal = 0;

        int columnTotalsHolder[] = new int[5];

        for (int row = 0; row < 5; row++)
        {
            rowTotal = 0;
            columnTotal = 0;

            for (int column = 0; column < 5; column++)
            {
                rowTotal += originalArray[row][column];
                columnTotal += originalArray[column][row];

                /*Print Out Array*/
                System.out.print(originalArray[row][column] + "\t");
            }

            /*Set Index in Column Total Array*/
            columnTotalsHolder[row] = columnTotal;

            /*Print rowTotal*/
            System.out.print(rowTotal);

            /*Space*/
            System.out.println("\n");
        }

        for (int i = 0 ; i < 5; i++)
        {
            System.out.print(columnTotalsHolder[i] + "\t");

            /*Get a Total for the Final Row*/
            columnCulmulativeTotal += columnTotalsHolder[i];
        }

        System.out.print(columnCulmulativeTotal);
    }
}