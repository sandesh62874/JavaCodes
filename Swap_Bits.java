/*Swap Bits*/

/*Given a number, swap the adjacent bits in the binary representation of the number, and print the new number formed after swapping.*/

/*Sample Input

4
10
7
43
100

Sample Output

5
11
23
152 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int l=0;l<t;l++)
      {
       int n=sc.nextInt();
       int i=0,ans=0;
       while(n>0)
       {
        int bit=n&3;
        if(bit==0||bit==3)
        {
         ans+=bit<<i;
        }
        else if(bit ==2)
        {
         ans+=1<<i;
        }
        else
        {
         ans+=2<<i;
        }
         n=n>>2;
         i=i+2;
       }
        System.out.println(ans);
      }
    }
}
