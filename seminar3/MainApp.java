package seminar3;

import java.awt.*;

public class MainApp {
    public static void main(String[] args) {

        // создаём объекты подкласса OffRoadCar, наследника абстрактного класса Car
        OffRoadCar car1 = new OffRoadCar("Toyota","RAV4", Color.RED, "OffRoad", 4,
                eFuelType.DIESEL,"AUTO",2231, new FuelStation(eFuelType.DIESEL),200);
        OffRoadCar car2 = new OffRoadCar("Nissan","Patrol", Color.DARK_GRAY, "OffRoad", 4,
                eFuelType.PETROL,"HAND",2962, new FuelStation(eFuelType.PETROL),275);
        // заправляем обе машины
        car1.refuel();
        car2.refuel();
    }
}
