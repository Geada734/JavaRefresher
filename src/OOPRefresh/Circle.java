package OOPRefresh;

// Class created for basic OOP practice exercises.
public class Circle {
	protected double radius;
	protected String color;
	
	public Circle() {
		this.color = "Red";
		this.radius = 1.0;
	};
	
	public Circle(double radius, String color) {
		this.color =  color;
		this.radius = radius;
	};
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	};
	
	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	};
	
	public String getColor() {
		return this.color;
	};
	
	public double getRadius() {
		return this.radius;
	};
	
	public void setColor(String color) {
		this.color = color;
	};
	
	public void setRadius(double radius) {
		this.radius = radius;
	};
	
	@Override
	public String toString() {
		return this.color + " Circle[" + this.radius + "]";
	};
}
