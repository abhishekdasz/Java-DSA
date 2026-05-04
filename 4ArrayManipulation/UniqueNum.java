class UniqueNum 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,3,5,4,5,3,4};
        int xorSum=0;
        for(int i=0; i<=arr.length-1; i++)
        {
            xorSum = xorSum^arr[i];
        }
        System.out.println(xorSum);
    }    
}