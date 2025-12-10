package AlgoNiv1;

import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        int secondes, minutes, heures, sec;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de secondes ?");
        sec = scanner.nextInt();

        heures = sec/3600; 
        minutes= (sec%3600)/60;
        secondes= sec%60;
        
        System.out.println(sec+" secondes correspond "+ heures+"heures, "+minutes+" minutes et "+secondes);
        /*
        Dans ton code actuel, la variable heures est déclarée comme un entier (int).
        En Java, lorsque tu effectues une division entre deux entiers (int), le résultat est également un entier. 
        Cela signifie que la partie décimale est tronquée (ignorée), 
        et c'est pourquoi tu ne vois pas les chiffres après la virgule.
        */

        scanner.close();

    }
}
