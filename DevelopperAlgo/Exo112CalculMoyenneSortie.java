package DevelopperAlgo;

import java.util.Scanner;

public class Exo112CalculMoyenneSortie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  
        String saisie;
        String rep;
        double somme, moyenne;
        do {
            System.out.println("Veuillez saisir les nombres séparés par un espace :");
            saisie = scanner.nextLine();
            String[] nbTableau = saisie.split(" ");
            
            somme = 0;
            for (String s : nbTableau) {
                somme += Integer.parseInt(s);
            }

            moyenne = somme / nbTableau.length;
            System.out.println("La moyenne de cette saisie est de : " + moyenne);
            
            System.out.println("Souhaitez-vous faire un autre calcul ? (O/N)");
            rep = scanner.nextLine();
        } while (rep.equalsIgnoreCase("O"));
        scanner.close();
    }
}