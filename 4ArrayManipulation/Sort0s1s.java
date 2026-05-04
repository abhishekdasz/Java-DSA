public class Sort0s1s 
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
    void sortArrayTwoPointer(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] == 0)
            {
                left++;
            }
            else if(arr[right] == 1)
            {
                right--;
            }
        }
        System.out.println();
        System.out.println("Printing sorted 0s & 1s:");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,0,1,1,0,0,1};
        Sort0s1s obj = new Sort0s1s();
        obj.sortArray(arr);

        obj.sortArrayTwoPointer(arr);
    }
}
