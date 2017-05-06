package trainchooser;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    public static double speedmax=300;// km/h del treno piu veloce anche tra i non confrontati
    public static int pesoSpeed=50;
    public static int pesoCoach=50;
    public static Map<String, Double> coachQuality = new HashMap<>();
    public Settings(){
        coachQuality.put("Regionale (2 classe)",4.0);
        coachQuality.put("Intercity (2 classe)",5.0);
        coachQuality.put("Intercity (1 classe)",6.0);
        coachQuality.put("Frecciabianca (2 classe)",7.0);
        coachQuality.put("Frecciabianca (1 classe)",8.0);
        coachQuality.put("Frecciargento (2 classe)",7.0);
        coachQuality.put("Frecciargento (1 classe)",8.0);
        coachQuality.put("Frecciarossa (Standard)",7.0);
        coachQuality.put("Frecciarossa (Premium)",8.0);
        coachQuality.put("Frecciarossa (Business)",9.0);
        coachQuality.put("Frecciarossa (Executive)",10.0);
        coachQuality.put("Italo (Smart)",7.0);
        coachQuality.put("Italo (eXtra Large)",8.0);
        coachQuality.put("Italo (Club)",9.0);
        coachQuality.put("Italo (Prima)",10.0);
    }
}
