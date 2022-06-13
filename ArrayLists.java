import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(24);
        list.add(247);
        list.add(254);
        list.add(2);
        list.add(4);
        list.get(3);
        list.remove(4);
        list.set(2,1000);


        for (Integer i : list) {
            System.out.println(i);
            
        }

    }
    
}
