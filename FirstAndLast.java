public class FirstAndLast {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7,7,7,7,7,7,7,77,88,91,100};
        int l=0;
        int h=arr.length-1;
        int k=7;
        int FirstIndex=-1;
        int LastIndex=-1;

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(arr[mid]==k)
            {
                FirstIndex=mid;
                h=mid-1;;
            }

            if(k>arr[mid])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println(FirstIndex);

        l=0;
        h=arr.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if(arr[mid]==k)
            {
                LastIndex=mid;
                l=mid+1;
            }

            if(k>arr[mid])
            {
                l=mid+1;
            }
            else if(k<arr[mid]) {
                h=mid-1;
            }
        }
        System.out.println(LastIndex);

    }
    
}
