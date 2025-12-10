package AlgoNiv2;

import java.util.ArrayList;
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        String produit;
        boolean quit=false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> responses = new ArrayList<>();
        responses.add("Bonjour, votre commande est avec viande (true) ou vegetarien (false)"); 

        System.out.println(" * Bonjour, que voulez vous acheter ? :");


        while(true){
            System.out.println(" Voulez-vous acheter autre choses (true/false)?");
            produit = scanner.nextBoolean();
            if(quit==true){
                break;
            }


        }
    }
}
