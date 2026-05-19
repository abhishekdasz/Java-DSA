public class SpiralPrint 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
        int m = arr.length;
        int n = arr[0].length;
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = m-1;
        int endingCol = n-1;

        while(startingRow<=endingRow && startingCol <=endingCol)
        {
            // row -> left-right -> startingCol-endingCol
            for(int i=startingCol; i<=endingCol; i++)
            {
                System.out.print(arr[startingRow][i]+" ");
            }
            startingRow++;
            // col -> top-bottom -> startingRow-endingRow
            for(int i=startingRow; i<=endingRow; i++)
            {
                System.out.print(arr[i][endingCol]+" ");
            }
            endingCol--;
            // row -> right-left -> endingCol-startingCol
            if(startingRow <= endingRow)
            {
                for(int i=endingCol; i>=startingCol; i--)
                {
                    System.out.print(arr[endingRow][i]+" ");
                }
            }
            endingRow--;
            // col -> bottom-top -> endingRow-startingRow
            if(startingCol <= endingCol)
            {
                for(int i=endingRow; i>=startingRow; i--)
                {
                    System.out.print(arr[i][startingCol]+" ");
                }
            }
            startingCol++;
        }
        
    }
}
