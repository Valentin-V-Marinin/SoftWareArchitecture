package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class MagicPowerReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Congrats! You're a MAGIC of the computer science now!");
    }
}
