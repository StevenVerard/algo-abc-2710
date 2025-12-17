package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo25Diviseur1nb {
    public static void main(String[] args) {
        int i=0;
        double nb, test;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();

        while(i<nb){
            test=nb%i;
            if(test==0 && i != 1){
                System.out.println("Les diviseurs sont : "+(i=+i));
            }
            i++;
        } 
        sc.close();
    }
}
