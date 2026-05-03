public class IntersectionOfTwoArrays 
{
    public static void main(String[] args) 
    {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,20};
        int arr2[] = {2,4,6,8,10,12,14,16,18,20};

        int count = 0;
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr2.length-1; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    count++;
                }
            }
        }
        int commonArr[] = new int[count];
        int k=0;
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr2.length-1; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    commonArr[k] = arr1[i];
                    k++;
                }
            }
        }

        for(int i=0; i<=commonArr.length-1; i++)
        {
            System.out.println(commonArr[i]);
        }
    }
}
