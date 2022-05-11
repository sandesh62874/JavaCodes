/*Spiral Traversal of Matrix*/

/*Given a 2D square matrix, print the matrix in a spiral order. Refer examples for more details. 
 After you scan the matrix in a 2D array, try to print the matrix in a spiral order.*/

/*Sample Input
5
-44 25 -52 69 -5 
17 22 51 27 -44 
-79 28 -78 1 -47 
65 -77 -14 -21 -6 
-96 43 -21 -20 90 
  Sample output
-44 25 -52 69 -5 -44 -47 -6 90 -20 -21 43 -96 65 -79 17 22 51 27 1 -21 -14 -77 28 -78 */
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
         int i,j;
         int a[][]=new int[n][n];
         for(i=0;i<n;i++)
         {
          for(j=0;j<n;j++)
          {
           a[i][j]=sc.nextInt();
          }
         }
         int minrow=0,minclmn=0;
         int maxrow=n-1,maxclmn=n-1;
         int c=0;
         while(c<n*n)
         {
          for(i=minrow,j=minclmn;j<=maxclmn&&c<n*n;j++)
          {
           System.out.print(a[i][j]+" ");
           c++;
          }
          minrow++;
          for(i=minrow,j=maxclmn;i<=maxrow&&c<n*n;i++)
          {
           System.out.print(a[i][j]+" ");
           c++;
          }
          maxclmn--;
          for(i=maxrow,j=maxclmn;j>=minclmn&&c<n*n;j--)
          {
           System.out.print(a[i][j]+" ");
            c++;
          }
          maxrow--;
          for(i=maxrow,j=minclmn;i>=minrow&&c<n*n;i--)
          {
           System.out.print(a[i][j]+" ");
            c++;
          }
           minclmn++;
           
         }
          System.out.println();
        }
    }
  }
