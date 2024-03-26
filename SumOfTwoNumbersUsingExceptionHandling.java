package week7;
import java.util.Scanner;
class Sum extends Exception{
	public Sum(String s) {
	super(s);
	}
}
public class Skill1week8 {
	public static void main(String args[]) {
String x,y;
int a=0,b=0;
float c=0.0f,d=0.0f;

Scanner sc=new Scanner(System.in);
try {
	System.out.println("Enter First Number");
	x=sc.nextLine();
	int count=0,dec=0;
	for(int i=0;i<x.length();i++) {
		if(x.charAt(i)>=48&&x.charAt(i)<=57)
		{
			count++;
		}
		if(x.charAt(i)=='.') {
			dec++;
		}
	}
	if(count==x.length()) {
		a=Integer.parseInt(x);
	}
	else if(dec==1&&count+dec==x.length()) {
		c=Float.parseFloat(x);
	}
	else {
		throw new Sum("Input you are trying to give is neither integer nor float");
	}
	System.out.println("Enter second Number");
	y=sc.nextLine();
	count=0;
	dec=0;
	for(int i=0;i<y.length();i++) {
		if(y.charAt(i)>=48&&y.charAt(i)<=57)
		{
			count++;
		}
		if(y.charAt(i)=='.') {
			dec++;
		}
	}
	if(count==y.length()) {
		b=Integer.parseInt(y);
	}
	else if(dec==1&&count+dec==y.length()) {
		d=Float.parseFloat(y);
	}
	else {
		throw new Sum("Input you are trying to give is neither integer nor float");
	}
	System.out.println(a+b+c+d);
	}
catch(Exception e) {
	System.out.println(e);
}	}
}
