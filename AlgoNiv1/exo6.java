package AlgoNiv1;
import java.util.Scanner;

public class exo6 {
        public static void main(String[] args) {

        int age;
        String firstname;
        
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Veuillez saisir le prenom");
        firstname = scanner.nextLine();

        
        System.out.println("Veuillez saisir l'age");
        age = scanner.nextInt();



        
        System.out.println("Je m'appelle "+firstname+", j'ai "+age);
        scanner.close();

    }
}
