public class preMax {
    public static void main(String[] args) {
        int arr[]=new int[]{90,10,20,100,11,200,20,300,500};
        int preMaxArray[]=new int[arr.length];
        int max=arr[0];
        for(int i=0;i<preMaxArray.length;i++)
        {
            max=Math.max(arr[i],max);
            preMaxArray[i]=max;
        }

        for (int i : preMaxArray) {
            System.out.print(i+" ");
            
        }
    }
    
}
