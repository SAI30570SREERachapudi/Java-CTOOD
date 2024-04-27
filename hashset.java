package mid2;

import java.util.*;

class Employee{
	private int id;
	private float salary;
	Employee(int id,float salary){
		this.id=id;
		this.salary=salary;
	}
	public String toString() {
		return "Id = "+id+" salary = "+salary+"\n";
	}
}
public class HashSetMain {
public static void main(String args[]) {
	HashSet<Employee> obj=new HashSet<>();
	Scanner x=new Scanner(System.in);
	System.out.println("Enter Number of employees");
	int i=1,id,n;
	n=x.nextInt();
	float salary;
	while(i<=n) {
		System.out.println("Enter details of EMployee "+i);
		id=x.nextInt();
		salary=x.nextFloat();
		obj.add(new Employee(id,salary));
		i++;
	}
	for(Employee y:obj) {
		System.out.println(y);
	}
	
}
}
