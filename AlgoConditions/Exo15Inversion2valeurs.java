package AlgoConditions;

import java.util.Scanner;

public class Exo15Inversion2valeurs {
    public static void main(String[] args) {
        int a,b,inter;
        Scanner sc = new Scanner(System.in);

        System.out.println("nb1 : ");
        a= sc.nextInt();

        System.out.println("nb2 : ");
        b= sc.nextInt();

        System.out.println("nb1 : "+a);
        System.out.println("nb2 : "+b);

        inter =a ;
        a=b;
        b=inter;
        
        System.out.println("nb1 : "+a);
        System.out.println("nb2 : "+b);

        sc.close();
    }
}
