#include<stdio.h>
void rotate(int[],int,int);
int main(){
int n,k,i,j;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++){
scanf("%d",&a[i]);
}
scanf("%d",&k);
rotate(a,n,k);
printf("[%d, ",a[0]);
for(j=1;j<n-1;j++){
printf("%d, ",a[j]);
}
printf("%d",a[n-1]);
return 0;
}
void rotate(int a[],int n,int k){
int x,y,c;
while(k--){
c=a[n-1];
for(x=n-1;x>0;x--){
a[x]=a[x-1];
}
a[0]=c;
}
