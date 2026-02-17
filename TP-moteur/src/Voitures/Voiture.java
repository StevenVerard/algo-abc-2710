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
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public int getPoids() {
        return this.poids;
    }

    public Moteur getMoteur() {
        return this.moteur;
    }

    public int vitesseMax(){
        int vitesseMax = this.moteur.getVitesseMax() - (this.poids * 30/100);
        return vitesseMax;
    }

    public void afficherInfos(){
        System.out.println("Voiture : " + this.getMarque() + " " + this.getModele());
        System.out.println("Poids : " + this.getPoids() + " kg");
        System.out.println("Vitesse max du moteur : " + this.getMoteur().getVitesseMax() + " km/h");
    }

    
    

}