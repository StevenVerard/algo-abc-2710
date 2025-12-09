package AlgoNiv1;
import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        int nbPlaces, age;
        String business;

        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Le passager veut-il une classe business ? (oui/non)");
        business = scanner.nextLine();

        System.out.println("Quel est l'âge de votre passager ?");
        age = scanner.nextInt();

        System.out.println("Le prix du vol ?");
        int prixSaisi = scanner.nextInt();

        System.out.println("Nombre de places disponibles ?");
        nbPlaces = scanner.nextInt();
        float modificateur_reduction;
        modificateur_reduction = 1; //1 pour 100%

        if (age<18)
        {
            modificateur_reduction -= 0.2;
        }
        else if (age>60)
        {
            modificateur_reduction -= 0.4;
        }
        if (nbPlaces>60)
        {
            modificateur_reduction -= 0.2;
        }
        else if (nbPlaces<20)
        {
            modificateur_reduction += 0.2;
        }
        if (business.equalsIgnoreCase("oui"))
        {
            modificateur_reduction += 0.2;
        }

        scanner.close();
        System.out.println("Le prix du vol est :" + prixSaisi * modificateur_reduction);
    }
}
