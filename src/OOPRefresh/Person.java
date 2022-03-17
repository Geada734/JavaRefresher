package OOPRefresh;

//Class created for OOP practice exercises on inheritance.
public class Person {
	protected String name;
	protected String address;
	
	public Person() {
		this.name = "Unknown";
		this.address = "Unknown";
	};
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	};
	
	public String getName(){
		return this.name;
	};
		
	public String getAddress() {
		return this.address;
	};	
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setAddress(String address){
		this.address = address;
	};
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address;
	};
}
