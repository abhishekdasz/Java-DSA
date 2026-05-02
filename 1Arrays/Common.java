public class Common 
{
    void evenElements(int arr1[])
    {
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
        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr2[i]);
        }
    }
    public static void main(String[] args) 
    {
        Common obj = new Common();
        int arr1[] = {1,2,3,4,5,6,7,8};   
        System.out.println("Even elements array:");
        obj.evenElements(arr1);

    }
}
