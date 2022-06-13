public class largest {
    public static void main(String[] args) {
        
        int arr[]=new int[]{23,56,12,89,101,100,99,11};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    
        }
        System.out.println("Max element is:"+max);
    }
}
