package schoolFinance;

//class responsible for keeping track of salary, ID and name of teachres
public class Teacher {
	private int id;
	private String name;
	private Double salary;
	private Double salaryEarned;
	
	public Teacher(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary= salary;
		this.salaryEarned = (double)0;
	}
	
	
	//get methods
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public Double getSalary() {
		return salary;
	}
	//end of get methods
	
	
	//salary update
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(Double salary) {
		salaryEarned += salary;
		School.paySalary(salary);
	}
	
	@Override
	public String toString() {
		return "\nTeacher Name: "+name+"\nTotal Salary earned: $"+salaryEarned+"\nSalary: "+salary;
	}
}

