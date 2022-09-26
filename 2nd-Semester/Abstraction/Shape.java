abstract class Shape{
	private String color;

	public Shape(){		
		this.setColor("Blue");
	}//default constructor

	public Shape(String color){
		this.setColor(color);
	}//overloaded constructor

	public void setColor(String color){
		this.color = color;
	}//setColor()

	public String getColor(){
		return this.color;
	}//getColor()

	public abstract void draw();	

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

}//class