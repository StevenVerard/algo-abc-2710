package AlgoNiv2;

import java.util.ArrayList;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        boolean rep =false;
        int i=0;
        String menu="";

        ArrayList<String> responses = new ArrayList<>();
        responses.add("Bonjour, votre commande est avec viande (true) ou vegetarien (false) ?");
        responses.add("Votre steak vous le voulez saignant (true) ou à poing (false) ?");
        responses.add("Frites (true) ou riz (false)");
        responses.add(" Soda (true) ou eau gazeuse (false)");
        Scanner scanner = new Scanner(System.in);   

        while(i < responses.size()){    
            // System.out.println(responses.get(i));
            // rep = scanner.nextBoolean();
            // if(rep==true && i==i){
            //   //menu+=  
            // }
            
            // if(i==0  && rep==false ){
            //     i++;
            // }
            // i++;

            switch (i) {
                case 0:
                    System.out.println(responses.get(i));
                    rep = scanner.nextBoolean();
                    if(rep==false ){
                        menu+="menu végétarien : ";
                        i++;
                    }else{
                        menu+="menu viande : ";
                    }
                    i++;
                    break;
                    
                case 1:
                    System.out.println(responses.get(i));
                    rep = scanner.nextBoolean();
                    if(rep==false ){
                        menu+="steak saignant, ";
                    }else{
                        menu+="strak à point, ";
                    }
                    i++;
                    break;

                case 2:
                    System.out.println(responses.get(i));
                    rep = scanner.nextBoolean();
                    if(rep==false ){
                        menu+="riz, ";
                    }else{
                        menu+="frites, ";
                    }
                    i++;
                    break;


                case 3:
                    System.out.println(responses.get(i));
                    rep = scanner.nextBoolean();
                    if(rep==false){
                        menu+="eau gazeuse.";
                    }else{
                        menu+="soda.";
                    }
                    i++;
                    break;
            
                default:

                    break;
            }
         
        }

        System.out.println("Voici votre menu\n"+menu+ "\n Merci pour votre commande, ça sera près dans 20min");
        scanner.close();
    }

    
}
