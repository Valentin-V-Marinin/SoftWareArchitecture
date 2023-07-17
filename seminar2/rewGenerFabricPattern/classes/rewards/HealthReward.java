package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class HealthReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("You've gotten 50% increase of your HEALTH!");
    }
}
