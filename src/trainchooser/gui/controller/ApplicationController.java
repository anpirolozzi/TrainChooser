package trainchooser.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import trainchooser.BigliettoStampato;
import trainchooser.gui.CompareTicketDialog;
import trainchooser.gui.NewTicketDialog;
import trainchooser.gui.PreferenceDialog;

public class ApplicationController {
    private Stage stage;
    @FXML
    public Button newTicketButton;
    @FXML
    public TableView<BigliettoStampato> ticketTableView= new TableView<BigliettoStampato>();
    @FXML
    public TableColumn idColumn=new TableColumn("idTreno");
    @FXML
    public TableColumn classColumn=new TableColumn("Classe");
    @FXML
    public TableColumn fareColumn=new TableColumn("Tariffa");
    @FXML
    public TableColumn distanceColumn=new TableColumn("Distanza");
    @FXML
    public TableColumn timeColumn=new TableColumn("Durata");
    @FXML
    public TableColumn speedColumn=new TableColumn("Velocita");
    @FXML
    public TableColumn qualitySpeedColumn=new TableColumn("qualitySpeed");
    @FXML
    public TableColumn farekmColumn=new TableColumn("farekm");
    @FXML
    public TableColumn fareminuteColumn=new TableColumn("fareMinute");
    @FXML
    public TableColumn qualityCoachColumn=new TableColumn("QualityCoach");
    @FXML
    public TableColumn qualityColumn=new TableColumn("QualityColumn");
    @FXML
    public TableColumn qualitypriceColumn=new TableColumn("QualityPrice");
    @FXML
    private void showNewTicketDialog(){NewTicketDialog newTicketDialog = new NewTicketDialog();}
    @FXML
    private void showCompareTicketDialog(){CompareTicketDialog compareTicketDialog = new CompareTicketDialog();}
    @FXML
    private void showPreferenceDialog(){PreferenceDialog preferenceDialog= new PreferenceDialog();}
    public void init(){
        idColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("idTreno"));
        classColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("classe"));
        fareColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("costo"));
        distanceColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("distanza"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("tempoPercorrenza"));
        speedColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("speed"));
        qualitySpeedColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("qualitySpeed"));
        farekmColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("costoKm"));
        fareminuteColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("costoMinuto"));
        qualityCoachColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("qualityCoach"));
        qualityColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("quality"));
        qualitypriceColumn.setCellValueFactory(new PropertyValueFactory<BigliettoStampato, String>("qualityPrice"));
    }
    /** Imposta lo {@code stage}.
     * @param stage  il nuovo {@code stage} */
    public void setStage(Stage stage) {this.stage = stage;}
}
