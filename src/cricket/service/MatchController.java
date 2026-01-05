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
        // second inn?
        }



    public void recordBall(String action){

        currentInnings.recordBall(action);

        if(currentInnings.isInningsOver()){
        currentInnings=match.switchInnings();}
        


    }


    public void InningsScoreCard(){
          System.out.println("Innings complete!");
                System.out.println("Final score: "+this.runs+"/"+this.wickets+" in "+maxOvers+".0 overs");
    }

    // public void getmaxOvers(int n){

    //     this.maxOvers=n;
    // }

     public boolean isInningsOver(){
        if(currentInnings.getCurrentOver()==maxOvers){
            return true;
        }
        else if(currentInnings.getWickets()==10){
            return true;
        }
        return false;
    }

}
