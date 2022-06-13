public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
       
        int l=0;
        int h=arr.length-1;
        int mid=0;
        int k=17;
        

        while(l<=h)
        {
        mid=(l+h)/2;
        if(arr[mid]==k)
        {
            System.out.println("fount at"+" "+mid);
            return;
        }
        
        if(k>arr[mid])
        {
            l=mid+1;
        }
        else if(k<arr[mid])
        {
            h=mid-1;
        }
    
    }
}
    
}
