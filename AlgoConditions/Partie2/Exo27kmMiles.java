package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo27kmMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km;
        String q = "";

        // On continue tant que l'utilisateur ne tape pas 'q'
        while (!q.equalsIgnoreCase("q")) {
            System.out.print("Entrez les km (ou 'q' pour quitter dès le prochain tour) : ");
            
            // Vérification si l'entrée est bien un nombre
            if (sc.hasNextDouble()) {
                km = sc.nextDouble();
                
                if (km >= 0.01 && km <= 1000000) {
                    System.out.println(km + " km = " + (km / 1.609) + " miles");
                } else {
                    System.out.println("Erreur : Valeur hors limites.");
                }
            }
            
            // On vide le buffer et on demande si on veut quitter
            sc.nextLine(); // Consomme le retour à la ligne restant
            System.out.println("Appuyez sur Entrée pour continuer ou 'q' pour quitter");
            q = sc.nextLine();
        }
        
        System.out.println("Programme terminé.");
        sc.close();
    }
}