public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,2,6,4,3,1};
        for(int i=0; i<=arr.length-1; i++)
        {
            int min = i;
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }  
        
        System.out.println("printing sorted array: ");

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
