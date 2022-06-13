public class Zigzagg {

    //OUTPUT SHOULD BE:- [3<7>4<8>2<6>1]      [a<b>c<d>e<f>g]       check for greater than and less than seperately
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,7,8,2,6,1};

        boolean x=true;

        for(int i=0;i<arr.length-1;i++)
        {
            if(x)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;

                }

            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            x=!x;

        }

        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    
}
