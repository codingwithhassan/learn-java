public class FuelTank{
    private double litresFuel;
    private double maxFuelCapacity;

    public FuelTank(){
        litresFuel = 0.0;
        maxFuelCapacity = 33.5;
    }

    public FuelTank(double litresFuel, double maxFuelCapacity){
        this.litresFuel = litresFuel;
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public FuelTank(FuelTank tank){
        this.setLitresFuel(tank.getLitresFuel());
        this.setMaxFuelCapacity(tank.getMaxFuelCapacity());
    }

    public double getLitresFuel() {
        return litresFuel;
    }

    public void setLitresFuel(double litresFuel) {
        this.litresFuel = litresFuel;
    }

    public double getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public void setMaxFuelCapacity(double maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public void addFuel(double litres){
        double entered = this.getLitresFuel() + litres;
        if(entered <= this.getMaxFuelCapacity())
            this.setLitresFuel(entered);
        else
            System.out.printf(
                "You can't exceed the limit from %.2f\n",
                this.getMaxFuelCapacity()
            );
    }

    public void removeFuel(double litres){
        double remaining = this.getLitresFuel() - litres;
        if(remaining > 0){
            this.setLitresFuel(remaining);
        }else{
            System.out.printf("You can't remove %.2f litres fuel from %.2f\n",
                litres,
                this.getLitresFuel()
            );
        }
    }

    public boolean isEmpty(){
        return this.getLitresFuel() == 0;
    }

    public boolean isFull(){
        return this.getMaxFuelCapacity() == 0;
    }

    public void currentFuelLevel(){
        System.out.println("FuelTank [litresFuel=" + litresFuel + ", maxFuelCapacity=" + maxFuelCapacity + "]");
    }
}