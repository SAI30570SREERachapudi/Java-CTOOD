package arrays;
import java.util.Scanner;
public class ArrayOfObjects {
    public static void main(String args[]) {  
        //create an array of students object   
        Students[] obj = new Students[5];  
        //create & initialize actual Section27 objects
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Students(); // Create a new instance of Students
            System.out.println("Enter student ID and name:");
            obj[i].id = s.nextInt();
            s.nextLine(); // Consume newline character
            obj[i].name = s.nextLine();
        }
        //display the students object data 
        System.out.println("Student Object information");
        for (int i = 0; i < obj.length; i++) {  
            obj[i].display();  
        }
    }  
}  

//Student class with student Id and student name as attributes  
class Students {  
    int id;  
    String name;  
    public void display() {  
        System.out.println("Student Id = " + id + " student Name = " + name);  
    }  
}  
