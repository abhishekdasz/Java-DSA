public class MissingNum
{
    int findMissingNum(int arr[], int n)
    {
        int xorSum = 0;
        for(int i=0; i<=arr.length-1; i++)
        {
            xorSum = xorSum ^ arr[i];
        }
        for(int i=0; i<=n; i++)
        {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
    public static void main(String[] args) 
    {
        int arr[] = {0,5,3,1,2};
        MissingNum obj = new MissingNum();
        System.out.println(obj.findMissingNum(arr, 5));
    }    
}
