package trainchooser;

import javafx.beans.property.SimpleStringProperty;

public class BigliettoStampato {
    private final SimpleStringProperty idTreno;
    private final SimpleStringProperty classe;
    private final SimpleStringProperty costo;
    private final SimpleStringProperty distanza; //espresso in km
    private final SimpleStringProperty tempoPercorrenza; //espresso in minuti
    private final SimpleStringProperty speed; //espresso in km/h
    private final SimpleStringProperty qualitySpeed; //compreso tra 0 e 10
    private final SimpleStringProperty costoKm;
    private final SimpleStringProperty costoMinuto;
    private final SimpleStringProperty qualityCoach; //compreso tra 0 e 10
    private final SimpleStringProperty quality; //compreso tra 0 e 10
    private final SimpleStringProperty qualityPrice; //compreso tra 0 e 10

    public BigliettoStampato(String idTreno, String tclass, double costo, double distanza, double tempoPercorrenza, double speed, double qualitySpeed, double costoKm, double costoMinuto, double qualityCoach, double quality, double qualityPrice) {
        this.idTreno = new SimpleStringProperty(idTreno);
        this.classe = new SimpleStringProperty(tclass);
        this.costo = new SimpleStringProperty(String.valueOf(costo));
        this.distanza = new SimpleStringProperty(String.valueOf(distanza));
        this.tempoPercorrenza = new SimpleStringProperty(String.valueOf(tempoPercorrenza));
        this.speed = new SimpleStringProperty(String.valueOf(speed));
        this.qualitySpeed = new SimpleStringProperty(String.valueOf(qualitySpeed));
        this.costoKm = new SimpleStringProperty(String.valueOf(costoKm));
        this.costoMinuto = new SimpleStringProperty(String.valueOf(costoMinuto));
        this.qualityCoach = new SimpleStringProperty(String.valueOf(qualityCoach));
        this.quality = new SimpleStringProperty(String.valueOf(quality));
        this.qualityPrice = new SimpleStringProperty(String.valueOf(qualityPrice));
    }

    public String getIdTreno() {return idTreno.get();}
    public void setIdTreno(String idTreno) {this.idTreno.set(idTreno);}
    public String getClasse() {return classe.get();}
    public void setClasse(String tclass) {this.classe.set(tclass);}
    public String getCosto() {return  costo.get();}
    public void setCosto(String costo) {this.costo.set(costo);}
    public String getDistanza() {return distanza.get();}
    public void setDistanza(String distanza) {this.distanza.set(distanza);}
    public String getTempoPercorrenza() {return tempoPercorrenza.get();}
    public void setTempoPercorrenza(String tempoPercorrenza) {this.tempoPercorrenza.set(tempoPercorrenza);}
    public String getSpeed() {return speed.get();}
    public void setSpeed(String speed) {this.speed.set(speed);}
    public String getQualitySpeed() {return qualitySpeed.get();}
    public void setQualitySpeed(String qualitySpeed) {this.qualitySpeed.set(qualitySpeed);}
    public String getCostoKm() {return costoKm.get();}
    public void setCostoKm(String costoKm) {this.costoKm.set(costoKm);}
    public String getCostoMinuto() {return costoMinuto.get();}
    public void setCostoMinuto(String costoMinuto) {this.costoMinuto.set(costoMinuto);}
    public String getQualityCoach() {return qualityCoach.get();}
    public void setQualityCoach(String qualityCoach) {this.qualityCoach.set(qualityCoach);}
    public String getQuality() {return quality.get();}
    public void setQuality(String quality) {this.quality.set(quality);}
    public String getQualityPrice() {return qualityPrice.get();}
    public void setQualityPrice(String qualityPrice) {this.qualityPrice.set(qualityPrice);}
}
