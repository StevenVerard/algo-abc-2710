import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        float a, b, c, result;
        

        System.out.println("Veuillez saisir le nb a");
        Scanner scanner = new Scanner(System.in);   
        a = scanner.nextInt();

        System.out.println("Veuillez saisir le nb b");
        b = scanner.nextInt();

        System.out.println("Veuillez saisir le nb c");
        c= scanner.nextInt();


        result = (a*b)/c;
        System.out.println("équation :" + result);

        
        if(result> 10){
            System.out.println("résultat est supérieur");
        }
        scanner.close();
    }

}
