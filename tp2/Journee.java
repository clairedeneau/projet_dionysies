import java.util.Map;
import java.util.HashMap;

public class Journee{
    private Map<Style, Integer> matin;
    private Map<Style, Integer> aprem;
    private Map<Style, Integer> soiree;
    
    
    public Journee(Style matin, int mat, Style aprem, int ap, Style soiree, int soir) {
        this.matin = new HashMap<>();
        this.matin.put(matin, mat);
        this.aprem = new HashMap<>();
        this.aprem.put(aprem, ap);
        this.soiree = new HashMap<>();
        this.soiree.put(soiree, soir);
    }

    public int score_moment(){
        
    }
    
}