package Algo_boucles_mad;
import java.util.Scanner;

public class exo1_posou_neg {
    public static void main(String[] args) {
        int nb=0, signe; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre : ");
        nb= scanner.nextInt();

        signe= nb%2;

        if(signe==0){
            System.out.println("Votre chiffre est positif");
        }else{
            System.out.println("Votre chiffre est négatif");
        }
        scanner.close();
    }
}
