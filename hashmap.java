package mid2;

import java.util.*;

class Worker{
	private int id;
	private String name;
	Worker(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+name;
	}
}
public class HashMapMain {
public static void main(String args[]) {
	HashMap<Integer,Worker> obj=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter no.of Workers");
	int n=sc.nextInt();
	int i=1;
	while(i<=n) {
		System.out.println("Enter details of WOrker with key "+i);
		int key=sc.nextInt();
	
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		obj.put(key,new Worker(id,name));
		i++;
	}
	
		System.out.println(obj);
	
}
}
