package OOPRefresh;

//Class created for OOP practice exercises on inheritance.
public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student() {
		super();
		this.program = "Unknown";
		this.year = 2000;
		this.fee = 0.0;
	};
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		this.year = 2000;
		this.fee = 0.0;
	};
	
	public String getProgram() {
		return this.program;
	};
	
	public int getYear() {
		return this.year;
	};
	
	public double getFee() {
		return this.fee;
	};
	
	public void setProgram(String program) {
		this.program = program;
	}; 
	
	public void setYear(int year) {
		this.year = year;
	};
	
	public void setFee(double fee) {
		this.fee = fee;
	};
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nProgram: "
				+ this.program + "\nYear: " + this.year + "\nFee: $" + this.fee;
	};
}
