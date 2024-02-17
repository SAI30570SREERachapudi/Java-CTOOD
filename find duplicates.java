import java.util.*;
public class helloworld{
public static void main(String args[]){
int i,j,n;
System.out.println("Enter number of elements");
Scanner x=new Scanner(System.in);
n=x.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++){
a[i]=x.nextInt();
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i]==a[j]&&i!=j)
System.out.print(a[j]);
}}
}

}
