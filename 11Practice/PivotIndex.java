public class PivotIndex 
{
    void findPivotIndex(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            int sumOfLeft = 0;
            int sumOfRight = 0;
            for(int j=0; j<i; j++)
            {
                sumOfLeft = sumOfLeft + arr[j];
            }
            for(int k=i+1; k<=arr.length-1; k++)
            {
                sumOfRight = sumOfRight + arr[k];
            }
            // System.out.println("For index: " + i + " sum of left: "+sumOfLeft+ " sum of right: "+sumOfRight);
            if(sumOfLeft == sumOfRight)
            {
                System.out.println("Pivot index: "+i);
            }
        }
    }
    int optimal(int arr[])
    {
        int leftSum[] = new int[arr.length];
        int rightSum[] = new int[arr.length];

        leftSum[0] = arr[0];
        for(int i=1; i<=arr.length-1; i++)
        {
            leftSum[i] = arr[i]+leftSum[i-1];
        }
        rightSum[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--)
        {
            rightSum[i] = arr[i]+rightSum[i+1];
        }

        for(int i=0; i<=leftSum.length-1; i++)
        {
            if(leftSum[i] == rightSum[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,1,-1};
        PivotIndex obj = new PivotIndex();
        obj.findPivotIndex(arr);

        System.out.println("optimal soln");
        System.out.println("Pivot index: "+obj.optimal(arr));
    }
}
