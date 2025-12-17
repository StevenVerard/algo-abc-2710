package AlgoConditions;

import java.util.Scanner;

public class Exo14Interets {
    public static void main(String[] args) {
        double s,i,n,is,ic,rIc ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Somme : ");
        s= sc.nextDouble();

        System.out.println("Intérêt : ");
        i= sc.nextDouble();

        System.out.println("Années : ");
        n= sc.nextDouble();

        is= s*(1+n*i);
        ic=s*(1+i);
        rIc=Math.pow(ic, 2);

        System.out.println("interets simples : "+is);
        System.out.println("interets simples : "+rIc);

        sc.close();
    }
}
