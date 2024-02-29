public class Student {
private long id;
 private String name;
 private char gender;
 private String branch;
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public char getGender() {
return gender;
}
public void setGender(char gender) {
this.gender = gender;
}
public String getBranch() {
return branch;
}
public void setBranch(String branch) {
this.branch = branch;
}
public String toString() {
 return "Student" +"\n"+
 "id=" + id +"\n"+
 " name='" + name + "\n" +
 " gender=" + gender +"\n"+
 " branch='" + branch + "\n" ;
 
}
}
StudentDemo.java
import java.util.*;
public class StudentDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Student s1=new Student();
Student s2=new Student();
System.out.println("enter student details");
System.out.println("enter student id");
s1.setId(sc.nextLong());
System.out.println("enter student name");
s1.setName(sc.next());
System.out.println("enter student gender");
s1.setGender(sc.next().charAt(0));
System.out.println("enter student branch");
s1.setBranch(sc.next());
System.out.println("enter student 2 details");
System.out.println("enter student id");
s2.setId(sc.nextLong());
System.out.println("enter student name");
s2.setName(sc.next());
System.out.println("enter student gender");
s2.setGender(sc.next().charAt(0));
System.out.println("enter student branch");
s2.setBranch(sc.next());
System.out.println(" student one details");
System.out.println(s1.toString());
System.out.println(" student two details");
System.out.println(s2.toString());
}
