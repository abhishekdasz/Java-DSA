public class SortZeroOne 
{
    void sortArray(int arr[])
    {
        int zeroCount=0;
        int oneCount =0;
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i] == 0)
            {
                zeroCount++;
            }
            else
            {
                oneCount++;
            }
        }
        System.out.println("zero" + zeroCount);
        System.out.println("one"+ oneCount);
        int sortedArr[] = new int[zeroCount+oneCount];
        for(int i=0; i<=zeroCount-1; i++)
        {
            sortedArr[i] = 0;
        }
        for(int i=zeroCount; i<=sortedArr.length-1; i++)
        {
            sortedArr[i] = 1;
        }

        System.out.println("Printing sorted array:");
        for(int i=0; i<=sortedArr.length-1; i++)
        {
            System.out.print(sortedArr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,0,1,1,0,0,1};
        SortZeroOne obj = new SortZeroOne();
        obj.sortArray(arr);
    }
}
