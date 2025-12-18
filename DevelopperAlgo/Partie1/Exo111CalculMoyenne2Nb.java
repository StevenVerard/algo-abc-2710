package DevelopperAlgo.Partie1;
import java.util.Scanner;

public class Exo111CalculMoyenne2Nb {
    public static void main(String[] args) {
        String saisie;
        double nbInt = 0;
        double s = 0;
        int i=0;
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Veuillez saisir le nb");
        saisie = scanner.nextLine();
        String [] nb = saisie.split(" ");


        while(i<nb.length){
            System.out.println("nb"+nb[i]);
            nbInt = Integer.parseInt(nb[i]);
            s+=nbInt;
            i++;
        }

        System.out.println("La moyenne est de : "+  s/nb.length);
        System.out.println("Appuyez sur une touche pour quitter");
        String scS=scanner.nextLine();
        if(!scS.isEmpty()){
            System.exit(0);
        }
        scanner.close();
    }
}
