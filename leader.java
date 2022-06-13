public class leader {

    void lead(int arr[])
    {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        int arr[]=new int[]{16, 17, 4, 3, 5, 2};
        leader ld=new leader();
        ld.lead(arr);
       
    }
}
