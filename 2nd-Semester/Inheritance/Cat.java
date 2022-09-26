public class Cat extends Pet{

    private String furColor;
    private String whiskerColor;
	private double furLength;
    private int toeNumber;

	public Cat(){
		super();
		this.setFurColor("blue");
		this.setWhiskerColor("gray");
		this.setFurLength(1.2);
		this.setToeNumber(18);
	}//default constructor

    public Cat(String furColor, String whiskerColor, double furLength, int toeNumber) {
        super();
        this.setFurColor(furColor);
        this.setWhiskerColor(whiskerColor);
        this.setFurLength(furLength);
        this.setToeNumber(toeNumber);
	}//four-argument overloaded constructor

    public Cat(String furColor, String whiskerColor, double furLength, int toeNumber,
    			String eyeColor, double age, double weight, String location) {
    	super(eyeColor, age, weight, location);
    	this.setFurColor(furColor);
        this.setWhiskerColor(whiskerColor);
        this.setFurLength(furLength);
        this.setToeNumber(toeNumber);
	}//eight-argument overloaded constructor

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }//setFurColor

    public void setWhiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
    }//setWhiskerColor

    public void setFurLength(double furLength) {
        this.furLength = furLength;
    }//setFurLength

    public void setToeNumber(int toeNumber) {
        this.toeNumber = toeNumber;
    }//setToeNumber

    public String getFurColor() {
        return this.furColor;
    }//getFurColor

    public String getWhiskerColor() {
        return this.whiskerColor;
    }//getWhiskerColor

    public double getFurLength() {
        return this.furLength;
    }//getFurLength

    public int getToeNumber() {
        return this.toeNumber;
    }//getToeNumber

	public void display(){
		System.out.println("Fur color: " + this.getFurLength());
		System.out.println("Whisker color: " + this.getWhiskerColor());
		System.out.println("Fur length: " + this.getFurLength());
		System.out.println("Toe number: " + this.getToeNumber());
		super.display();
	}//display()

	public void purr(int soundLevel){
		System.out.println("The cat is making sound of level " + soundLevel + ".");
	}//purr

    public void meow(){
        System.out.println("The cat meowed.");
    }//purr

	public void eat(String foodType){
		System.out.println("The cat eats " + foodType + ".");
	}//eat

}//class