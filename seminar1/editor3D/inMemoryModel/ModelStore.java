package seminar1.editor3D.inMemoryModel;

import seminar1.editor3D.modelElements.Camera;
import seminar1.editor3D.modelElements.Flash;
import seminar1.editor3D.modelElements.PoligonalModel;
import seminar1.editor3D.modelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scene;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangedObserver[] changedObservers;

    public ModelStore(iModelChangedObserver[] changedObservers) throws Exception {
        this.changedObservers = changedObservers;

        models = new ArrayList<>();
        scene = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scene.add(new Scene(0, models, flashes, cameras));
    }


    @Override
    public void notifyChange(iModelChanger sender) {

    }

    public Scene getScena(int id){
        for (int i = 0; i < scene.size(); i++) {
            if (scene.get(i).id == id) {
                return scene.get(i);
            }
        }
        return null;
    }
}
