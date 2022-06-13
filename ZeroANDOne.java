public class ZeroANDOne {
    public static void main(String[] args) {
        int arr[]=new int[]{1,0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1 ,0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0};

        int k=arr.length-1;
        int j=0;
        while(j<k)
        {
            while(arr[j]==0)
            {
                j++;
            }
            while(arr[k]==1)
            {
                k--;
            }
            if(arr[j]>arr[k])
            {
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j++;
                k--;
            
            }
            

        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    
}
