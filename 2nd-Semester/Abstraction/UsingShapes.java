class UsingShapes{
	public static void main(String[] args){
		Circle circle1 = new Circle();
		System.out.println("Displaying state of circle #1");
		circle1.draw();
		System.out.println("\nArea of circle #1: " + circle1.calculateArea());
		System.out.println("Perimeter of circle #1: " + circle1.calculatePerimeter());

		Circle circle2 = new Circle(2.5, 2.8, 2.9, "Green");
		System.out.println("\nDisplaying state of circle #2");
		circle2.draw();
		System.out.println("\nArea of circle #2: " + circle2.calculateArea());
		System.out.println("Perimeter of circle #2: " + circle2.calculatePerimeter());

		Square square1 = new Square();
		System.out.println("\nDisplaying state of square #1");
		square1.draw();
		System.out.println("\nArea of square #1: " + square1.calculateArea());
		System.out.println("Perimeter of square #1: " + square1.calculatePerimeter());

		Square square2 = new Square(4.5, "Pink");
		System.out.println("\nDisplaying state of square #2");
		square2.draw();
		System.out.println("\nArea of square #2: " + square2.calculateArea());
		System.out.println("Perimeter of square #2: " + square2.calculatePerimeter());

		Rectangle rectangle1 = new Rectangle();
		System.out.println("\nDisplaying state of rectangle #1");
		rectangle1.draw();
		System.out.println("\nArea of rectangle #1: " + rectangle1.calculateArea());
		System.out.println("\nPerimeter of rectangle #1: " + rectangle1.calculatePerimeter());		

		Rectangle rectangle2 = new Rectangle(1.5, 1.6, "Purple");
		System.out.println("\nDisplaying state of rectangle #2");
		rectangle2.draw();
		System.out.println("\nArea of rectangle #2: " + rectangle2.calculateArea());
		System.out.println("Perimeter of rectangle #2: " + rectangle2.calculatePerimeter());		
	
		System.out.println("Changing the states of circle2, square2 and rectangle2...");
		circle2.setX(3.0);
		circle2.setY(3.1);
		circle2.setRadius(3.3);
		circle2.setColor("Purple");
		square2.setLength(5.0);
		square2.setColor("Pink");
		rectangle2.setWidth(1.8);
		rectangle2.setLength(1.9);

		System.out.println("\nDisplaying the states of circle2, square2 and rectangle2 again.");
		System.out.println("State of circle2.");
		circle2.draw();
		System.out.println("\nState of square2.");
		square2.draw();
		System.out.println("\nState of rectangle2.");
		rectangle2.draw();
	}//main
}//class