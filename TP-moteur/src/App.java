import Voitures.Moteur;
import Voitures.Voiture;
import Voitures.Voiture_course;

public static void main(String[] args) throws Exception {
    // 1. Voiture classique
    Moteur moteur = new Moteur(150, "Renault");
    Voiture clio = new Voiture("Renault", "Clio", 1200, moteur);
    clio.afficherInfos();
    System.out.println("Vitesse réelle : " + clio.vitesseMax() + " km/h");

    System.out.println("---");

    // 2. Voiture de course (Observez le "new Voiture_course")
    Moteur moteurSport = new Moteur(150, "Porsche");
    Voiture cayenne = new Voiture_course("Porsche", "Cayenne", 1200, moteurSport);
    cayenne.afficherInfos();
    System.out.println("Vitesse réelle : " + cayenne.vitesseMax() + " km/h");

}
