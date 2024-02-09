	package comandlinee;
	public class ArraySum {
	public static void main(String[] args) {
   	int a[]=new int[args.length];
		int i,x=0;
	for(i=0;i<args.length;i++) {
	a[i]=Integer.parseInt(args[i]);
	x=x+a[i];
	}
	System.out.println("sum iss"+x);
		}
	}
