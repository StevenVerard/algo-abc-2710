package AlgoNiv2;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
            int terminer=0,retirer =1, afficher_cpt = 2, deposer=3, choix=1;
            float compteBanque = 2000, retrait=0;
            Scanner scanner = new Scanner(System.in);



            while(choix!=0)
            {
                System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous : (0)Quitter\r\n" + //
                " * (1)Retirer de l'argent\r\n" + //
                " * (2)Consulter votre solde\r\n" + //
                " * (3)Déposer de l'argent");
                choix = scanner.nextInt();

                switch (choix) 
                {
                    case 0:
                        System.out.println("Merci de votre visite, au revoir :) !:");
                        scanner.nextLine();
                        break;
                    case 1:
                        System.out.println("Combien voulez-vous retirer ?:");
                        retrait=scanner.nextInt();
                        if(compteBanque>retrait){
                            compteBanque -= retrait;
                            System.out.println("Opération acceptée : "+ retrait+"euros ont été retiré");
                        }else{
                            System.out.println("Désolé vous n'avez pas assez d'argent : "+ retrait+". Vous n'avez que : "+ compteBanque);
                        }
                        break;
                    case 2:
                        System.out.println("Vous avez actuellement 1500€ sur votre solde"+compteBanque);
                        break;
                    case 3:
                        System.out.println("Combien voulez-vous déposer ?:");
                        scanner.nextLine();
                        

                        break;
                    default:
                        break;
                }
        }
    }
    
}
