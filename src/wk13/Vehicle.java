package wk13;

public abstract class Vehicle implements License{
    private int numWheels;
    private String motorType = "v1";
    private double speed;
    private boolean engineRunning;
    private String licenceType;
    boolean isValidLicense;


    public Vehicle(String motorType, int numWheels, String licenseType){
    }
    @Override
    public String getLicenceType() {
        return licenceType;
    }
    public void getLicenseType(String licenceType){
        this.licenceType = licenceType;
    }

    @Override
    public boolean isLicenseSuspended(){
        return isValidLicense;
    }

    public abstract void moving(String direction);
    public void turnOn(){
        engineRunning = true;
    }
    public void turnOff(){
        engineRunning = false;
    }
    public boolean isEngineRunning() {
        return engineRunning;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
       if(numWheels > 2 || numWheels > 4)
        throw new IllegalArgumentException("number of wheels between 2 and 4");
       this.numWheels = numWheels;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public double getSpeed() {
       if(speed > 0)
           throw new IllegalArgumentException("speed cannot be negative");
       return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }
}