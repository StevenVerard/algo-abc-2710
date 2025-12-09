import java.util.Scanner;


public class exo2 {


    public static void main(String[] args) {
        int a, b, result;

        System.out.println("Veuillez saisir le nb a");
        Scanner scanner = new Scanner(System.in);   
        a = scanner.nextInt();

        System.out.println("Veuillez saisir le nb b");
        b = scanner.nextInt();
        result = a-b;
        System.out.println("résultat :" + result);
        

        if (result<0){
            System.out.println("Le résultat est inférieur à 0 :" + result);
        }
        scanner.close();
   }


}
