

public class HowManyNumbers {
    public static void main(String[] args) {
        int arr[]={6,5,4,8};
        int arr2[]=new int[arr.length];
      
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j] && arr[i]!=arr[j])
                {
                    count++;
                    arr2[i]=count;
                }
            }
        }

       for (int i : arr2) {

           System.out.print(i+" ");
       }
    }
    
}
