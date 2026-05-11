public class RemDuplElemFromArray 
{
    void optimalSol(int arr[])
    {
        System.out.println(arr[0]);
        for(int i=1; i<=arr.length-1; i++)
        {
            if(arr[i]>arr[i-1])
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,2,3,3,4,4,4,5,5};
   
        RemDuplElemFromArray obj = new RemDuplElemFromArray();
        obj.optimalSol(arr);
    }    
}
