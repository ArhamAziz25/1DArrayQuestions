public class span {
    public static void main(String[] args) {
        int arr[]=new int[]{11,56,23,89,100,67,34};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    
        }

        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
    
        }
System.out.println("span="+(max-min));
    }
    
}
