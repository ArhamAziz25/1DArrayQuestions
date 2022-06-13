public class RotateArray {

/*
 * DEVIDE ARRAY IN TWO PARTS
 * 2ND ARRAY WHILL BE FROM END TO KTH FROM END eg: [1,2,3,4,5,6,7]---> HERE 2ND ARRAY WILL BE FROM END TO 5th if k=3
 * REMAINING ARRAY WILL BE FIRST ARRAY
 * REVERSE 1ST ARRAY
 * REVERSE SECOND ARRAY
 * THEN AT LAST REVERSE FULL ARRAY
 */
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int k=3;
        RotateArray tr=new RotateArray();
        tr.rotate(arr, k);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
       



                //OR
    //     for(int x=0;x<3;x++)
    //     {
    //     int temp=arr[arr.length-1];
    //     for(int i=arr.length-1;i>0;i--)
    //     {
    //         arr[i]=arr[i-1];
    //     }
    //     arr[0]=temp;

    // }

    // for (int i : arr) {
        
    //     System.out.print(i+" ");
    // }
    }

    void rotate(int arr[],int k)
    {
        k=k%arr.length;
       reverse(arr,arr.length-k, arr.length-1);
       reverse(arr,0,arr.length-k-1);
       reverse(arr, 0, arr.length-1);

    }


    void reverse(int arr[],int i,int j)
    {
        int le=i;
        int ri=j;
        while(le<ri)
        {
            int temp=arr[ri];
            arr[ri]=arr[le];
            arr[le]=temp;
            le++;
            ri--;
        }

        
    }
    
}
