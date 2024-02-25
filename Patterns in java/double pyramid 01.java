package patternsinjava;

public class doublepyramid01 {
public static void main(String args[]) {
	int i,j,k,l=8,m;
	for(i=0; i<=4; i++)
	{
		for(j=0; j<=i; j++)
		{		
			if(j%2==0)
				System.out.print("0");
			else
				System.out.print("1");
		}
		for(k=1; k<=l; k++)
		{
			System.out.print(" ");
		}
			l = l-2;
		for(m=0; m<=i; m++)
		{
			if(m%2==0)
				System.out.print("0");
			else
				System.out.print("1");	
		}

		System.out.print("\n");
	}
}
}
