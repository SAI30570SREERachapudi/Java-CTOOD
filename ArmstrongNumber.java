import java.util.Scanner;
public class Main{
boolean armstrong(int n){
int r,z,x=0;
z=n;
while(n>0){
r=n%10;
x=x+r*r*r;
n=n/10;
}
if(x==z)
return true;
else
return false;
}
public static void main(String args[]){
int y;
Main obj=new Main();
Scanner n=new Scanner(System.in);
y=n.nextInt();
boolean x;
x=obj.armstrong(y);
System.out.println(x);
}
}
