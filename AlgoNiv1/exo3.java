package AlgoNiv1;
import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        int a, b, result;
        float reste;

        System.out.println("Veuillez saisir le nb a");
        Scanner scanner = new Scanner(System.in);   
        a = scanner.nextInt();

        System.out.println("Veuillez saisir le nb b");
        b = scanner.nextInt();
        result = a+b;
        System.out.println("résultat :" + result);

        reste = result%2;

        if(reste == 0){
            System.out.println("résultat est pair");
        }else{
            System.out.println("résultat est impair");
        }
        scanner.close();
    }
}
