public class thirdlargest {
    public static void main(String[] args) {
        
        int arr[]=new int[]{23,56,12,89,101,99,11};
        int max=arr[0];
        int secmax=-1;
        int thrmax=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=max)
            {
                if(arr[j]>secmax)
                {
                    secmax=arr[j];
                }
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=secmax && arr[j]!=max)
            {
                if(arr[j]>thrmax)
                {
                    thrmax=arr[j];
                }
            }
        }
        System.out.println("Max element is:"+max);
        System.out.println("Second max is:"+secmax);
        System.out.println("Third max is:"+thrmax);
    }
}
