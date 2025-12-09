package AlgoNiv1;
import java.util.Scanner;
public class exo12 {
    public static void main(String[] args) {
        float prix, calcul;
        int reduc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Votre prix ?");
        prix = scanner.nextFloat();

        System.out.println("Votre réduction ?");
        reduc = scanner.nextInt();

        calcul = prix-(reduc*100)/100;

        System.out.println("Prix après réduction "+calcul);
        scanner.close();
    }
}
