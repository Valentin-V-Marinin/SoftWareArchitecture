package seminar3;

import java.awt.*;

public class OffRoadCar extends Car implements iFuelStation{

    public iFuelStation ifs;
    private int clearance;

    public OffRoadCar(String brand, String model, Color color, String bodyType, int wheelsNumber, eFuelType fuelType, String transmission, double engineCapacity, iFuelStation ifs, int clearance) {
        super(brand, model, color, bodyType, wheelsNumber, fuelType, transmission, engineCapacity);
        this.ifs = ifs;
        this.clearance = clearance;
    }

    /**
     * Realisation of abstract class "Car"
     * @param brand             brand of the car
     * @param model             model of the car
     * @param color             color of the car
     * @param bodyType          type of the car body
     * @param wheelsNumber      number wheels of the car
     * @param fuelType          kind of fuel needed to the car
     * @param transmission      type of transmission of the car
     * @param engineCapacity    engine capacity of the car except electrocar
     * @param clearance         gap between ground and bottom car's body, mm
     */

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    @Override
    public void refuel() {
        ifs.refuel();
    }

    /**
     * Implementation iFuelStation interface,
     * refuel a car method
     */
//    @Override
//    public void refuel() {
//        switch (getFuelType()) {
//            case GAS -> {
//                System.out.println("Refuel the car(" + getBrand() + " " + getModel() + ") with GAS.");
//            }
//            case PETROL -> {
//                System.out.println("Refuel the car(" + getBrand() + " " + getModel() + ") with PETROL.");
//            }
//            case DIESEL -> {
//                System.out.println("Refuel the car(" + getBrand() + " " + getModel() + ") with DIESEL.");
//            }
//            case KEROSENE -> {
//                System.out.println("Refuel the car(" + getBrand() + " " + getModel() + ") with KEROSENE.");
//            }
//            case ELECTRICITY -> {
//                System.out.println("Refuel the car(" + getBrand() + " " + getModel() + ") with ELECTRICITY.");
//            }
//        }
//    }

}
