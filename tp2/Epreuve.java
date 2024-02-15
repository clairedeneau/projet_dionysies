public class Epreuve {
    
    private String momentJournee;
    private Style style;
    private int nbSpects;
    
    public Epreuve(String momentJournee, Style style, int nbSpects) {
        this.momentJournee = momentJournee;
        this.style = style;
        this.nbSpects = nbSpects;
    }

    public String getMomentJournee() {
        return momentJournee;
    }

    public Style getStyle() {
        return style;
    }

    public int getNbSpects() {
        return nbSpects;
    }

    
}
