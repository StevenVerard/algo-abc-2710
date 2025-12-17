package AlgoConditions.Partie3;

import java.util.Scanner;

public class Exo32BarbabeCourses {
    public static void main(String[] args) {
        int s=0, nbMag=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir somme");
        s = sc.nextInt();

        while(s>0){
            
                s = ((s/2)-1);
                nbMag++;
            
        }
        
        System.out.println("le nb de magasins : "+nbMag);
    }
}
