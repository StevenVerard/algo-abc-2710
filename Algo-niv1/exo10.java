import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
            
        // 1. Déclaration et initialisation du tableau
        // Le tableau 'solutions' est la référence des bonnes réponses.
        String[] solutions = {"V", "F", "F", "V", "V"}; 
        
        // Le tableau 'questions' DOIT avoir la même taille que 'solutions' (5).
        String[] questions = new String[5];
        questions[0] = "Question 1 : L'informatique a besoin des mathématiques ? (V/F)";
        questions[1] = "Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)";
        questions[2] = "Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)";
        questions[3] = "Question 4 : Une table de vérité retourne l'expression algébrique (V/F)";
        questions[4] = "Question 5 : Git permet de stocker à distance son travail (V/F)";
        
        String answer;
        int points = 0;

        Scanner scanner = new Scanner(System.in);

        // --- Boucle Correcte : Une seule boucle de 0 à 4 ---
        // On utilise l'index 'i' pour accéder à la question et à la solution correspondante
        for (int i = 0; i < questions.length; i++) {
            
            // Afficher la question
            System.out.println("\n" + questions[i]);
            
            // Récupérer la réponse utilisateur
            System.out.print("Votre réponse (V/F) : ");
            answer = scanner.nextLine();

            // Vérification de la réponse (sans distinction de casse)
            // On compare la réponse à solutions[i]
            if (answer.equalsIgnoreCase(solutions[i])) {
                points++; // Incrémentation simple et correcte
                System.out.println("-> Bonne réponse !");
            } else {
                // Pas besoin de 'points;' ici
                System.out.println("-> Mauvaise réponse.");
            }
        } 
        
        scanner.close();
        
        // Affichage du résultat final
        System.out.println("\n--- Résultat Final ---");
        System.out.println("Votre score est de : " + points + " / " + questions.length);
    }
}