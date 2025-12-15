package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo26nbPremier {
    public static void main(String[] args) {
               double n=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("nb : ");
        n= sc.nextInt();

        if(n/1==n || n/n==1){
            System.out.println("c'est un nombre premier");
        } 
    }
}
