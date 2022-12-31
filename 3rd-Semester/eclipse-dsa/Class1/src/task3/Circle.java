package task3;

public class Circle extends Shape {
	private double x;
	private double y;
	private double radius;

	public Circle() {
		super();
	}

	public Circle(String color, double x, double y, double radius) {
		super(color);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle [x=" + x + ", y=" + y + ", radius=" + radius + ", color=" + color + "]");
	}
	
	@Override
	public double calculateArea() {
		return this.getX() * this.getY() * this.getRadius();
	}

	@Override
	public double calculatePerimeter() {
		return this.calculateArea() * 3;
	}
	
	
}
