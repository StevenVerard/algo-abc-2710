package AlgoNiv1;
import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        int compte =3000, retrait=0, solde=0;

        solde = compte-retrait;

        System.out.println("Bonjour, combien voulez-vous retirer ?");
        Scanner scanner = new Scanner(System.in);
        retrait = scanner.nextInt();

        if(retrait>compte){
            System.out.println(" Opération refusée, je ne suis pas cresus !");
        }else{
            System.out.println(" Opération validée ! Let's burn it !");            
        }

        scanner.close();
    }
}
