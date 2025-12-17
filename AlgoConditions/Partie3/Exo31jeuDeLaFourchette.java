package AlgoConditions.Partie3;
import java.util.Random;
import java.util.Scanner;

public class Exo31jeuDeLaFourchette {
    public static void main(String[] args) {
        int nbO, nbJ=0, essai=1, min=0, max=100;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        nbO = random.nextInt(0,101);
        // System.out.println(nbO);

        while(nbO!=nbJ){
            System.out.println("Saisissez un nombre : ");
            nbJ= sc.nextInt();
            if(nbO==nbJ){
                System.out.println("Bravo vous avez trouvé en "+essai+" essai/s");
                break;
            }else if(nbO<nbJ && (nbJ>min && nbJ<max)){
                System.out.println("Le chiffre est compris entre : " +min+" et : "+nbJ);
                max=nbJ;
                
            }else if(nbO>nbJ && (nbJ>min && nbJ<max)){
                System.out.println("Le chiffre est compris entre : " +nbJ+" et : "+max);
                min=nbJ;
                System.out.println("le nouveau min : "+min);
            }else{
                System.out.println("Erreur ! Saisissez un nombre entre  "+min +" et "+max);
            }
            essai++;
        }
        sc.close();
    }
}
