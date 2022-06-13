public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]=new int[]{0,0,1,1,1,2,3,3,3,4};
        int j=0;
   
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
            
        }
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }
    
}
