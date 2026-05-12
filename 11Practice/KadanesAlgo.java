public class KadanesAlgo 
{
    void kadaneAlgo(int arr[])
    {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++)
        {
            sum = sum+arr[i];
            if(sum<0)
            {  
                sum = 0;
            }
            if(sum>maxSum)
            {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) 
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadanesAlgo obj = new KadanesAlgo();
        obj.kadaneAlgo(arr);
    }    
}