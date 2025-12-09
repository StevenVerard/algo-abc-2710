import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        boolean A,B,C;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner une valeur à A");
        A=scanner.nextBoolean();
        System.out.println("Donner une valeur à B");
        B=scanner.nextBoolean();
        System.out.println("Donner une valeur à A");
        C=scanner.nextBoolean();

        System.out.println("Résultat : "+(A||B&&!C));

        scanner.close();
    }
}
