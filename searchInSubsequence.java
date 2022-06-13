public class searchInSubsequence {

    //find out that string 2 is subsequence of string 1 or not
    public static void main(String[] args) {
        String st1="abcd";
        String st2="cd";

        int i=0;
        int j=0;

        while(i<st1.length())
        {
            if(st1.charAt(i)==st2.charAt(j)) // extract one character from string 1 and one from dtring 2 andcompare both
            {
                // Increment of both if they are equal
                i++;   
                j++;

            }else{
                //increment of only i if both aren't equal
                i++;
            }
        }
        System.out.println(j==st2.length()?"Yes":"No");
    }
    
}
