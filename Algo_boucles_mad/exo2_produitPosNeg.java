package Algo_boucles_mad;
import java.util.Scanner;

public class exo2_produitPosNeg {

    public static void main(String[] args) {
        int nb1=0, nb2=0, signe; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre : ");
        nb1= scanner.nextInt();

        System.out.println("Veuillez saisir un chiffre : ");
        nb2= scanner.nextInt();

        signe= (nb1*nb1)%2;

        if(signe==0 || nb1==0 || nb2==0){
            System.out.println("Votre chiffre est positif");
        }else{
            System.out.println("Votre chiffre est négatif");
        }
        scanner.close();
    }
}

