package Entrainement;
public class croix {
public static void main(String[] args) {
    String x  = "*";
    String space = " ";

    String [] grosseCroix;

    String[][] tableau;
    int ligne = 5, colonne = 5;

    int diag2_colonne, diag2_ligne;


    diag2_colonne = 5 - 1;
    diag2_ligne = 0;
    tableau = new String[ligne][colonne];
    
    for (ligne = 0;ligne < tableau.length; ligne++)
    {
        System.out.print("ligne" + ligne + ":  ");
        for (colonne = 0; colonne < tableau[ligne].length;colonne++)
        {
            if((ligne==colonne) || (ligne == diag2_ligne && colonne == diag2_colonne))
                tableau [ligne][colonne]= " #";
            else
                tableau [ligne][colonne]= " .";
            // System.out.print("(" + colonne + "," + ligne + ")" );

            System.out.print(tableau[ligne][colonne]);
        }
        diag2_colonne -= 1;
        diag2_ligne += 1;
        System.out.println();
    }
    System.out.println();

    

    }
}
