package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.ItemFabric;
import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class WeaponGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new WeaponReward();
    }
}
