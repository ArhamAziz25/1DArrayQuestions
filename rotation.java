import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        for(int x=0;x<k;x++)
        {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }

    for (int i : arr) {
        
        System.out.print(i+" ");
    }
    }
    
}
