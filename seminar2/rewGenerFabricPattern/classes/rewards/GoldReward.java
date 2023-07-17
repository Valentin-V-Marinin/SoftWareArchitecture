package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class GoldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("You've gotten a sack of the GOLD!");
    }
}
