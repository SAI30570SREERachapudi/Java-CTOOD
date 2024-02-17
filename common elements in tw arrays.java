import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner y=new Scanner(System.in);
    int n,i,j;
    n=y.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(i=0;i<n;i++){
      a[i]=y.nextInt();
    }
    for(i=0;i<n;i++){
      b[i]=y.nextInt();
    }
    for(i=0;i<a.length;i++){
       for(j=0;j<b.length;j++){
     if(a[i]==b[j]){
     System.out.print("Commin Element is: "+a[i]);
     }
    }}
  }}
