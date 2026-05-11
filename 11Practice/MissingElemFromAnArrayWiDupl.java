import java.util.ArrayList;
import java.util.List;

public class MissingElemFromAnArrayWiDupl 
{
    List <Integer> findMissElem(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            int value = Math.abs(arr[i]);
            int position = value-1;
            if(arr[position] > 0)
            {
                arr[position] = -arr[position];
            }
        }

        List<Integer> li = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i] > 0)
            {
                li.add(i+1);
            }
        }
        return li;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,4,4,5,2,2};
        MissingElemFromAnArrayWiDupl obj = new MissingElemFromAnArrayWiDupl();
        System.out.println(obj.findMissElem(arr));
    }    
}
