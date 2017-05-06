package trainchooser.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import trainchooser.ApplicationSession;
import trainchooser.BigliettoStampato;


public class CompareTicketDialogController {
    private Stage stage;
    @FXML
    private TextField idText;
    @FXML
    private ComboBox ticketComparingCombo;
    @FXML
    private ComboBox ticketComparerCombo;
    @FXML
    private Text rapportoVelB2B1Text;
    @FXML
    private Text costoB1aB2Text;
    @FXML
    private Text carrozzaB2aB1;

    @FXML
    private void close(){stage.close();}

    @FXML
    private void compare(){
        String v1=ticketComparerCombo.getValue().toString();
        String v2=ticketComparingCombo.getValue().toString();
        String[]s1=v1.split(" -> ");
        String[]s2=v2.split(" -> ");
        BigliettoStampato b1=new BigliettoStampato("","",0,0,0,0,0,0,0,0,0,0);
        BigliettoStampato b2= new BigliettoStampato("","",0,0,0,0,0,0,0,0,0,0);
        for(BigliettoStampato b: ApplicationSession.dbTicket){
            if(b.getIdTreno().toString().matches(s1[0])){
                if(b.getClasse().toString().equals(s1[1])){
                    b1=b;
                }
            }
            if(b.getIdTreno().toString().matches(s2[0])){
                if(b.getClasse().toString().equals(s2[1])){
                    b2=b;
                }
            }
        }

        rapportoVelB2B1Text.setText(String.valueOf(ApplicationSession.compareRapportoVelB2B1(b1,b2)));
        costoB1aB2Text.setText(String.valueOf(ApplicationSession.compareCostob1ab2(b1,b2)));
        carrozzaB2aB1.setText(String.valueOf(ApplicationSession.compareCarrozzab2b1(b1,b2)));
    }

    public void init(){
        for(BigliettoStampato b: ApplicationSession.dbTicket){
            ticketComparerCombo.getItems().add(b.getIdTreno()+" -> "+b.getClasse());
            ticketComparingCombo.getItems().add(b.getIdTreno()+" -> "+b.getClasse());
        }
    }

    /** Imposta lo {@code stage}.
     * @param stage  il nuovo {@code stage} */
    public void setStage(Stage stage) {this.stage = stage;}
}
