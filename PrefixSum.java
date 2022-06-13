import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60,70,80,90,100};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first index");
        int firstIndex=sc.nextInt();
        System.out.println("Enter second index");
        int SecIndex=sc.nextInt();
        int preFix[]=new int[arr.length];
        preFix[0]=arr[0];
        for(int i=1;i<preFix.length;i++)
        {
            preFix[i]=preFix[i-1]+arr[i];
        }

        if(firstIndex>0){
        System.out.println(preFix[SecIndex]-preFix[firstIndex-1]);}
        else{
            System.out.println(preFix[SecIndex]);
        }
    }
    
}
