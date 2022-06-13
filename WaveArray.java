public class WaveArray {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,7,8,9,10};
        int j=0;
        int k=1;
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[k];
            arr[k]=arr[j];
            arr[j]=temp;
            j+=2;
            k+=2;

        }

        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    
}
