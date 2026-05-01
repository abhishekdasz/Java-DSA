import java.util.HashMap;
import java.util.Map;

public class ArrayPractice 
{
    void freqOfNumInArray(int arr[])
    {
        Map <Integer, Integer> freq = new HashMap<>();

        for(int num: arr)
        {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);

        for(int i: freq.keySet())
        {
            System.out.println("Num:"+ i + " Freq:"+ freq.get(i));
        }
    }
    void modeOfAnArray(int arr[])
    {
        Map <Integer, Integer> map = new HashMap<>();
        for(int num: arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        int maxFreqCount = 0;
        int maxFreqCountKey = 0;
        for(int num: map.keySet())
        {
            int currentKey = num;
            int freqOfCurrentkey = map.get(num);
            if(freqOfCurrentkey>maxFreqCount)
            {
                maxFreqCount = freqOfCurrentkey;
                maxFreqCountKey = currentKey;
            }
        }
        System.out.println("Max Freq Key: "+maxFreqCountKey+ " count: "+maxFreqCount);
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,5,2,2,4,1,4,3,3,4};
        ArrayPractice obj = new ArrayPractice();
        System.out.println("Freq of Num in an array:");
        obj.freqOfNumInArray(arr);

        int arr2[] = {1,1,1,1,2,2,2,3,3,4};
        System.out.println("Mode of Array:");
        obj.modeOfAnArray(arr2);
    }
}
