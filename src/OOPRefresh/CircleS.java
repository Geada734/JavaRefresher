package OOPRefresh;

public class CircleS extends Shape {
	private double radius;

	public CircleS() {
		super();
		this.radius = 1.0;
	};
	
	public CircleS(Shape shape, double radius) {
		this.color = shape.getColor();
		this.filled = shape.isFilled();
	};
	
	public double getRadius() {
		return this.radius;
	};
	
	public void setRadius(double radius) {
		this.radius = radius;
	};
	
	@Override
	public double getArea() {
		double area = this.radius * this.radius * Math.PI;
		
		return area;
	};

	@Override
	public double getPerimeter() {
		double perimeter = this.radius * 2 * Math.PI;
		
		return perimeter;
	};

	@Override
	public String toString() {
		return "-Circle:\nColor: " + this.getColor() + "\nFilled: " + this.isFilled() + "\nRadius: "
				+ this.getRadius() + "\nArea: " + this.getArea() + "\nPerimeter: "+ this.getPerimeter();
	};

}
