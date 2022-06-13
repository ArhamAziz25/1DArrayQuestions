import java.util.HashMap;

public class Sheet15 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                System.out.println("True");
                System.exit(1); // Stops the java program immediately
            }
            else{
                map.put(arr[i], i);
            }
        }
        System.out.println("False");



    }
    
}
