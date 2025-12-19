package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo26nbPremier {
    public static void main(String[] args) {
        int i=2;
        
        Boolean premier;
        int nb;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();

        premier=true;
        while(i<=nb/2){

            if(nb%i==0){
                premier=false;
            }            
            i++;
        } 
        if(premier){
                System.out.println("Nb premier car  pas de diviseurs");
        }else{
                System.out.println("pas premier il existe un diviseur");
        };

        sc.close();
    }
}
