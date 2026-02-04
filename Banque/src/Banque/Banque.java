package Banque;

public class Banque {
    private Compte[] LesComptes;
    private int nbComptes;

    public Banque() {
        this.LesComptes = new Compte[20];  
        this.nbComptes = 0;                
    }

    public void Init() {
        Compte c1 = new Compte("Haddock", 1, 100,-500);
        Compte c2 = new Compte("Tintin", 2, 1000, 0);
        Compte c3 = new Compte("Tournesol", 3,10000, -1500);
        CompteEpargne c4 = new CompteEpargne("Dupont", 10, 0, 0.015);
        CompteEpargne c5 = new CompteEpargne("Castafiore", 11, 0, 0.015);
        CompteEpargne c6 = new CompteEpargne("Lampion", 12, 0, 0.015);
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

    public Compte CompteSup(){
        Compte comptMax = this.LesComptes[0];
        for (int i = 1; i < this.nbComptes; i++) {
            if (this.LesComptes[i].getSolde() > comptMax.getSolde()) {
                comptMax = this.LesComptes[i];
            }
        }
        return comptMax;
    }

    public Compte RendCompte(int numCompte) {
        for (int i = 0; i < this.nbComptes; i++) {
            if (this.LesComptes[i].getNumero() == numCompte) {
                return this.LesComptes[i];
            }
        }
        return null;
    }

    // public Compte Transferer(int virement){

    // }

}
