public class searchFrequencyInSubarray {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 2, 1, 1, 1, 2 };
        int k = 3;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 2) {
                count++;
            }

        }
        System.out.println(" In window of 1: " + count);

        int flag = 0;

        int j = k + 1;
        for (int i = j - k; i < arr.length; i++) {
            
        }

    }

}
