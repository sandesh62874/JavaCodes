/*Ciel and Receipt*/

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