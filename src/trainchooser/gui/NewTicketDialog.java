package trainchooser.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import trainchooser.gui.controller.NewTicketDialogController;

public class NewTicketDialog {
    private static Stage stage;
    private static Scene scene;
    private static NewTicketDialogController controller;

    public NewTicketDialog(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/NewTicketDialog.fxml"));
            scene=new Scene(loader.load());
            stage=new Stage();
            stage.setTitle("Aggiungi biglietto");
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            NewTicketDialogController controller = loader.getController();
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
    public NewTicketDialogController getController(){return controller;}
}
