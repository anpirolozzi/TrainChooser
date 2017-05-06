package trainchooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import trainchooser.gui.controller.ApplicationController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.getIcons().add(new Image(getClass().getResource("/icon.png").toString()));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Application.fxml"));
        Scene scene=new Scene(loader.load());
        primaryStage.setTitle("TrainChooser");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        ApplicationController controller= loader.getController();
        controller.ticketTableView.setPlaceholder(new Label("Nessun biglietto inserito"));
        controller.ticketTableView.setItems(ApplicationSession.dbTicket);
        controller.init();
        controller.setStage(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
