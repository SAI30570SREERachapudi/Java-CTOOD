package patternsinjava;
public class Double_Number_pyramid {
public static void main(String args[]) {
	int i,j,k,l,m=8,n=1;
	for(i=1; i<=5; i++)
	{
		for(j=1; j<=i; j++)
		{ System.out.print(j); }            
		for(k=m; k>=1; k--)            
		{ System.out.print(" "); }
			m = m-2;
		for(l=n; l>=1; l--)		{
			System.out.print(l);
        }
  		n = n+1;
	    System.out.print("\n");            
       } } }
