package AlgoNiv2;

import java.util.ArrayList;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        boolean rep =false;
        int i=0;

        ArrayList<String> responses = new ArrayList<>();
        responses.add("Bonjour, votre commande est avec viande (true) ou vegetarien (false) ?");
        responses.add("Votre steak vous le voulez saignant (true) ou à poing (false) ?");
        responses.add("Frites (true) ou riz (false)");
        responses.add(" Soda (true) ou eau gazeuse (false)");
        Scanner scanner = new Scanner(System.in);   
        
        

        while(i<5){
            
            
            rep = scanner.nextBoolean();
            System.out.println(rep);

            if(i==0  && rep==true ){
                
            }

            if(rep==true)
            recap += rep ;

            i++;
        }

    }
}
