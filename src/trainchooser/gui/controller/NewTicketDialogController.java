package trainchooser.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import trainchooser.ApplicationSession;
import trainchooser.Biglietto;
import trainchooser.BigliettoStampato;
import trainchooser.Settings;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static trainchooser.ApplicationSession.*;


public class NewTicketDialogController {
    private Stage stage;
    @FXML
    private TextField idText;
    @FXML
    private TextField distanceText;
    @FXML
    private TextField timeText;
    @FXML
    private TextField fareText;
    @FXML
    private Button cancelButton;
    @FXML
    private Button addButton;
    @FXML
    private ComboBox classCombo;
    @FXML
    private void close(){stage.close();}
    @FXML
    private void addTicket(){
        Biglietto biglietto=new Biglietto();
        Biglietto.idTreno =idText.getText();
        Biglietto.classe = classCombo.getValue().toString();
        Biglietto.costo =Double.parseDouble(fareText.getText());
        Biglietto.distanza =Double.parseDouble(distanceText.getText());
        Biglietto.tempoPercorrenza =Double.parseDouble(timeText.getText());
        Biglietto.speed = Biglietto.distanza /(Biglietto.tempoPercorrenza /60);
        Biglietto.qualitySpeed =(Biglietto.speed / Settings.speedmax)*10;
        Biglietto.costoKm =(Biglietto.costo / Biglietto.distanza);
        Biglietto.costoMinuto = Biglietto.costo / Biglietto.tempoPercorrenza;
        Biglietto.qualityCoach = Settings.coachQuality.get(Biglietto.classe);
        listaBiglietti.add(biglietto);
        textCompute();
        dbTicket.add(new BigliettoStampato(Biglietto.idTreno, Biglietto.classe, Biglietto.costo, Biglietto.distanza, Biglietto.tempoPercorrenza, Biglietto.speed, Biglietto.qualitySpeed, Biglietto.costoKm, Biglietto.costoMinuto, Biglietto.qualityCoach, Biglietto.quality, Biglietto.qualityPrice));
        close();
    }
    public void init(){
        Set<String>stringSet=new HashSet<>();
        stringSet=ApplicationSession.settings.coachQuality.keySet();
        classCombo.getItems().addAll(stringSet);
    }

    /** Imposta lo {@code stage}.
     * @param stage  il nuovo {@code stage} */
    public void setStage(Stage stage) {this.stage = stage;}
}
