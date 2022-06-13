//TWO SUM WITH HASHMAP


import java.util.HashMap;

public class hashmappp {
    public static void main(String[] args) {
        int arr[]=new int[]{3,3};
        int target=6;
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int key=target-arr[i];
            if(maps.get(arr[i])==null)
            {
                maps.put(key,i);
            }
            else{
                System.out.println(maps.get(arr[i])+" "+i);
            }
        }

    }
    
}
