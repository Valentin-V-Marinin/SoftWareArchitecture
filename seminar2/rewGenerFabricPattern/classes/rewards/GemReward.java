package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class GemReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("You've gotten a box of GEMS!");
    }
}
