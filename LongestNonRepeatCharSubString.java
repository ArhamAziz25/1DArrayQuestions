import java.util.HashMap;

public class LongestNonRepeatCharSubString {
    public static void main(String[] args) {
        String str="abcdefabcdefghiu";
        int count=0;
        int maxCount=0;
        if(str.length()==1)
        {
            maxCount=1;
        }
        for(int i=0;i<str.length();i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            map.put(str.charAt(i), 1);
            count=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(!map.containsKey(str.charAt(j)))
                {
                    map.put(str.charAt(j), 1);
                    count++;
                    if(count>maxCount)
                    {
                        maxCount=count;
                    }
                }
                else{
                    if(count>maxCount)
                    {
                        maxCount=count;
                    }
                    break;
                }

            }
        }
        System.out.println(maxCount);
    }
    
}
