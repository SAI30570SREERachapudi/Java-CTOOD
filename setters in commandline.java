package Studentcommand;

public class StudentMain {
		public static void main(String[] args) {
			Student o=Student.getinstance();
			o.setName(args[0]);
			o.setId(Long.parseLong(args[1]));
			o.setBranch(args[2]);
			o.setGender(args[3].charAt(0));
			System.out.println(o);

		}

	}
