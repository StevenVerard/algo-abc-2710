package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo27kmMiles {
    public static void main(String[] args) {
        double km, r;
        String q="";
        System.out.println("km : ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();

        while(q=="")
        {         
            if(km>0.01 && km<1000000)
            {
            System.out.println(km/1.609);
            }else{
            System.out.println("Veuillez saisir à nouveau un nombre ");
            km = sc.nextDouble();
            }
            System.out.println("saisissez 'q' pour quitter");
            q = sc.nextLine();
            q = sc.nextLine();
        }
    }
}
