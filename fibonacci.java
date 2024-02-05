import java.util.Scanner;
public class Main{
public void fibonacci(int n){
int a=0,b=1, sum=0;
System.out.print("[");
System.out.print(a);
System.out.print(", ");
System.out.print(b);
for(int i=0;sum<n;i++){
sum=a+b;
if(sum<n){
System.out.print(", ");
System.out.print(sum);
a=b;
b=sum;
}} System.out.print("]");
}
public static void main(String args[]){
int n;
Scanner x=new Scanner(System.in);
n=x.nextInt();
Main obj=new Main();
}
obj.fibonacci(n);
}
