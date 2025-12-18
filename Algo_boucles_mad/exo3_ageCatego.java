package Algo_boucles_mad;

import java.util.Scanner;

public class exo3_ageCatego {
    public static void main(String[] args) {
        int nb1=0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre âge : ");
        nb1= scanner.nextInt();
        
        if (nb1<6) {
            System.out.println("Ta catégorie est poussin ");
            
        } else if(nb1<=7){
            System.out.println("Ta catégorie est pupille ");
        }else if(nb1>=8 && nb1<=9){
            System.out.println("Ta catégorie est munille ");
        }else if(nb1>=10 && nb1<=11){
            System.out.println("Ta catégorie est minime ");
        }else{
            System.out.println("Ta catégorie est poussin ");
        }
    
    scanner.close();
    }
}
