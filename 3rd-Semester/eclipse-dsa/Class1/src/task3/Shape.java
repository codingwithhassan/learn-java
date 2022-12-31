package task3;

public abstract class Shape {
	public String color;

	public Shape() {
		this.color = "black";
	}

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void draw();
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
}
