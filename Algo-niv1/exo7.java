import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
            
        String answer;
        
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Do you speak English ? (Y/N)");
        answer = scanner.nextLine();

        


        if(answer.equalsIgnoreCase("Y")){
            System.out.println("Nice to meet you");
        }else{
            System.out.println("So learn English !");
        }
        
        
        scanner.close();
    
    }
}
