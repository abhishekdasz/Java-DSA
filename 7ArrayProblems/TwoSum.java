public class TwoSum
{
    public static void main(String[] args) 
    {
        int arr[] = {2,1,3,5,4,6};
        int target=10;
        int sum=0;
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=i+1; j<=arr.length-1;j++)
            {
                sum = arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }    
    }    
}
