package OOPRefresh;

//Class created for OOP practice exercises on polymorphism.
public class RectangleS extends Shape{
	private double width;
	private double height;
	
	public RectangleS() {
		super();
		this.width = 1.0;
		this.height = 1.0;
	};
	
	public RectangleS(Shape shape, double width, double height) {
		this.color = shape.getColor();
		this.filled = shape.isFilled();
		this.width = width;
		this.height = height;
	};
	
	public double getWidth() {
		return this.width;
	};
	
	public double getHeight() {
		return this.height;
	};
	
	public void setWidth(double width) {
		this.width = width;
	};
	
	public void setHeight(double height) {
		this.height = height;
	};
	
	@Override
	public double getArea() {
		double area = this.width * this.height;
		
		return area;
	};

	@Override
	public double getPerimeter() {
		double perimeter = (2*height) + (2*width);
		
		return perimeter;
	};

	@Override
	public String toString() {
		return "-Rectangle:\nColor: " + this.getColor() + "\nFilled: " + this.isFilled() + "\nWidth: "
				+ this.getWidth() + "\nHeight: "+ this.getHeight() + "\nArea: " + this.getArea() + "\nPerimeter: "+ this.getPerimeter();
	};

}
