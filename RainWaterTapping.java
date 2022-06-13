public class RainWaterTapping {
    public static void main(String[] args) {
        int arr[]={7,4,0,9};
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max=Math.max(arr[i], max);
            leftMax[i]=max;

        }
        int rmax=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            rmax=Math.max(arr[i], rmax);
            rightMax[i]=rmax;
        }

        int waterunit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.min(leftMax[i], rightMax[i])> arr[i]){
            waterunit+=Math.min(leftMax[i], rightMax[i])-arr[i];}
        }
        System.out.println(waterunit);
       

    }
    
}
