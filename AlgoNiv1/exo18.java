package AlgoNiv1;

import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        int montantPret =0, salaire=0, apport=0;
        Boolean contrat= false;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Êtes-vous en CDI ?");
        contrat= scanner.nextBoolean();

        System.out.println("Quel est le montant de votre prêt ?");
        montantPret = scanner.nextInt();

        System.out.println("Quel est votre salaire ?");
        salaire = scanner.nextInt();

        System.out.println("Combien avez-vous d'apport ?");
        apport = scanner.nextInt();

        if((contrat==true&&salaire>36000 && apport>montantPret*0.25) || (apport>montantPret*0.25 && apport>montantPret*075)){
            System.out.println("Vous pouvez obtenir un prêt !");
        }else{
            System.out.println("Vous ne pouvez pas hélas obtenir de prêt !");
        }

        scanner.close();
    }
}
