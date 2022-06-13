public class BoyerMoore {

    //WE HAVE TO FIND MAJORITY ELEMENT , MEANS ELEMENT WHICH IS OCCURING MORE THAN N/2 TIMES
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,2,2,3,3,3,3,2,2,2,2,2,2,23,3,2,2};
        int count=0;
        int MajorElement=0; 
        int MinLength=arr.length/2;

        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                MajorElement=arr[i];
            }

            if(arr[i]==MajorElement)
            {
                count++;
            }
            else{
                count--;
            }
        }

        
        count=0;
        for (int i : arr) {
            if(i==MajorElement)
            {
                count++;
            }
        }
        System.out.println(count>MinLength ? "Found, Element is:"+MajorElement : "Not found");

    }
    
}
