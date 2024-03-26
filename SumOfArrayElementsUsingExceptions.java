package week7;
import java.util.Scanner;
class Average extends ArithmeticException{
	public Average(String s) {
		super(s);
	}
}
public class Inlab2week8 {
    public static void main(String[] args) {
       	Scanner sc=new Scanner(System.in);
       	System.out.println("Enter Number of Elements\n");
    int n=sc.nextInt();
    try {
	    if(n<=0) {
	    throw new Average("Cannot Calculate average of an empty Array\n");	
	    }
	    else {
	    	System.out.println("Enter Array Elements\n");
	    	int a[]=new int[n];
	    	int sum=0;
	    	float avg;
	    	for(int i=0;i<n;i++) {
	    		a[i]=sc.nextInt();
	    		sum+=a[i];
	    	}
	    	avg=(float)sum/n;
	    	System.out.println("Sum = "+sum);
	    	System.out.println("Average = "+avg);
	    }
	    }
    catch(ArithmeticException e){
    	System.out.println("HIII");
    	System.out.println(e);
    	
    }  
    }
}
