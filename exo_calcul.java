import java.util.Scanner;

public class exo_calcul {

    


    public static void main(String[] args) {

        

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nb a : ");
        double a = sc.nextDouble();
        System.out.println("Saisissez le nb a : ");
        double b = sc.nextDouble();
        System.out.println("Saisissez le nb a : ");
        double c = sc.nextDouble();

        System.out.println("\n Vos saisies : nb1 ="+a+"nb2,="+a+",");

        
        System.out.println("Le résultat :"+calcul(1,2,3));

        // sc.close();

    }

    
    public static double calcul(double a, double b, double c){
            return (a*b)/c;
    };


    

}
