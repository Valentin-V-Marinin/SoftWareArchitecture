package seminar3;

import java.awt.*;

public abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private String bodyType;
    private int wheelsNumber;
    private eFuelType fuelType;
    private String transmission;
    private double engineCapacity;

    /**
     * constructor of abstract class "Car"
     * @param brand             brand of the car
     * @param model             model of the car
     * @param color             color of the car
     * @param bodyType          type of the car body
     * @param wheelsNumber      number wheels of the car
     * @param fuelType          kind of fuel needed to the car
     * @param transmission      type of transmission of the car
     * @param engineCapacity    engine capacity of the car except electrocar
     */
    public Car(String brand, String model, Color color, String bodyType, int wheelsNumber, eFuelType fuelType, String transmission, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelsNumber = wheelsNumber;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
    }

    protected void startMove(){
        System.out.println("The CAR is start moving.");
    };

    protected void carMaintain(){
        System.out.println("The CAR is under maintenance.");
    }

    protected void gearShifting(){
        System.out.println("Shifting the CAR gear.");
    }

    protected void turnLightsOn(){
        System.out.println("Turning on the CAR lights.");
    }

    protected void turnWipersOn(){
        System.out.println("Turning on the CAR wipers.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public eFuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(eFuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
