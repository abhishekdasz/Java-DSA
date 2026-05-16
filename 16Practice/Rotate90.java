class Rotate90
{
    void printTwoD(int arr1[][])
    {
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr1[0].length-1; j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        } 
    }
    void printTranspose(int arr1[][])
    {
        int rowsOfArr1 = arr1.length;
        int colsOfArr1 = arr1[0].length;
        int arr2[][] = new int[colsOfArr1][rowsOfArr1];
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr1[0].length-1; j++)
            {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("Printing transpose array:");
        printTwoD(arr2); 
    }

    void printRotate90(int arr1[][])
    {
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=i+1; j<=arr1[0].length-1; j++)
            {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        // reversing row
        for(int i=0; i<=arr1.length-1; i++)
        {
            int start = 0; 
            int end = arr1[0].length-1;
            while(start<=end)
            {
                int temp = arr1[i][start];
                arr1[i][start] = arr1[i][end];
                arr1[i][end] = temp;
                start++;
                end--;
            }  
        }
        System.out.println("Printing 90 degree rotated array:");
        printTwoD(arr1);
    }
    public static void main(String[] args) 
    {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9},{0,3,2}};  
        Rotate90 obj = new Rotate90();
        obj.printTwoD(arr1); 
        obj.printTranspose(arr1);

        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("print");
        obj.printRotate90(arr2);
    }
}