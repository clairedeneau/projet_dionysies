import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map<Style, Integer> perfs;
    private Map<Style, String> citations;

    public Auteur(String nom, int tragedie, String citaT, int comedie, String citaC, int drame, String citaD){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put(Style.TRAGÉDIE, tragedie);
        this.perfs.put(Style.COMÉDIE, comedie);
        this.perfs.put(Style.DRAME, drame);
        this.citations = new HashMap<>();
        this.citations.put(Style.TRAGÉDIE, citaT);
        this.citations.put(Style.COMÉDIE, citaC);
        this.citations.put(Style.DRAME, citaD);
    }
    
    public int getQualiteTragedie(){
        return this.perfs.get(Style.TRAGÉDIE);
    }

    public String getCitationTragedie(){
        return this.citations.get(Style.TRAGÉDIE);
    }

    public int getQualiteComedie(){
        return this.perfs.get(Style.COMÉDIE);
    }

    public String getCitationComedie(){
        return this.citations.get(Style.COMÉDIE);
    }

    public int getQualiteDrame(){
        return this.perfs.get(Style.DRAME);
    }

    public String getCitationDrame(){
        return this.citations.get(Style.DRAME);
    }

    public int getQualiteStyle(Style sty){
        return this.perfs.get(sty);
    }

    public String getCitationStyle(Style sty){
        return this.citations.get(sty);
    }

    public Style pointFort(){
        Style res = null;
        int min = 0;
        for (Map.Entry<Style, Integer> type : perfs.entrySet()) {
            if (type.getValue() > min) {
                res = type.getKey();
                min = type.getValue();
            }
        }
        return res;
    }

    @Override
    public String toString(){
        String mention = "L'honorable";
        return mention.concat(this.nom);
    }
}