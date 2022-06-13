public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,100,200,300,7,8,9,0,100,90};
        int sum=0;
        int k=3;
        int MaxTillNow=0;

        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        MaxTillNow=sum;

        for(int i=k;i<arr.length;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            if(sum>MaxTillNow)
            {
                MaxTillNow=sum;
            }
        }

        System.out.println(MaxTillNow);
    }
    
}
