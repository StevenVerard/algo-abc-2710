package AlgoConditions;
import java.util.Scanner;

public class Exo12AireVolumeSphere {
    public static void main(String[] args) {
        double rayon, aire, volume;

        Scanner sc = new Scanner(System.in);


        System.out.println("Rayon :");
        rayon = sc.nextDouble();
        System.out.println("Volume :");
        volume = sc.nextDouble();

        aire = 4 * Math.PI * Math.pow(rayon, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(rayon, 3);

        System.out.println("Nb : "+aire);
        System.out.println("Nb : "+volume);

        sc.close();


    }
}
