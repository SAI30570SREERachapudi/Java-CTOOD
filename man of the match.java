import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,y=0;
		Scanner x=new Scanner(System.in);
		t=x.nextInt();
		while(t>0){
		    int a[]=new int[22];
		    int b[]=new int[22];
		    int max=0,sum;
		  for(int i=0;i<22;i++){
		      sum=0;
		      a[i]=x.nextInt();
		      b[i]=x.nextInt();
		      sum=a[i]+20*b[i];
		      if(sum>max){
		      max=sum;
		       y=i;
		      }
		  }  
		 	   System.out.println(y+1);
	    t--;
		}
	}
}
