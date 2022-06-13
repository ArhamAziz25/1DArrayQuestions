public class TwoArraySum {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,9};
        int arr2[]=new int[]{9,2,3,9};
        int arr3[]=new int[arr1.length > arr2.length ? arr1.length:arr2.length ];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
        int carry=0;
        while(i>=0 || j>=0)
        {
            int digitSum=carry;

            if(i>=0)
            {
                digitSum+=arr1[i];
            }

            if(j>=0)
            {
                digitSum=digitSum+arr2[j];
            }
            carry=digitSum/10;
            digitSum=digitSum%10;
            arr3[k]=digitSum;
            i--;
            j--;
            k--;

        }

        if(carry!=0)
        {
            {
                System.out.print(carry+" ");
            }
        for (int h : arr3) {
            
            System.out.print(h+" ");
        }
    }
    }
    
}
