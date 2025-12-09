package AlgoNiv1;
import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
            
        String firstname, name, mail, password, password2;
        
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Firstname");
        firstname = scanner.nextLine();

        System.out.println("Name");
        name = scanner.nextLine();

        System.out.println("Mail");
        mail = scanner.nextLine();

        System.out.println("password");
        password = scanner.nextLine();

        System.out.println("password2");
        password2 = scanner.nextLine();
        

        if(password2.equalsIgnoreCase(password) ){
            System.out.println("Merci, "+ firstname +" "+ name+  " votre mail est :  "+ mail+"votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr");
        }else{
            System.out.println("Inscription annulée !");
        }
        
        
        scanner.close();
    
    }
}