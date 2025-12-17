package AlgoConditions.Partie2;

import java.util.Scanner;
import java.util.Arrays;
public class Exo23triNbPlus {
    public static void main(String[] args) {
        // int a=0,b=0,c=0;
         int[] nb = new int[3]; 
             
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        nb [0]= sc.nextInt();

        System.out.println("b : ");
        nb [1]= sc.nextInt();

        System.out.println("c : ");
        nb [2]= sc.nextInt();

        Arrays.sort(nb); 
        System.out.printf("tab[] : %s", Arrays.toString(nb));

        sc.close();

    }
}
