#include<stdio.h>
#include<string.h>
int main(){
char a[100];
int i,j,k;
scanf("%[^\n]s",a);
int l=strlen(a); 
for(i=0;a[i]!= '\0';i++){
for(j=i+1;j<1;j++){
if(a[i]==a[j]){
for(k=j;k<1;k++){
a[k]=a[k+1];
}
1--;
j--;
}
}
}
printf("%s",a);
}
