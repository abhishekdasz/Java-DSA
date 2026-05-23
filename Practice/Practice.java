class Practice 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,4,5,2,3};
        for(int i=1; i<=arr.length-1; i++)
        {
            int currVal = arr[i];
            int prev = i-1;
            while(prev>=0 && currVal<arr[prev])
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currVal;
        }
        System.out.println("printing array:");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }    
}
