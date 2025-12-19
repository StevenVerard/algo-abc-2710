package DevelopperAlgo.Partie1;
import java.util.Scanner;
public class Exo1_10nbParfaits {
    public static void main(String[] args) {
        int i=2;
        int nb, test;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();

        while(i<=nb/2){
            test=nb%i;
            if(test==0){
                System.out.println("Les diviseurs sont : "+i);
                
            }
            i++;
        } 
        sc.close();





    }
}
