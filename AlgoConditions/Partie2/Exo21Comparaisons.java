package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo21Comparaisons {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("nb1 : ");
        a= sc.nextInt();

        if (a<18) {
            System.out.println("mineur : ");
        }else{
            System.out.println("majeur : ");
        }

        sc.close();

    }
}
