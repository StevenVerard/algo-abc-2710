package Banque;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Banque b = new Banque();
        b.Init();
        b.AfficheComptes();
        
        System.out.println("---------------- afficher compte max ----------------");
        
        System.out.println("compte solde max : "+b.CompteSup());
        
        System.out.println("---------------- afficher compte demandé ----------------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le numéro du compte : ");
        int numCompte = scanner.nextInt();        
        System.out.println("Le numero est : "+b.RendCompte(numCompte));
        
    }
}
