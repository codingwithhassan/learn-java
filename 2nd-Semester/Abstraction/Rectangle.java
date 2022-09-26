class Rectangle extends Square{
	private double width;

	public Rectangle(){
		super();
		this.setWidth(1.0);
	}//default constructor

	public Rectangle(double width, double length, String color){
		super(length, color);
		this.setWidth(width);
	}//Overloaded constructor

	public void setWidth(double width){
		this.width = width;
	}//setWidth()

	public double getWidth(){
		return this.width;
	}//getWidth()

	public void draw(){
		System.out.println("Width: " + this.getWidth());
		super.draw();
	}//draw()

	public double calculateArea(){
		return super.getLength() * this.getWidth();
	}//calculateArea()

	public double calculatePerimeter(){
		return 2 * (super.getLength() + this.getWidth());
	}//calculatePerimeter()
}//class