package schoolFinance;

import java.util.Scanner;

//class responsible for keeping track of student ID, Name, Grade, total fees & fees paid
public class Student {
	private String studentID;
	private String name;
	private int gradeYr;
	private String courses = "";
	private static Double costOfCourse = 600.00;
	private static int id = 1000; 
	
	private Double feePaid;
	private Double feeTotal=0.00;
	
	
	//create student object
	public Student() {
			Scanner in = new Scanner(System.in);
			System.out.print("\nEnter student's name: ");
			this.name= in.nextLine();
			
			System.out.print("Enter student class level:\n1 for Freshman\n2 for Sophmore\n3 for Junior\n4 for Senior\n");
			setGrade(in.nextInt());
				
			setStudentID();
				
			this.feePaid=(double) 0;
	}
	
	//Generate ID 
	private void setStudentID() {
		id++;
		this.studentID= gradeYr+""+id;
	}
	
	//update student grade
	public void setGrade(int grade) {
		this.gradeYr=grade;
	}
	
	//Enroll in courses
	public void enroll() {
		//
	do {	
		System.out.println("Enter course to entroll (Q to stop enrolling in classes): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.toUpperCase().equals("Q")) {
			courses = courses+"\n"+course;
			feeTotal = feeTotal + costOfCourse;
		}
		else {break;}
	} while (1!= 0);
		System.out.println("Enrolled in:"+ courses);
		System.out.println("Tuition balance: "+ feeTotal+"\n");
	}
	
	//update how much student has paid
	public void paidFee() {
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
			Double payment = in.nextDouble();
			feePaid += payment;
			School.updateFeesPaid(payment);
		
	}
	
	//get methods for student
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return gradeYr;
	}
	
	public Double feePaid() {
		return feePaid;
	}
	
	public Double feeTotal() {
		return feeTotal;
	}
	
	public Double remainingFee() {
		return feeTotal-feePaid;
	}
	
	@Override
	public String toString() {
		return "\nStudent's Name: "+name+"\nTotal fees paid: $"+feePaid+"\nFees remaining: $"+remainingFee()+"\n\n";
	}
}
