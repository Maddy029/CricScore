package src.cricket.service;
import src.cricket.models.*;
public class MatchController {
    Match match;
    Innings currentInnings;
    Team teamA;
    Team teamB;
    int maxOvers;
    int currentOver=0;
    int runs=0;
    int wickets=0;
    int balls;
    Player striker;
    Player nonStriker;
    int nextBatsman=2;
    int inningsnumber=1;
    



    public MatchController(Team teamA,Team teamB, int overs){
        this.teamA=teamA;
        this.teamB=teamB;
        this.maxOvers=overs;


        striker =teamA.getPlayers().get(0);
     nonStriker=teamA.getPlayers().get(1);

        
    }
    public void createMatch(){

        match=new Match(teamA,teamB,maxOvers);
        currentInnings=match.firstinnings();
        
        }



    public void recordBall(String action){

        currentInnings.recordBall(action);

        if(currentInnings.isInningsOver()&& inningsnumber++==1){
        currentInnings=match.switchInnings();}
        
        


    }


    public void InningsScoreCard(){

        currentInnings.InningsScoreCard();
    }



     public boolean isInningsOver(){


        return currentInnings.isInningsOver();

    }
    public void getWinner(){
        match.getwinner();
    }

}
