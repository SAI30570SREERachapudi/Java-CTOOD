import java.util.Scanner;
public class Main{
void ispalindrome (char[] s){
int i,j,k,x,y,lengths;
lengths=s.length;
char[] b=new char[lengths];
for(j=0;j<lengths;j++){
b[j]=s[j];
}
x=0;
y=lengths-1;
while(x<y){
char c=s[x];
s[x]=s[y];
s[y]=c;
x++;
y--;
}
for(k=0;k<lengths;k++){
if(s[k]!=b[k]){
System.out.println("Not a Palindrome");
return;
}
}
System.out.println("Palindrome");
}
public static void main(String args[]){
String s;
Scanner x=new Scanner(System.in);
s=x.nextLine();
x.close();
char[] v=s.toCharArray();
  Main obj=new Main();
  obj.isPalindrome(v);
