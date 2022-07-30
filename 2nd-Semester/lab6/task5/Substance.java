public class Substance {
    private int temperature;

    public Substance(){}

    public Substance(int temperature){
        this.temperature = temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public boolean isEthylFreezing() {
        return temperature <= -173;
    }

    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }

    public boolean isOxygenBoiling() {
        return temperature >= -306;
    }

    public boolean isWaterFreezing() {
        return temperature <= 32;
    }

    public boolean isWaterBoiling() {
        return temperature >= 212;
    }

    public void showReport(){
        System.out.printf(
            "\nEthyl Freezing: %s\nEthyl Boiling: %s\nOxygen Freezing: %s\nOxygen Boiling: %s\nWater Freezing: %s\nWater Boiling: %s\n",
            isEthylFreezing() ? "Yes" : "No",
            isEthylBoiling() ? "Yes" : "No",
            isOxygenFreezing() ? "Yes" : "No",
            isOxygenBoiling() ? "Yes" : "No",
            isWaterFreezing() ? "Yes" : "No",
            isWaterBoiling() ? "Yes" : "No"
        );
    }
}
