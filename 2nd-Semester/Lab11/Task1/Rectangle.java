public class Rectangle extends Square{

    private double width;
    
    public Rectangle(){
        super();
        this.width = 0.0;
    }

    public Rectangle(double length, double width, String color){
        super(length,color);
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public void draw() {
        System.out.println(
            "Color: " + super.getColor() + "\nLength: " + super.getLength() + "\nWidth: " + this.getWidth()
        );
    }

    @Override
    public double calculateArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.getLength() * super.getLength());
    }  
}
