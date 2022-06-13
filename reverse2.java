public class reverse2 {
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,4,3,5,2};
        
     int xi=arr.length-1;
      int end=arr.length-1;
      int start=0;
        int count=arr.length;
 for(int j=0;j<=xi;j++)
 {
        for(int i=start;i<xi;i++)
        {
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            
            

        }
        xi--;
       
    }
    
    
        for(int ip=0;ip<arr.length;ip++)
            {
            System.out.print(arr[ip]+" ");
            }
    }

}
