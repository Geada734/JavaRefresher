package OOPRefresh;

//Class created for OOP practice exercises on inheritance.
public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff() {
		super();
		this.pay = 0.0;
		this.school = "Unknown";
	};
	
	public Staff(Person person, double pay, String school) {
		this.name = person.getName();
		this.address = person.getAddress();
		this.pay = pay;
		this.school = school;
	};
	
	public Staff(String name, String address, double pay, String school) {
		super(name, address);
		this.pay = pay;
		this.school = school;
	};
	
	public String getSchool() {
		return this.school;
	};
	
	public double getPay() {
		return this.pay;
	};
	
	public void setSchool (String school) {
		this.school = school;
	};
	
	public void setPay (double pay) {
		this.pay = pay;
	};
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nPay: $" + 
				this.pay + "\nSchool: " + this.school;
	};
}
