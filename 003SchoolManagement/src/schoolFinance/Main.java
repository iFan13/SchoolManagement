package schoolFinance;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Teacher amy = new Teacher( 1,  "Amy", (double) 5000);
		Teacher ben = new Teacher( 2,  "Benjamin", (double) 4500);
		Teacher cori = new Teacher (3, "Coriander", (double)4570);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(amy);
		teacherList.add(ben);
		teacherList.add(cori);

		Student dale = new Student (1, "Dale", 3);
		Student emmy = new Student (2, "Emily", 2);
		Student fred = new Student (3, "Fred", 4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(dale);
		studentList.add(emmy);
		studentList.add(fred);
		
		School schoolName = new School(teacherList, studentList);

		System.out.println("School treasury has $"+schoolName.getTreasury());
		dale.paidFee((double) 12000);
		System.out.println("School treasury has $"+schoolName.getTreasury());
		amy.receiveSalary(amy.getSalary());
		System.out.println("School treasury has $"+schoolName.getTreasury());
		
		System.out.println(dale);
		System.out.println(amy);
	}

}
