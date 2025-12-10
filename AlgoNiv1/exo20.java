package AlgoNiv1;

import java.util.Scanner;

public class exo20 {
    public static void main(String[] args) {
        int votantJoseline, votantVincent, blanc, totalVotes=150000, totalVotesCandidats;
        float pourcentJoseline, pourcentVincent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de gens ont voté pour Joseline Inutile ?");
        votantJoseline= scanner.nextInt();

        
        System.out.println("Combien de gens ont voté pour Vincent Escreau ?");
        votantVincent= scanner.nextInt();

        blanc = totalVotes - (votantJoseline+votantVincent);

        if(((votantJoseline+votantVincent)-totalVotes)<totalVotes){
           System.out.println("Vous avez "+ blanc + " d'abstentions, ils seront compté nul"); 
        }

        totalVotesCandidats = votantJoseline+votantVincent;
        pourcentJoseline = Math.round((votantJoseline * 100f / totalVotesCandidats) * 100) / 100f;
        pourcentVincent = Math.round((votantVincent * 100f / totalVotesCandidats) * 100) / 100f;

        System.out.println("Joseline Inutile : " + pourcentJoseline + "%");
        System.out.println("Vincent Escreau : " + pourcentVincent + "%");


        if(votantJoseline>votantVincent){
            System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse");
        }else{
            System.out.println("Vincent Escreau est la nouvelle maire de Mulhouse");
        }

    }
}
