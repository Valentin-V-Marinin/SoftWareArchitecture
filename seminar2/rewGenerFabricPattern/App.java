package seminar2.rewGenerFabricPattern;

import seminar2.rewGenerFabricPattern.classes.ItemFabric;
import seminar2.rewGenerFabricPattern.classes.rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        final int NUMBER_REWARDINGS = 20;
        final int NUMBER_REWARD_KIND = 7;

        Random rnd = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new HealthGenerator());
        fabricList.add(new WeaponGenerator());
        fabricList.add(new KnowledgeGenerator());
        fabricList.add(new MagicPowerGenerator());
        fabricList.add(new ShieldGenerator());

        int index = 0;
        for (int i = 0; i < NUMBER_REWARDINGS; i++) {
            index = rnd.nextInt(0,NUMBER_REWARD_KIND);
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
