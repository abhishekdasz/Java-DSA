public class Practice 
{
    void printRotate(int arr1[][])
    {
        int rowOfArray1 = arr1.length;
        int colOfArray1 = arr1[0].length;
        int arr2 [][] = new int[colOfArray1][rowOfArray1];
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr1[0].length-1; j++)
            {
                arr2[j][rowOfArray1-1-i] = arr1[i][j];
            }
        }


        for(int i=0; i<=arr2.length-1; i++)
        {
            for(int j=0; j<=arr2[0].length-1; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) 
    {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};  
        Practice obj = new Practice();
        obj.printRotate(arr1);   
    }
}
