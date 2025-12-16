package AlgoConditions.Partie3;
import java.util.Random;
import java.util.Scanner;

public class Exo31jeuDeLaFourchette {
    public static void main(String[] args) {
        int nb, nbJ=0, essai=0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        nb = random.nextInt(0,100);
        System.out.println(nb);
        
        while(nb!=nbJ){
            System.out.println("Saisissez un nombre : ");
            nbJ= sc.nextInt();
            if(nb==nbJ){
                System.out.println("Bravo vous avez trouvé en "+essai+" essai/s");
                break;
            }else if(nb>nbJ){
                System.out.println("Plus grand !");
            }else{
                System.out.println("Plus petit !");
            }
            essai++;
        }
        sc.close();
    }
}
