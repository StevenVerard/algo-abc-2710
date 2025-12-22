package Jalon;

import java.util.Scanner;

public class Pb3 {
    public static void main(String[] args) {
        int puissance=2,nbFois,i=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Combien de fois voulez-vous retirer ?");
        nbFois = scanner.nextInt();

        while(i<=nbFois){
            double calcul =Math.pow(puissance,i);
           
            System.out.println((int)calcul);
            i++;
        }
        System.out.println("Voilà terminé :)");

        scanner.close();
    }
}
