public class Car {
    
    private String modelName;
    private String licenseNumber;
    private int yearOfPurchase;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public Car() {
        this.modelName = null;
        this.licenseNumber = null;
        this.yearOfPurchase = 0;
    }

    public Car(String modelName, String licenseNumber, int yearOfPurchase) {
        this.modelName = modelName;
        this.licenseNumber = licenseNumber;
        this.yearOfPurchase = yearOfPurchase;
    }

    public Car(String modelName, String licenseNumber) {
        this.modelName = modelName;
        this.licenseNumber = licenseNumber;
        this.yearOfPurchase = 0;
    }

    public void copy(Car car) {
        this.setModelName(car.getModelName());
        this.setLicenseNumber(car.getLicenseNumber());
        this.setYearOfPurchase(car.getYearOfPurchase());
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
