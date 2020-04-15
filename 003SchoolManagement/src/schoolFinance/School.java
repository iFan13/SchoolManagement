package schoolFinance;

import java.util.List;

public class School {
	private List<Teacher> teachers; //rather than create list ie: teacher1, teacher2, teacher3, use arraylist
	private List<Student> students;
	private static double totalFeesReceived;
	private static double totalSalaryPaid;
	private static double totalTreasury = 5000;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers= teachers;
		this.students=students;
		totalFeesReceived= (double) 0;
		totalSalaryPaid = (double) 0;
	}
	
	//returns full list of teachers
	public List<Teacher> getTeachers(){
		return teachers;
	}
	
	//add teacher to school
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	//returns full list of students
	public List<Student> getStudents(){
		return students;
	}
	
	//add student to school
	public void addStudents(Student student) {
		students.add(student);
	}
	
	//get total fees received
	public Double getTotalFeesReceived() {
		return totalFeesReceived;
	}
	
	//adds paid fees to treasury
	public static void updateFeesPaid(Double feesPaid) {
		totalFeesReceived += feesPaid;
		totalTreasury += feesPaid;
	}
	
	//get total of salaries paid
	public Double getTotalSalaryPaid() {
		return totalSalaryPaid;
	}
	
	//subtract salaries from treasury
	public static void paySalary(Double Salary) {
		totalTreasury -= Salary;
	}
	

	//get treasuries
	public Double getTreasury() {
		return totalTreasury;
	}

}
