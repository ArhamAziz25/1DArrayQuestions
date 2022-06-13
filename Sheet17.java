public class Sheet17 {
    public static void main(String[] args) {
        int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int pivot=0;
        int left=0;
        int right=arr.length-1;
        int target=10;

        Sheet17 sc=new Sheet17();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                pivot=i;
            }
        }
        int result=sc.binarySearch(arr, left, pivot-1, target); 
        int x =sc.binarySearch(arr, pivot, right, target); 
        System.out.println(result);
    }

     int binarySearch(int arr[],int le,int re,int t)
    {
        //{5, 6, 7, 8, 9, 10, 1, 2, 3};
       
        while(le<=re)
        {
            int l=le;
            int r=re;
            int mid=(l+(r-l))/2;  
            if(arr[mid]==t)
            {
              return mid;
            }
            
            if(arr[mid]<t)
            {
                l=mid+1;
            }else if(arr[mid]>t)
            {
                r=mid-1;
            }
        }
        
        return -1;
    }
    
}
