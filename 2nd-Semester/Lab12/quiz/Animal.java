public class Animal {
    private String eats;
    private boolean vegeterian;
    private int noOfLegs;
    
    public Animal(){
        this.eats = null;
        this.vegeterian = false;
        this.noOfLegs = 0;
    }

    public Animal(String eats, boolean vegeterian, int noOfLegs) {
        this.eats = eats;
        this.vegeterian = vegeterian;
        this.noOfLegs = noOfLegs;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public String toString() {
        return "Animal [eats=" + eats + ", noOfLegs=" + noOfLegs + ", vegeterian=" + vegeterian + "]\n";
    }

    public void talk(){}
}
