public class Common 
{
    public static void main(String[] args) 
    {
        int arr1[] = {1,2,3,4,5,6,7,8};   
        int count = 0;
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]%2==0)
            {
                count++;
            }
        }
        int arr2 [] = new int[count];
        int j=0; 
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]%2==0)
            {
                arr2[j] = arr1[i];
                j++;
            }
        }

        System.out.println("Even elements array:");
        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
