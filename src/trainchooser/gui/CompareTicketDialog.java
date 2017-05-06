package trainchooser.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trainchooser.gui.controller.CompareTicketDialogController;

public class CompareTicketDialog {
    private static Stage stage;
    private static Scene scene;
    private static CompareTicketDialogController controller;

    public CompareTicketDialog(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/CompareTicketDialog.fxml"));
            scene=new Scene(loader.load());
            stage=new Stage();
            stage.setTitle("Compara biglietti");
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            CompareTicketDialogController controller = loader.getController();
            controller.init();
            controller.setStage(stage);
            stage.showAndWait();
        }
        catch (Exception e) {e.printStackTrace();}
    }
    /** Ritorna lo {@code stage}.
     * @return lo {@code stage}*/
    public Stage getStage(){return stage;}
    /** Ritorna il controller collegato alla view inglobata.
     * @return il {@code controller}*/
    public CompareTicketDialogController getController(){return controller;}
}
