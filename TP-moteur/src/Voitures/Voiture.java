package Voitures;

public class Voiture {
    protected String marque;
    protected String modele;
    protected int poids;
    protected Moteur moteur;

    public Voiture(String marque, String modele, int poids, Moteur moteur) {
        this.marque = marque;
        this.modele = modele;
        this.poids = poids;
        this.moteur = moteur;
        
    }

    public Voiture(String marque, String modele, Moteur moteur) {
        this(marque, modele, 1000, moteur); 
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getPoids() {
        return poids;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public int vitesseMax(){
        Voiture.vitesseMax = Moteur.vitesseMax - (Voiture.poids * 30/100);
    }

    public void afficherInfos(){
        System.out.println("Voiture : " + this.getMarque() + " " + this.getModele());
        System.out.println("Poids : " + this.getPoids() + " kg");
        System.out.println("Vitesse max du moteur : " + this.getMoteur().getVitesseMax() + " km/h");
    }

    
    

}