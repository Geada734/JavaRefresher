package OOPRefresh;

//Class created for basic OOP practice exercises.
public class Account {
	public String id;
	public String name;
	public int balance;
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	};
	
	public String getId() {
		return this.id;
	};
	
	public String getName() {
		return this.name;
	};
	
	public int getBalance() {
		return this.balance;
	};
	
	public void credit(int c) {
		this.balance += c;
	};
	
	public void debit(int d) {
		if(this.balance-d<0) {
			System.out.println("Insufficient balance");
		}
		else {
			this.balance -= d;
		};
	};
	
	public void transferTo(Account acc, int quantity) {
		if(this.balance-quantity<0) {
			System.out.println("Insufficient balance");
		}
		else {
			acc.credit(quantity);
			this.debit(quantity);
		};
	};
	
	@Override
	public String toString() {
		String s = "Account No.: " + this.id + "\n" + "Name: " + this.name + "\n"
				+ "Balance: " + this.balance;
		return s;
	};
	
}
