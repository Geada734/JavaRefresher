package OOPRefresh;

//Class created for basic OOP practice exercises.
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	};
	
	public int getId() {
		return this.id;
	};
	
	public String getFirstName() {
		return this.firstName;
	};
	
	public String getLastName() {
		return this.lastName;
	};
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	};
	
	public int getSalary() {
		return this.salary;
	};
	
	public int getAnnualSalary() {
		return this.salary * 12;
	};
	
	public void setSalary(int salary) {
		this.salary = salary;
	};
	
	public void raiseSalary(double perc) {
		this.salary = (int) Math.ceil(this.salary + (this.salary * (perc/100)));
	};
	
	@Override
	public String toString() {
		String s = "Name: " + this.firstName + " " + this.lastName + "\n"
				+ "Annual Salary: $" + this.getAnnualSalary() + ".00";
		
		return s;
	};
};
