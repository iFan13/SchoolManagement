package schoolFinance;

//class responsible for keeping track of student ID, Name, Grade, total fees & fees paid
public class Student {
	private int id;
	private String name;
	private int grade;
	private Double feePaid;
	private Double feeTotal = 30000.00; //assuming all students pay same total fee
	
	//create default student object
	public Student(int id, String name, int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.feePaid=(double) 0;
	}
	
	//update student grade
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	//update how much student has paid
	public void paidFee(Double payment) {
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
		return grade;
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
		return "\nStudent's Name: "+name+"\nTotal fees paid: $"+feePaid+"\nFees remaining: $"+remainingFee();
	}
}
