package AlgoConditions.Partie3;
import java.util.Random;
import java.util.Scanner;

public class Exo31jeuDeLaFourchette {
    public static void main(String[] args) {
        int nb, nbJ=0, essai=0, min=0, max=100;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        nb = random.nextInt(0,101);
        System.out.println(nb);

        while(nb!=nbJ){
            System.out.println("Saisissez un nombre : ");
            nbJ= sc.nextInt();
            if(nb==nbJ){
                System.out.println("Bravo vous avez trouvé en "+essai+" essai/s");
                break;
            }else if(nb>nbJ){
                System.out.println("Le chiffre est compris entre : " +min+" et : "+nbJ);
                
            }else if(nb<nbJ){
                System.out.println("Le chiffre est compris entre : " +max+" et : "+nbJ);
            }else{
                System.out.println("Erreur ! Saisissez un nombre : ");
                nbJ= sc.nextInt();
            }
            essai++;
        }
        sc.close();
    }
}
