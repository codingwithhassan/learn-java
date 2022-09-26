public class Circle extends Shape{
    private double x;
    private double y;
    private double radius;

    public Circle(){
        super();
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double x, double y, double radius, String color) {
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
    
    public void draw() {
        System.out.println(
            "Color: " + super.getColor() + "\nX: " + this.getX() + "\nY: " + this.getY() + "\nRadius: " + this.getRadius()
        );
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.sqrt(this.getRadius());
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.getRadius() * 2;
    }    
    
}
