import java.util.List;
import java.util.ArrayList;

public class Journee{
    private List<Auteur> candidats;
    private List<Epreuve> epreuves;
    
    public Journee(Epreuve matin, Epreuve aprem, Epreuve soir) {
        this.candidats = new ArrayList<>();
        this.epreuves = new ArrayList<>();
        this.epreuves.add(matin);
        this.epreuves.add(aprem);
        this.epreuves.add(soir);
    }

    public void ajouteCandidats(Auteur aut1, Auteur aut2){
        this.candidats.add(aut1);
        this.candidats.add(aut2);
    }
    
    public int scoreMoment(){
        
    }



    
}