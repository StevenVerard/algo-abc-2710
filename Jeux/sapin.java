
import java.util.Random;
public class sapin {
    
    public static void main(String[] args) {
        
        int cpt1= 1;
        int cpt2= 1;
        int cpt4= 1;
        int cpt3=2;
        String golden = "🍎";
        String pumpkin = "🎃";
        Random random = new Random();
        int borneExclue = 10; 
        int resultat = random.nextInt(borneExclue);
        
        while(cpt1<cpt2){
            System.console().writer().write("    ");
            while(cpt3<cpt4){
                System.console().writer().write("                                     "+golden+"        "+"                         "+pumpkin+"                                    ");
            cpt3++;
            }


        }
        
                    

        
        
       
    }
}
