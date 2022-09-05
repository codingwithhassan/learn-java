public class Engine {
    private int engineSize;
    private String engineType;
    private boolean engineRunning;
    private int topSpeed;

    public Engine(){
        this.engineSize = 0;
        this.engineType = "None";
        this.engineRunning = false;
        this.topSpeed = 0;
    }

    public Engine(int engineSize, String engineType, boolean engineRunning, int topSpeed){
        this.engineSize = engineSize;
        this.engineType = engineType;
        this.engineRunning = engineRunning;
        this.topSpeed = topSpeed;
    }

    public Engine(Engine engine){
        this.setEngineSize(engine.getEngineSize());
        this.setEngineType(engine.getEngineType());
        this.setEngineRunning(engine.isEngineRunning());
    }

    public int getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public boolean isEngineRunning() {
        return engineRunning;
    }
    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean startEngine(){
        this.setEngineRunning(true);
        return this.isEngineRunning();
    }

    public boolean stopEngine(){
        this.setEngineRunning(false);
        return this.isEngineRunning();
    }

    public void currentEngineState() {
        System.out.println("Engine [engineRunning=" + engineRunning + ", engineSize=" + engineSize + ", engineType=" + engineType
                + ", topSpeed=" + topSpeed + "]");
    }
    
}
