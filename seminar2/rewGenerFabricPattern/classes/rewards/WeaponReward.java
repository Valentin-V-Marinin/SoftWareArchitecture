package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class WeaponReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("You've gotten an additional WEAPON!");
    }
}
