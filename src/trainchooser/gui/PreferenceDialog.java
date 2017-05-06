package trainchooser.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trainchooser.gui.controller.PreferenceDialogController;

public class PreferenceDialog {
    private static Stage stage;
    private static Scene scene;
    private static PreferenceDialogController controller;

    public PreferenceDialog(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/PreferenceDialog.fxml"));
            scene=new Scene(loader.load());
            stage=new Stage();
            stage.setTitle("Preferenze");
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            PreferenceDialogController controller = loader.getController();
            controller.setStage(stage);
            controller.init();
            stage.showAndWait();
        }
        catch (Exception e) {e.printStackTrace();}
    }
    /** Ritorna lo {@code stage}.
     * @return lo {@code stage}*/
    public Stage getStage(){return stage;}
    /** Ritorna il controller collegato alla view inglobata.
     * @return il {@code controller}*/
    public PreferenceDialogController getController(){return controller;}
}
