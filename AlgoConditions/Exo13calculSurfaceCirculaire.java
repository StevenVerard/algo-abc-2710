package AlgoConditions;
import java.util.Scanner;

public class Exo13calculSurfaceCirculaire {
    public static void main(String[] args) {
        double rayon,angle, surface;
        Scanner sc = new Scanner(System.in);

        System.out.println("Rayon");
        rayon= sc.nextDouble();

        System.out.println("Angle");
        angle= sc.nextDouble();

        surface = (Math.PI * Math.pow(rayon, 2)*angle)/360;
        System.out.println("surface : "+surface);

        sc.close();
    }
}
