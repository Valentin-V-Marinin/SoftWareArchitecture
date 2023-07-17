package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class ShieldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("You've gotten a SHIELD!");
    }
}
