/*Ciel and Receipt*/

/*Tomya is a girl. She loves Chef Ciel very much.
Tomya like a positive integer p, and now she wants to get a receipt of Ciel's restaurant whose total price is exactly p.
The current menus of Ciel's restaurant are shown.*/

/* Sample Input 1 
4
10
256
255
4096
Sample Output 1 
2
1
8
2 */


import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int k,i,m;
	    for(k=0;k<t;k++)
	    {
	     int n=sc.nextInt();
	     int c=0;
	     for(i=11;i>=0;i--)
	     { 
	      // while(n/2>=2048)
	       while(n-2048>=2048)
	       {
	        n=n-2048;
	        c++;
	       }
	       if(n>=Math.pow(2,i))
	       {
	        n=n-(int)Math.pow(2,i);
	        c++;
	       }
	   
	     }
	     System.out.println(c);
	   }
		// your code goes here
	}
}
