
public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int l=0;
        int h=arr.length-1;
        if(arr.length==1)
        {
            System.out.println(0);
        }
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(mid>0 && mid <arr.length-1)
            {
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1] )
                {
                    System.out.println(mid);
                    return;
                }

                else if(arr[mid]<arr[mid+1])
                {
                    l=mid+1;
                }
                else if(arr[mid]<arr[mid-1])
                {
                    h=mid-1;
                }
            }
            else if(mid==0)
            {
                if(arr[0]>arr[1])
                {

                    System.out.println(0);
                    return;
                }
                else{
                    System.out.println(1);
                    return;
                }

            }
            else if(mid==arr.length-1)
            {
                if(arr[arr.length-1]>arr[arr.length-2])
                {
                    System.out.println(arr.length-1);
                    return;
                }
                else
                {
                    System.out.println(arr.length-2);
                    return;
                }
            }
        }


                //THIS CODE IS NOT OPTIMISED//
        // int i=1;
        // while(i<arr.length-1)
        // {
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        //     {
        //         System.out.println(i);
        //         return;
        //     }
        //     else
        //     {
        //         i++;
        //     }

        // }
    }
    
}
