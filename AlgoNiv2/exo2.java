package AlgoNiv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Boolean sup=true;
        Scanner scanner = new Scanner(System.in);
        String produit;
        double prix=0, total=0;
        int cptFarine = 0, cptOeufs=0, cptLait=0;
        
        System.out.println(" Bonjour, que voulez vous acheter ?");
        

        while (sup) 
        {  
            produit = scanner.nextLine();

            switch (produit.toLowerCase()) 
            {
                case "farine":
                    prix=1.45;
                    cptFarine++;
                    break;
                case"oeufs":
                    prix=2.54;
                    cptOeufs++;
                    break;
                case"lait":
                    prix=1.30;
                    cptLait++;
                    break;
                default:
                    break;
            }

            
            total+=prix;

            System.out.println("Voulez-vous acheter autre choses (true/false)?");
            sup = scanner.nextBoolean();
            
            if(sup){
                System.out.println("Que voulez vous acheter ?");
                scanner.nextLine();
            }
            
            
        }
        System.out.println("Récapitulatif de vos courses :\n farine : " + cptFarine+"\n oeufs :"+cptOeufs+"\n lait "+cptLait+

            "\n Total de vos courses : "+total+"euros"
        );
        scanner.close();
    }
}












// -------------- SOLUTION 1 avec tableau à double entree non finie ----------------

        // ArrayList<String> responses = new ArrayList<>();
        // responses.add("Bonjour, votre commande est avec viande (true) ou vegetarien (false)"); 

        // System.out.println("Bonjour, que voulez vous acheter ? :");


        // while(true){
        //     System.out.println(" Voulez-vous acheter autre choses (true/false)?");
        //     sup = scanner.nextBoolean();

            
        //     if(sup==false){
        //         break;
        //     }



// ---------------SOLUTION AVEC POO NON FINIE--------------------------------------------
//              Scanner scanner = new Scanner(System.in);
//         HashMap<String, Object> commande = new HashMap<>();
        

        
        
//         commande.put("farine", produit);
//         commande.put("oeufs", produit);

//         while(true){
//             Produit produit = new Produit(scanner.nextLine(), scanner.nextDouble() ,scanner.nextInt());

//         }   
//     }
// }

// class Produit {
//     String nom;
//     double prix;
//     int qte;    
//     // Constructeur pour initialiser les attributs
//     public Produit(String nom, double prix, int qte) {
//         this.nom = nom;
//         this.prix = prix;
//         this.qte = qte;
//     }
// }
