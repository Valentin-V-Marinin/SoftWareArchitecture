package seminar2.rewGenerFabricPattern.classes;

public abstract class ItemFabric {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
