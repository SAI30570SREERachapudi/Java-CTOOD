package practice;
public class CommandLineArray {
public static void main(String args[]) {
	int sum=0;
	for(String i:args) {
		System.out.print(i);
		sum+=Integer.parseInt(i);
	}
	System.out.println(sum);
}
}
