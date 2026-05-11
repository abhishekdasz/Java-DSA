import java.util.HashMap;
public class FindFirstRepeatingElem 
{
    int findRepEle(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return 0; 
    }
    void optimal(int arr[])
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=arr.length-1; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);

        for(int i=0; i<=arr.length-1; i++)
        {
            if(map.get(arr[i]) > 1)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,5,3,4,3,5,6};
        FindFirstRepeatingElem obj = new FindFirstRepeatingElem();
        System.out.println(obj.findRepEle(arr));
        obj.optimal(arr);
    }
}
