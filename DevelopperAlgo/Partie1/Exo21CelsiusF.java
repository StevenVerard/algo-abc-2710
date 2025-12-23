package DevelopperAlgo.Partie1;
import java.util.*;

public class Exo21CelsiusF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        String saisie;
        String rep;
        double sToDouble=0;
        do {
            System.out.println("Saisir une température avec son unité de mesure (C ou F)");
            saisie = scanner.nextLine();
            String[] nbTableau = saisie.split(" ");
       
            for (String s : nbTableau) {
                sToDouble += Integer.parseInt(s);
            
                if(sToDouble >= -459.67 && sToDouble <= -273.15){
                    if (saisie.indexOf("F")!=-1) {
                        System.out.println(saisie + " F = " + (sToDouble / 1.609) + " C");
                    } else {
                        System.out.println(saisie + " C = " + (sToDouble * 1.609) + "F");
                    }
                }
            }  
            System.out.println("Souhaitez-vous quitter ? (Q)");
            rep = scanner.nextLine();
        } while (rep.equalsIgnoreCase("Q"));
        scanner.close();
    }
}
