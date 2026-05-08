public class ThreeSum 
{
    int[] findThreeSum(int arr[], int target)
    {
        int sum=0;
        int arr2[] = new int[3];
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=i+1; j<=arr.length-1; j++)
            {
                for(int k=j+1; k<=arr.length-1; k++)
                {
                    sum = arr[i]+arr[j]+arr[k];
                    if(sum==target)
                    {
                        arr2[0] = arr[i];
                        arr2[1] = arr[j];
                        arr2[2] = arr[k];
                    }
                }
            }
        }
        return arr2;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,1,3,5,4,6};
        ThreeSum obj = new ThreeSum();
        int result[] = obj.findThreeSum(arr, 6);
        for(int num : result)
        {
            System.out.print(num + " ");
        }

    }    
}  
