public class reverse {
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,4,3,5,2};
        int i=0;
        int j=arr.length-1;
        
        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }


        for(int ip=0;ip<arr.length;ip++)
        {
        System.out.print(arr[ip]+" ");
        }

    }
    
}
