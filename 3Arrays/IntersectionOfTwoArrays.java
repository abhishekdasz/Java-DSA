import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays 
{
    void usingHashmap(int arr1[], int arr2[])
    {
        Map <Integer, Integer> map = new HashMap<>();
        for(int num : arr1) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for(int num : arr2)
        {
            if(map.containsKey(num) && map.get(num)>0)
            {
                System.out.println(num);
                map.put(num, map.get(num)-1);
            }
        }
    }
    void usingHashmapNoDupl(int arr1[], int arr2[])
    {
        Map <Integer, Integer> map = new HashMap<>();
        for(int num : arr1) 
        {
            map.put(num, 1);
        }
        System.out.println(map);
        for(int num : arr2)
        {
            if(map.containsKey(num) && map.get(num) == 1)
            {
                System.out.println(num);
                map.put(num, 0);
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr1[] = {1,1,2,3,3,4,4,4,5};
        int arr2[] = {1,3,3,3,5,7,9,11};

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

        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        obj.usingHashmap(arr1, arr2);

        System.out.println("no duplicates");
        obj.usingHashmapNoDupl(arr1, arr2);
    }
}
