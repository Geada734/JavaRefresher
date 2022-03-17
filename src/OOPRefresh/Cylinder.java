package OOPRefresh;

//Class created for OOP practice exercises on inheritance.
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(Circle circle, double height) {
		this.radius = circle.getRadius();
		this.color = circle.getColor();
		this.height = height;
	};
	
	public Cylinder(double radius, String color, double height) {
		this.radius = radius;
		this.color = color;
		this.height = height;
	};
	
	public Cylinder() {
		super();
		this.height = 1.0;
	};
	
	public double getHeight() {
		return this.height;
	};
	
	public void setHeight(double height) {
		this.height = height;
	};
	
	public double getVolume(){
		return this.height * this.getArea();
	};
	
	@Override
	public String toString() {
		return this.color + " Cylinder[" + this.radius + ", " + this.height + "]";
	};
};
