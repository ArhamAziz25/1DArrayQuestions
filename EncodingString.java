public class EncodingString {
    // ENCODE THE STRING FOR eg:-
// string ----> "gghbj";
//output should be ----> "g2h1b1j1";

    public static void main(String[] args) {
        String str = "aaaabbbccccdd";
        String str1 = "";
        for (int i = 0; i < str.length() - 1; i++) // iterate full string
        {
            str1 = str1 + str.charAt(i); // add every element comes
            int count = 1; // After addition count will be one
            while (i + 1 < (str.length()) && str.charAt(i) == str.charAt(i + 1)) // We check that character at i ==
                                                                                 // character at i+1 or not with
                                                                                 // condition that i+1 should be <
                                                                                 // str.length
            {
                count++;  // if true increase count and i
                i++;
            }
            str1 = str1 + count; // now just concatenate count in str1;
        }
        System.out.println(str1);
    }

}


