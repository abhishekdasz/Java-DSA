public class WavePrintAMatrix 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int row=0; row<=arr[0].length-1; row++)
        {
            if(row==0)
            {
                for(int col=0; col<=arr.length-1; col++)
                {
                    System.out.print(arr[col][row]+ " ");
                }
            }
            if(row%2==0 && row!=0)
            {
                for(int col=0; col<=arr.length-1; col++)
                {
                    System.out.print(arr[col][row]+ " ");
                }
            }
            else if(row%2==1 && row!=0)
            {
            for(int col=arr.length-1; col>=0; col--)
            {
                System.out.print(arr[col][row]+" ");
            }
            }
            System.out.println();
        }
    }
}
