package Voitures;

public class Voiture_course extends Voiture {

    
    public Voiture_course(String marque, String modele, int poids, Moteur moteur) {
        
        if (!moteur.getMarqueMoteur().equals(marque)) {
            throw new IllegalArgumentException("La marque du moteur ne correspond pas à la marque de la voiture.");
        }
        
        super(marque, modele, poids, moteur);
    }
}

