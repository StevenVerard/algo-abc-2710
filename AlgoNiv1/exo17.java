package AlgoNiv1;
import java.util.Scanner;
// gazole 1.164
// sp95 1.718
// sp98 1.807


public class exo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double distance, consoEssence=6.51, consoGazole=5.51, prixCarburant=0, conso100=0; 
        String typeCarburant="";
        System.out.println("Quel est le type de votre carburant ? Gazole = 0, sansPlomb95 = 1, sansPlomb98 = 2,");
        
        switch (scanner.nextInt()) {
            case 0:
                typeCarburant = "Gazole";
                prixCarburant = 1.164;
                conso100 = consoGazole;
                break;
            case 1:
                typeCarburant = "Sans Plomb 95";
                prixCarburant = 1.718;
                conso100 = consoEssence;
                break;
            case 2:
                typeCarburant = "Sans Plomb 98";
                prixCarburant = 1.807;
                conso100 = consoEssence;
                break;
        
            default:
                break;
        }

        System.out.println("Vous avez choisi : "+typeCarburant);

        System.out.println("Quelle est la distance à parcourir ?");
        distance = scanner.nextInt();
        
        System.out.println("Pour "+distance+", vous allez dépenser en moyenne "+Math.round(100.0*(conso100*distance/100)*prixCarburant)/100.00);
        
        scanner.close();
        



    }
}
