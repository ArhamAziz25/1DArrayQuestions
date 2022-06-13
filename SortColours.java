public class SortColours {

    void rev(int arr[],int l,int h)
    {
        int temp=arr[h];
        arr[h]=arr[l];
        arr[l]=temp;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,0,2,2,2,2,1,1,1,0};
        SortColours st=new SortColours();
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                    st.rev(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    st.rev(arr, mid, high);
                    high--;
                    break;
                    
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
            
        }



                    //OR//
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             int temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // for (int i : arr) {
        //     System.out.print(i+" ");
            
        // }
            
        }

    }
    
