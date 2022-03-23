package OOPRefresh;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	
	public  Shape() {
		this.color = "Red";
		this.filled = false;
	};
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	};
	
	public String getColor() {
		return this.color;
	};
	
	public boolean isFilled() {
		return this.filled;
	};
	
	public void setColor(String color) {
		this.color = color;
	};
	
	public void setFilled(boolean filled) {
		this.filled = true;
	};
	
	abstract public double getArea();
	
	abstract public double getPerimeter();
	
	@Override
	abstract public String toString();
}
