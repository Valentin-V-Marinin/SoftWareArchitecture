package seminar3;

public class FuelStation  implements iFuelStation
{
    private eFuelType fuelType;

    public FuelStation(eFuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void refuel() {
        switch (getFuelType()) {
            case GAS -> {
                System.out.println("Refuel the car with GAS.");
            }
            case PETROL -> {
                System.out.println("Refuel the car with PETROL.");
            }
            case DIESEL -> {
                System.out.println("Refuel the car with DIESEL.");
            }
            case KEROSENE -> {
                System.out.println("Refuel the car with KEROSENE.");
            }
            case ELECTRICITY -> {
                System.out.println("Refuel the car with ELECTRICITY.");
            }
        }
    }

    public eFuelType getFuelType() {
        return fuelType;
    }
}
