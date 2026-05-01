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
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,5,2,2,4,1,4,3,3,4};
        ArrayPractice obj = new ArrayPractice();
        System.out.println("Freq of Num in an array:");
        obj.freqOfNumInArray(arr);
    }
}
