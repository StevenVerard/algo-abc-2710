package Voitures;

public class Voiture_course extends Voiture {

    
    public Voiture_course(String marque, String modele, int poids, Moteur moteur) {
        
        if (!moteur.getMarqueMoteur().equals(marque)) {
            throw new IllegalArgumentException("La marque du moteur ne correspond pas à la marque de la voiture.");
        }
        
        super(marque, modele, poids, moteur);
    }

@Override

    public int vitesseMax(){
        double vitesseMax = (int) this.moteur.getVitesseMax() - (this.poids * 0.05);
        return (int) vitesseMax;
    }

@Override
    public void afficherInfos(){
        System.out.println("Voiture : " + this.getMarque() + " " + this.getModele());
        System.out.println("Poids : " + this.getPoids() + " kg");
        System.out.println("Vitesse max du moteur : " + this.getMoteur().getVitesseMax() + " km/h");
    }

}

