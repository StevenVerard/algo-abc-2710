package AlgoNiv1;
import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
            
        String firstname, name, mail, mailCo, password, password2, passwordCo;
        
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
            System.out.println("Merci, "+ firstname +" "+ name+ "votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr");
        }else{
            System.out.println("Inscription annulée !");
        }


        System.out.println("Veuillez saisir votre adresse mail");
        mailCo = scanner.nextLine();

        System.out.println("Veuillez saisir votre password");
        passwordCo = scanner.nextLine();

        if(mailCo.equalsIgnoreCase(mail) && passwordCo.equalsIgnoreCase(password)){
            System.out.println("Bienvenue "+ firstname +" "+ name+ " ! ");
        }else{
            System.out.println("Connexion refusée !");
        }
        
        
        scanner.close();
    
    }
}