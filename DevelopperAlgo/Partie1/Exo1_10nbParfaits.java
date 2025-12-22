package DevelopperAlgo.Partie1;
import java.util.Scanner;
public class Exo1_10nbParfaits {
    public static void main(String[] args) {
        int i=0;
        int nb, test, cpt=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();
        while(i<nb){
            
            System.out.println("Affichage des "+nb+" premiers nombrs parfaits");
            System.out.println("est  : "+i);  
            i++;
            
        }
        sc.close();





    }
}
