import Voitures.Moteur;
import Voitures.Voiture;

public class App {
    public static void main(String[] args) throws Exception {
        Moteur moteur = new Moteur(150,"Renault");
        Voiture voiture = new Voiture("Renault", "Clio",1200, moteur);

        voiture.afficherInfos();

    }
}
