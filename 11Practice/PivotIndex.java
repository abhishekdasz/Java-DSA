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
            System.out.println("For index: " + i + " sum of left: "+sumOfLeft+ " sum of right: "+sumOfRight);
            if(sumOfLeft == sumOfRight)
            {
                System.out.println("Pivot index: "+i);
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,7,3,6,5,6};
        PivotIndex obj = new PivotIndex();
        obj.findPivotIndex(arr);

    }
}
