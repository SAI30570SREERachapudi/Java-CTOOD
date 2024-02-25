package patternsinjava;

public class pyramid01 {
public static void main(String args[]) {

	int i,j,k;
	
	for(i=0 ; i<=4 ; i++)
	{
		for(j=4 ; j>i ; j--)
			System.out.print(" ");

		for(k=0 ; k<=i; k++)
		{
			if(k%2==0)
				System.out.print("0");
			else
				System.out.print("1");
		}
		System.out.print("\n");
	}

}
}
