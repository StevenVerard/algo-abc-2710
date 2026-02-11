package Voitures;

public class Moteur {
    private int vitesseMax;
    private String marqueMoteur;

    public Moteur(int vitesseMax, String marqueMoteur) {
        this.vitesseMax = vitesseMax;
        this.marqueMoteur = marqueMoteur;
    }

    
    public int getVitesseMax() {
        return vitesseMax;
    }

    
    public String getMarqueMoteur() {
        return marqueMoteur;
    }

}
