package seminar2.rewGenerFabricPattern.classes.rewards;

import seminar2.rewGenerFabricPattern.classes.iGameItem;

public class KnowledgeReward  implements iGameItem {
    @Override
    public void open() {
        System.out.println("You've gotten a discount for GB's courses!");
    }
}
