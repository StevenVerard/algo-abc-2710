package AlgoConditions.Partie3;

import java.util.Scanner;

public class Exo34lettredansunechaine {
    public static void main(String[] args) {


        String p="je suis un licorne qui fais de la programmation";
        char l;
        Scanner sc = new Scanner(System.in);
        int cpt = 0;

        System.out.println("Saisir une lettre");
        l = sc.next().charAt(0);

        for(int i=0; i<p.length();i++) {
            
            if(p.charAt(i) == l){
                cpt++;  
            }
             
        }
        if(cpt!=0){
            System.out.println("vous avez trouvé la lettre : "+cpt);
        }else{
            System.out.println("il n'y a pas cette lettre ds la phrase");          
        }
    }
}
