class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {5,2,6,4,3,1};
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("printing sorted array:");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}