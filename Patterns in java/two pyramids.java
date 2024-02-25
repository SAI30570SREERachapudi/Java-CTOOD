package patternsinjava;
public class twopyramids {
	public static void main(String args[]) {
	int i,j,space=0,MAX=5;
	for(i=MAX;i>0;i--)
	{
		for(j=0;j< i;j++)
		{
			System.out.print("*");
		}
		for(j=0;j< space;j++)
		{
			System.out.print(" ");
		}
		/*print second set of stars*/
		for(j=0;j< i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		space+=2;
	}
}}
