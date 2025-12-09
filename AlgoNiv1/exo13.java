package AlgoNiv1;
import java.util.Scanner;
public class exo13 {
    public static void main(String[] args) {
        float m;
        int cm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner une taille en centimères ?");
        cm = scanner.nextInt();
        m = cm/100.0f;


        System.out.println(cm+" cm vaut "+m +" m");

        scanner.close();

    }
}
