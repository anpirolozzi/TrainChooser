package trainchooser.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import trainchooser.ApplicationSession;
import trainchooser.Biglietto;
import trainchooser.BigliettoStampato;
import trainchooser.Settings;

import static trainchooser.ApplicationSession.*;


public class PreferenceDialogController {
    private Stage stage;
    @FXML
    private TextField vmaxText;
    @FXML
    private TextField pesoCoachText;
    @FXML
    private TextField reg2Text;
    @FXML
    private TextField ic2Text;
    @FXML
    private TextField ic1Text;
    @FXML
    private TextField fb2Text;
    @FXML
    private TextField fb1Text;
    @FXML
    private TextField fa2Text;
    @FXML
    private TextField fa1Text;
    @FXML
    private TextField frstandardText;
    @FXML
    private TextField frpremiumText;
    @FXML
    private TextField frbusinessText;
    @FXML
    private TextField frexecutiveText;
    @FXML
    private TextField itasmartText;
    @FXML
    private TextField itaxlText;
    @FXML
    private TextField itaclubText;
    @FXML
    private TextField itaprimaText;
    @FXML
    private TextField pesoSpeedText;
    @FXML
    private Button cancelButton;
    @FXML
    private void close(){stage.close();}
    @FXML
    private void save(){
        ApplicationSession.settings.speedmax=Double.parseDouble(vmaxText.getText());
        ApplicationSession.settings.pesoCoach=Integer.parseInt(pesoCoachText.getText());
        ApplicationSession.settings.pesoSpeed=Integer.parseInt(pesoSpeedText.getText());
        ApplicationSession.settings.coachQuality.put("Regionale (2 classe)", Double.valueOf(reg2Text.getText()));
        ApplicationSession.settings.coachQuality.put("Intercity (2 classe)", Double.valueOf(ic2Text.getText()));
        ApplicationSession.settings.coachQuality.put("Intercity (1 classe)", Double.valueOf(ic1Text.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciabianca (2 classe)", Double.valueOf(fb2Text.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciabianca (1 classe)", Double.valueOf(fb1Text.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciargento (2 classe)", Double.valueOf(fa2Text.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciargento (1 classe)", Double.valueOf(fa1Text.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciarossa (Standard)", Double.valueOf(frstandardText.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciarossa (Premium)", Double.valueOf(frpremiumText.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciarossa (Business)", Double.valueOf(frbusinessText.getText()));
        ApplicationSession.settings.coachQuality.put("Frecciarossa (Executive)", Double.valueOf(frexecutiveText.getText()));
        ApplicationSession.settings.coachQuality.put("Italo (Smart)", Double.valueOf(itasmartText.getText()));
        ApplicationSession.settings.coachQuality.put("Italo (eXtra Large)", Double.valueOf(itaxlText.getText()));
        ApplicationSession.settings.coachQuality.put("Italo (Club)", Double.valueOf(itaclubText.getText()));
        ApplicationSession.settings.coachQuality.put("Italo (Prima)", Double.valueOf(itaprimaText.getText()));
        stage.close();
    }

    public void init(){
        vmaxText.setText(String.valueOf(ApplicationSession.settings.speedmax));
        pesoCoachText.setText(String.valueOf(ApplicationSession.settings.pesoCoach));
        pesoSpeedText.setText(String.valueOf(ApplicationSession.settings.pesoSpeed));
        reg2Text.setText(String.valueOf(Settings.coachQuality.get("Regionale (2 classe)")));
        ic2Text.setText(String.valueOf(Settings.coachQuality.get("Intercity (2 classe)")));
        ic1Text.setText(String.valueOf(Settings.coachQuality.get("Intercity (1 classe)")));
        fb2Text.setText(String.valueOf(Settings.coachQuality.get("Frecciabianca (2 classe)")));
        fb1Text.setText(String.valueOf(Settings.coachQuality.get("Frecciabianca (1 classe)")));
        fa2Text.setText(String.valueOf(Settings.coachQuality.get("Frecciargento (2 classe)")));
        fa1Text.setText(String.valueOf(Settings.coachQuality.get("Frecciargento (1 classe)")));
        frstandardText.setText(String.valueOf(Settings.coachQuality.get("Frecciarossa (Standard)")));
        frpremiumText.setText(String.valueOf(Settings.coachQuality.get("Frecciarossa (Premium)")));
        frbusinessText.setText(String.valueOf(Settings.coachQuality.get("Frecciarossa (Business)")));
        frexecutiveText.setText(String.valueOf(Settings.coachQuality.get("Frecciarossa (Executive)")));
        itasmartText.setText(String.valueOf(Settings.coachQuality.get("Italo (Smart)")));
        itaxlText.setText(String.valueOf(Settings.coachQuality.get("Italo (eXtra Large)")));
        itaclubText.setText(String.valueOf(Settings.coachQuality.get("Italo (Club)")));
        itaprimaText.setText(String.valueOf(Settings.coachQuality.get("Italo (Prima)")));
    }

    /** Imposta lo {@code stage}.
     * @param stage  il nuovo {@code stage} */
    public void setStage(Stage stage) {this.stage = stage;}
}
