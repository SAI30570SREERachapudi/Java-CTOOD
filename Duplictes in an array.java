import java.util.Scanner;
public class Main{
public static void main(String args[]){
int n,i,j;
Scanner x=new Scanner(System.in);
n=x.nextInt();
int[] a=new int[n];
int[] c=new int[100];
for(i=0;i<n;i++){
a[i]=x.nextInt();
}
int k=0;
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){ if(a[i]==a[j]){
c[k]=a[i];
k++; } }
}
for(i=0;i<k;i++){
for(j=0;j<k-i-1;j++){
if(c[j]>c[j+1]){
int r=c[j];
c[j]=c[j+1]; c[j+1]=r;
}
}}
  if(c[0]!=0){
System.out.print("[");
for(i=0;i<k-1;i++){
System.out.print(c[i]); System.out.print(", ");
}
System.out.print(c(k-1]);
System.out.print("]");
}
else System.out.print("[]");
}
}
