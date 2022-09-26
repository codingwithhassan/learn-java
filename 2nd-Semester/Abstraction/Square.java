class Square extends Shape{
	private double length;

	public Square(){
		super();
		this.setLength(1.0);
	}//default constructor

	public Square(double length, String color){
		super(color);
		this.setLength(length);
	}//Overloaded constructor

	public void setLength(double length){
		this.length = length;
	}//setLength()

	public double getLength(){
		return this.length;
	}//getLength()

	public void draw(){
		System.out.println("Length: " + this.getLength());
		System.out.println("Color: " + this.getColor());		
	}//draw()

	public double calculateArea(){
		return Math.pow(this.getLength(), 2);
	}//calculateArea()

	public double calculatePerimeter(){
		return 4 * this.getLength();
	}//calculatePerimeter()
}//class