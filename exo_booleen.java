import java.util.Scanner;

public class exo_booleen {

    


    public static void main(String[] args) {

        boolean a, b, c;

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le boolen a : ");
        a = sc.nextBoolean();
        System.out.println("Saisissez le boolean a : ");
        b = sc.nextBoolean();
        System.out.println("Saisissez le boolean a : ");
        c = sc.nextBoolean();

        System.out.println("\n Vos saisies : nb1 ="+a+"nb2,="+a+",");

        
        System.out.println("Le résultat :"+boolfc(a,b,c));

        sc.close();

    }

    
    public static boolean boolfc( boolean a, boolean b, boolean c){
            return a || b && !(c);
    };


    

}
