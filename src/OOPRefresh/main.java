package OOPRefresh;

//OOP exercises, from basic to polymorphism.

public class main {

	public static void main(String[] args) {
		// Basic exercises
	    System.out.println("******************************");
		Circle circle = new Circle();
		
		System.out.println("-Default circle structure:");
		System.out.println(circle);
		System.out.println("-Radius:");
	    System.out.println(circle.getRadius());
		System.out.println("-Color:");
	    System.out.println(circle.getColor());
		System.out.println("-Area:");
	    System.out.println(circle.getArea());
		System.out.println("-Circumference:");
	    System.out.println(circle.getCircumference());
	    
	    circle.setColor("Blue");
	    circle.setRadius(2.0);
	    
	    System.out.println("-Modified values:");
	    System.out.println(circle.getRadius());
	    System.out.println(circle.getColor());
	    System.out.println("******************************");
		
	    Employee employee = new Employee(123, "Paco", "Gerte", 18000);
	    
	    System.out.println(employee);
	    System.out.println("\n");
	    System.out.println("Wow, he's got a raise!");
	    System.out.println("\n");
	    employee.raiseSalary(12);
	    System.out.println(employee);
	    System.out.println("******************************");
	    
	    Account acc1 = new Account("123", "Paco Gerte", 800);
	    Account acc2 = new Account("456", "David Garrote", 400);
	    
	    System.out.println(acc1);
	    System.out.println("\n");
	    System.out.println(acc2);
	    
	    acc1.transferTo((acc2), 400);
	    
	    System.out.println(acc1);
	    System.out.println("\n");
	    System.out.println(acc2);
	    System.out.println("******************************");
	    
	    // Inheritance exercises
	    Cylinder cylinder = new Cylinder(circle, 3.0);
	    
	    System.out.println(cylinder.getArea());
	    System.out.println(cylinder.getVolume());
	    System.out.println(cylinder);
	    System.out.println("******************************");
	}

}
