public class FrequencyOfSumInSubArray {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,5,4,0,4,4,1};
        int sum=0;
        int k=3;
        int count=0;
        int target=9;

        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }

        if(sum==target)
        {
            count++;
        }

        for(int i=k;i<arr.length;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            if(sum==target)
            {
                count++;
            }
        }

        System.out.print(count);
    }
    
}
