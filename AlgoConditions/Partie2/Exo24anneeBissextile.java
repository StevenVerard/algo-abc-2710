package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo24anneeBissextile {
public static void main(String[] args) {
        int a;
        System.out.println("a : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("L'année est bissextile.");
        } else {
            System.out.println("L'année n'est pas bissextile.");
        }
        sc.close();            
    }
}
