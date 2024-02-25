package patternsinjava;

public class Number_Half_Pyramid {
public static void main(String args[]) {
	int i,j,k,l=1;
	for(i=1; i<=5; i++)
	{
		for(j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		
		for(k=1; k<=l; k++)
		{ 
			System.out.print(k);
		}            
			l = l+2;    
			System.out.print("\n");
	}
}
}
