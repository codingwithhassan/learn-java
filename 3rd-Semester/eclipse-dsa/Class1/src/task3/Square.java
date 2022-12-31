package task3;

public class Square extends Shape{
	private double length;

	public Square() {
		this.length = 0;
	}
	
	public Square(double length, String color) {
		super(color);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Square [length=" + length + ", color=" + color + ", getColor()=" + getColor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public double calculateArea() {
		return this.getLength() * 2;
	}

	@Override
	public double calculatePerimeter() {
		return this.calculateArea() * 3;
	}
	
	
}
