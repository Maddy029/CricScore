package src.cricket.ui;
import src.cricket.models.Team;
import src.cricket.service.MatchController;

import java.util.Scanner;

public class Main {
    public static void showMenu(){

        int overs;

      
        Scanner sc=new Scanner(System.in);
        System.out.println();

        System.out.println("1.ENTER OVERS: ");
         overs=sc.nextInt();
        sc.nextLine();
                System.out.println("ENTER TEAM-A NAME?");
                Team teamA=new Team(sc.nextLine());

        System.out.println("ENTER TEAM-B NAME?");
                Team teamB=new Team(sc.nextLine());
            MatchController controller=new MatchController(teamA,teamB,overs);



        System.out.println();
        System.out.println("PRESS FOLLOWING NUMBERS AS INPUT");
        System.out.println();
        System.out.println("1.ENTER TEAM-A Details :");
        System.out.println("2.ENTER TEAM-B Details :");
        System.out.println();
        System.out.println();
        System.out.println("Select any one");
        int opt=sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println();


        switch(opt){


            case 1:
                
                System.out.println("ENTER NUMBER OF PLAYERS IN YOUR TEAM-A (MAX 11 PAYERS) ");
                teamA.playersCount(sc.nextInt());


               teamA.addPlayers();
               teamA.getPlayers();

                 System.out.println("ENTER NUMBER OF PLAYERS IN YOUR TEAM-B (MAX 11 PAYERS) ");
                teamB.playersCount(sc.nextInt());

               teamB.addPlayers();
               teamB.getPlayers();

               break;

            case 2:
                
               System.out.println("ENTER NUMBER OF PLAYERS IN YOUR TEAM-B (MAX 11 PAYERS) ");
                teamB.playersCount(sc.nextInt());

               teamB.addPlayers();
               teamB.getPlayers();
               System.out.println();

                System.out.println("ENTER NUMBER OF PLAYERS IN YOUR TEAM-A (MAX 11 PAYERS) ");
                teamA.playersCount(sc.nextInt());


               teamA.addPlayers();
               teamA.getPlayers();

               break;

        
        
            
        }

         while(!controller.isInningsOver()){
            System.out.println("ENTER BALL RESULT");
            controller.recordBall(sc.next());
            controller.getCurrentScore();
                       
         }
         controller.InningsScoreCard();
        //sc.close();
    }

    public static void scoreInput(){

         Scanner sc=new Scanner(System.in);

         System.out.println("START MATCH");

        
    }
    public static void main(String[] args) {



                
        showMenu();

        
    }
}
