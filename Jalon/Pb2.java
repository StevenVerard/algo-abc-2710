package Jalon;
import java.util.Scanner;

public class Pb2 {
    public static void main(String[] args) {
        boolean stop = true;
        int retire=10, solde =3000;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bonjour vous avez "+solde+" dans votre compte, combien voulez-vous retirer ?");

        while(stop==true){

            retire = scanner.nextInt();
            if(retire >= 10 && (solde-retire) > -500 ){
                solde -=  retire;
                System.out.println(retire+" a été retiré de votre compte, il vous reste "+solde);
                System.out.println("Souhaitez-vous retirer à nouveau ? ");
                stop = scanner.nextBoolean();               
            }else if(retire < 10){
                System.out.println("Vous devez retirer plus de 10euros");
            }else{
                System.out.println("Votre solde est insuffisant : "+solde);
            }
            if(stop==false){
                System.out.println("Merci pour votre visite, bonne journée au revoir !");
                break;
            }
            System.out.println("Veuillez saisir un nouveau montant ");
        }
        scanner.close();
    }
}
