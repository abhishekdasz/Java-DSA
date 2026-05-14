public class Transpose 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8}};
        
        int rowOfArr1 = arr.length;
        int colOfArr1 = arr[0].length;
        int arr2[][] = new int[colOfArr1][rowOfArr1];

        for(int i=0; i<= arr.length-1; i++)
        {
            for(int j=0; j<=arr[0].length-1; j++)
            {
                arr2[j][i] = arr[i][j]; 
            }
        }

        for(int i=0; i<=arr2.length-1; i++)
        {
            for(int j=0; j<=arr2[0].length-1; j++)
            {
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
    }    
}
