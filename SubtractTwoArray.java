import java.io.*;

import java.util.*;

public class SubtractTwoArray {

  public static void main(String[] args) throws Exception {
  
    Scanner scn = new Scanner(System.in);
    int a1[]=new int[]{5,5,5};

    int a2[]=new int[]{1,2,3,4};

  

    int diff[] = new int[a2.length];
    int c = 0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while (k >= 0) {
      int d = 0;
      int a1v = (i >= 0 ? a1[i] : 0);
      if (a2[j] + c >= a1v) {
        d = a2[j] + c - a1v;
        c = 0;
      } else {
        d = a2[j] + 10 + c - a1v;
        c = -1;
      }

      diff[k] = d;
      i--;
      j--;
      k--;
    }

    int idx = 0;
    while (idx < diff.length && diff[idx] == 0) {
      idx++;
    }

    while (idx < diff.length) {
      System.out.print(diff[idx++]+" ");

    }
  }
}