import java.util.Map;
import java.util.HashMap;

class HashmapPractice
{
    public static void main(String[] args) 
    {
        Map <String, String> mapping = new HashMap<>();
        mapping.put("us", "United States");
        mapping.put("in", "India");
        mapping.put("en", "England");

        System.out.println(mapping);
        for(String key: mapping.keySet())
        {
            System.out.println(key + " "+ mapping.get(key));
        }

        System.out.println(mapping.getOrDefault("usa", "NULL"));


        Map <Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 10);
        map2.put(2, 20);
        map2.put(3, 30);
        map2.put(4, 40);

        System.out.println(map2);
        System.out.println(map2.getOrDefault(50, 0+1));
        System.out.println("key set");
        for(int i: map2.keySet())
        {
            System.out.println(map2.get(i));
        }
    }
}