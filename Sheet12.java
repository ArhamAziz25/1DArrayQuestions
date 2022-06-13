public class Sheet12
{
    public static void main(String[] args) {
        int arr[]={1,10000,45,76,3000,0};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max is "+max);
        System.out.println("min is"+min);
    }
}