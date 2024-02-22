public class UpperPyramid {
	public static void main(String args[]) {
		int x=4,k;
		for(int i=1;i<=5;i++) {
			for(k=1;k<=x;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			x--;
			System.out.print("\n");
		}
}}

/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5
  */
