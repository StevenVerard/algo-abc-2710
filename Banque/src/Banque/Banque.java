package Banque;

public class Banque {
    private Compte[] LesComptes;
    private int nbComptes;

    public Banque() {
        this.LesComptes = new Compte[20];  
        this.nbComptes = 0;                
    }

    public void Init() {
        Compte c1 = new Compte(12345, "toto", 1000, -500);
        Compte c2 = new Compte(4567, "titi", 2000, -1000);  
        Compte c3 = new Compte(32345, "dupond", 1500, -1500); 
        Compte c4 = new Compte(11633, "durand", 1200, -500); 
        Compte c5 = new Compte(2568, "dubois", -200, -500); 
        Compte c6 = new Compte(8978, "duval", -750, -2000); 
        this.AjoutCompte(c1);  
        this.AjoutCompte(c2);  
        this.AjoutCompte(c3); 
        this.AjoutCompte(c4); 
        this.AjoutCompte(c5); 
        this.AjoutCompte(c6); 

    }

    private void AjoutCompte(Compte unCompte) {
        
        if (this.nbComptes < this.LesComptes.length) {
            this.LesComptes[this.nbComptes] = unCompte;  
            this.nbComptes++;                            
            System.out.println("Compte ajouté avec succès !");
        } else {
            System.out.println("Le tableau de comptes est plein !");
        }

    }

    public void AfficheComptes() {
        for (int i = 0; i < this.nbComptes; i++) {
            System.out.println(this.LesComptes[i]); //System.out.println(this.LesComptes[i].toString()); on n'est plus obligé de mettre l'appel de la fonction toString();
        }
    }

    public double ComptSup(Compte unCompte){
        return Math.max(unCompte.solde, 0);
    }




    
    // public Compte RendCompte(int numCompte) {
    //     for (int i = 0; i < this.nbComptes; i++) {
    //         if (this.LesComptes[i].getNumero() == numCompte) {
    //             return this.LesComptes[i];
    //         }
    //     }
    //     return null;
    // }

}
