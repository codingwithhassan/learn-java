class Circle extends Shape {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        super();
        this.setX(1.1);
        this.setY(1.2);
        this.setRadius(1.4);
    }// default constructor

    public Circle(double x, double y, double radius, String color) {
        super(color);
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }// overloaded constructor

    public void setX(double x) {
        this.x = x;
    }// setX

    public void setY(double y) {
        this.y = y;
    }// setY

    public void setRadius(double radius) {
        this.radius = radius;
    }// setRadius

    public double getX() {
        return this.x;
    }// getX

    public double getY() {
        return this.y;
    }// getY

    public double getRadius() {
        return this.radius;
    }// getRadius

    public void draw() {
        System.out.println("X: " + this.getX());
        System.out.println("Y: " + this.getY());
        System.out.println("Radius: " + this.getRadius());
        System.out.println("Color: " + super.getColor());
    }// draw()

    public double calculateArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }// calculateArea()

    public double calculatePerimeter() {
        return 2 * Math.PI * this.getRadius();
    }// calculatePerimeter()

}// class