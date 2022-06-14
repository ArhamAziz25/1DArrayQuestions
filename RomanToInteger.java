import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="MDCXCV";
                HashMap<Character,Integer> map=new HashMap<>();
                map.put('I',1);
                map.put('V',5);
                map.put('X',10);
                map.put('L',50);
                map.put('C',100);
                map.put('D',500);
                map.put('M',1000);
                int sum=0;
                int i=0;
                while(i<s.length())
                {
                    int nextValue=0;
                    int currentValue=map.get(s.charAt(i));
                    if(i+1<s.length())
                    {
                        nextValue=map.get(s.charAt(i+1));
                    }
                    if(currentValue<nextValue)
                    {
                        sum=sum+(nextValue-currentValue);
                        i=i+2;
                    }
                    else{
                        sum=sum+currentValue;
                        i++;
                    }                
                }
               System.out.println(sum);
            }
        }
    