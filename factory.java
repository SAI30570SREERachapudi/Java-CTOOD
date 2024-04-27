package mid2;
class errorhandle extends IllegalArgumentException {
	public errorhandle(String S) {
		super(S);
	}
}
interface Polygon {
public  String getType();
}
class Triangle implements Polygon{
public String getType() {
return "Triangle";
}
}
class Square implements Polygon {
public String getType() {
return "Square";
}
}
class Pentagon implements Polygon {
public String getType() {
return "Pentagon";
}
}
class FactoryPolygon {
public static Polygon getInstance(int sides) {
Polygon p=null;
switch (sides) {
case 3: 
p=new Triangle();
break;
case 4:
p=new Square();
break;
case 5:
p=new Pentagon();
break;
default:
throw new IllegalArgumentException("Unexpected value: " + sides);
}
return p;
}
}
public class factoryMain {
public static void main(String[] args) {
Polygon p1= FactoryPolygon.getInstance(3);
System.out.println(p1.getType());
Polygon p2= FactoryPolygon.getInstance(4);
System.out.println(p2.getType());
Polygon p3= FactoryPolygon.getInstance(5);
System.out.println(p3.getType());

}
}
