package One;
//
//
//1.	Modularize to class level the following task and draw the class diagram. 
//Develop a static method distance () in class Geometry which accepts x1, y1, x2
//and y2 representing the coordinates of two points of type double and then returns 
//the distance between them and call the method from main () in Demo class. Assume 4 
//inputs from command line. (Hint: Distance = ((x2-x1) ^2 – (y2-y1) ^2) ^1/2).

public class Demo {
public static void main(String args[]) {
	double x1=Double.parseDouble(args[0]);
	double x2=Double.parseDouble(args[1]);
	double y1=Double.parseDouble(args[2]);
	double y2=Double.parseDouble(args[3]);
	System.out.println(Geometry.distance(x1,x2,y1,y2));
}
}
