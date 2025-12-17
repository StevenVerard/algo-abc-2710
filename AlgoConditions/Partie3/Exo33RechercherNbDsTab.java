package AlgoConditions.Partie3;

import java.util.Scanner;

public class Exo33RechercherNbDsTab {
    public static void main(String[] args) {
        int n=0;
        boolean b = false;
        int [] nb = {1,9,17,25,33,41,49,57,65,73,81,89,97,105,113,121,129,137,145,153,161,169,177,185,193,201,209,217,225,233,241,249};
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir nb");
        n = sc.nextInt();

        for(int i =0; i<nb.length;i++  ){
            
            if (nb [i] == n){
                System.out.println("l'emplacement du nb est dans la case : "+i);
                b=true;
                break;
            }
        }
    
        if(!b){
            System.out.println("404 Not found ");
        }
        sc.close();

    }
}
