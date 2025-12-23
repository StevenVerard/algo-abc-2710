package DevelopperAlgo.Partie1;
import java.util.Scanner;
public class Exo1_10nbParfaits {
    public static void main(String[] args) {
        int i=1;
        int nb, result=0, y=1, nbx=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nb : ");
        nb = sc.nextInt();
        while(nbx<=nb)
        {             
            while(y<i)
            {
                if(i%y==0){
                    result+=y;
                }
                y++;                 
            }
            y=1;
            if(result==i){
                System.out.println("Affichage des "+nb+" premiers nombrs parfaits");
                System.out.println("est  : "+i);
                nbx++; 
            }
            result=0;
            i++;    
        }
        sc.close();
    }
}
