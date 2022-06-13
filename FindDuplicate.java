import java.util.HashMap;

//when only one element is duplicate and we have to find out which one?
public class FindDuplicate
{
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,1,1,1,1,2,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
            map.put(arr[i],++count);
            }
            else{
                count=0;
                map.put(arr[i], count++);
            }
        }
        System.out.println(map);
    }
}