package sort;
public class Utility {
	public static  void sort(int[] a ){
		     int n=a.length;
		     int i,j,c;
		   for(i=0;i<n;i++){
		       for(j=0;j<n-i-1;j++){
		           if(a[j]>a[j+1]){
		               c=a[j];
		               a[j]=a[j+1];
		               a[j+1]=c;
		           }}}
		}
public static  int small(int[] a ){
		int i;
		int min=a[0];
		  for(i=0;i<a.length;i++){
		if(min>a[i]){
			min=a[i];
		}
		  }
		return min;
	}
 public static	int largest(int[] a){
	 int i;
		int max=a[0];
		  for(i=0;i<a.length;i++){
		if(max<a[i]) {
			max=a[i];
			}
		}
		return max;
	}
}
