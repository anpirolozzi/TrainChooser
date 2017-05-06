package trainchooser;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ApplicationSession {
    public static Settings settings=new Settings();
    public static List<Biglietto> listaBiglietti=new ArrayList<>();
    public static ObservableList<BigliettoStampato> dbTicket = FXCollections.observableArrayList();

    //Calcola la percentuale di velocita di b2 rispetto a b1
    public static double compareRapportoVelB2B1(BigliettoStampato b1, BigliettoStampato b2){return ((Double.parseDouble(b2.getSpeed())/Double.parseDouble(b1.getSpeed()))*100);}
    //Calcola quanto costerebbe b1 se viaggiasse alla stessa velocità di b2
    public static double compareCostob1ab2(BigliettoStampato b1, BigliettoStampato b2){return (Double.parseDouble(b1.getCosto())*Double.parseDouble(b2.getSpeed())/Double.parseDouble(b1.getSpeed()));}
    //Rapporto del costo carrozza di b2 rispetto a b1
    public static double compareCarrozzab2b1(BigliettoStampato b1, BigliettoStampato b2){
        double costoVelocitaB1toB2=compareCostob1ab2(b1,b2);
        return Double.parseDouble(b2.getCosto())/costoVelocitaB1toB2;
    }

    public static void textCompute(){
        computeQuality();
    }

    private static void computeQuality() {
        for (Biglietto biglietto : ApplicationSession.listaBiglietti) {
            biglietto.quality = ((ApplicationSession.settings.pesoCoach * biglietto.qualityCoach) + (ApplicationSession.settings.pesoSpeed * biglietto.qualitySpeed)) / (ApplicationSession.settings.pesoSpeed + ApplicationSession.settings.pesoCoach);
            biglietto.qualityPrice = (biglietto.quality / biglietto.costo) * 10;
        }
    }
}
