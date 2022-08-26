public class Engine {

    private float capacity;
    private int numberOfCylinders;

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
    
    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public Engine() {
    }

    public Engine(float capacity, int numberOfCylinders) {
        this.capacity = capacity;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Engine other = (Engine) obj;
        if (Float.floatToIntBits(capacity) != Float.floatToIntBits(other.capacity))
            return false;
        if (numberOfCylinders != other.numberOfCylinders)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Engine [capacity=" + capacity + ", numberOfCylinders=" + numberOfCylinders + "]";
    }    
}
