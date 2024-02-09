package comandlinee;
public class StudentDetails {
	public static void main(String[] args) {
   long id=Integer.parseInt(args[0]);
   String name=args[1];
   String department=args[2];
   char gender=args[3].charAt(0);
   
   int age=Integer.parseInt(args[4]);
   float cgpa=Float.parseFloat(args[5]);
   System.out.println("id="+id);
   System.out.println("name="+name);
   System.out.println("department="+department);
   
   System.out.println("gender="+gender);

   System.out.println("age="+age);
   System.out.println("cgpa="+cgpa);
	}

}
