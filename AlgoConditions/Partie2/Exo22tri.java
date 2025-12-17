package AlgoConditions.Partie2;

import java.util.Scanner;

public class Exo22tri {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        a= sc.nextInt();

        System.out.println("b : ");
        b= sc.nextInt();

        if(a<b){
            System.out.println("a : "+a+" b : "+b);
        }else{
            System.out.println("a : "+b+" b : "+a);
        }

        sc.close();

    }
}
