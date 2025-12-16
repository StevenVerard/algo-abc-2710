package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo26nbPremier {
    public static void main(String[] args) {
        int i=1, premier=0;
        double nb, test;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();

        while(i<=nb){           
            if(nb%i==0){
                premier++;
            }            
            i++;
        } 
        if(premier==2){
                System.out.println("Nb premier car ");
        }else{
                System.out.println("pas");
        };

        sc.close();
    }
}
