package src.cricket.service;
import src.cricket.models.*;
public class MatchController {
    String match;
    Team teamA;
    Team teamB;
    int maxOvers;
    int currentOver=0;
    int runs=0;
    int wickets=0;
    int balls;


//striker/non-striker



    public MatchController(Team teamA,Team teamB, int overs){
        this.teamA=teamA;
        this.teamB=teamB;
        this.maxOvers=overs;
        
    }
    public void createMatch(){

    }

    public void recordBall(String action){


        
        if(action.equals("0")){
            balls++;

        }
        else if(action.equals("1")){
            this.runs=this.runs+1;
            balls++;

        }
        else if(action.equals("2")){
            runs=runs+2;
            balls++;
        }
        else if(action.equals("3")){
            runs=runs+3;
            balls++;
        }
        else if(action.equals("4")){
            runs=runs+4;
            balls++;
        }
        else if(action.equals("6")){
            runs=runs+6;
            balls++;
        }
        else if(action.equals("w")){
            wickets++;
            balls++;
        }

         else if(action.equals("wd")){
            runs++;
        }

        if(balls==6){
            currentOver++;
            balls=0;
        }
        
    }

    public void getCurrentScore(){

        System.out.println(+this.runs+"/"+this.wickets);
        System.out.println(+currentOver+"."+balls);
    }

    public boolean isInningsOver(){
        if(currentOver==maxOvers){
            return true;
        }
        else if(wickets==10){
            return true;
        }
        return false;
    }


    public void InningsScoreCard(){
          System.out.println("Innings complete!");
                System.out.println("Final score: "+this.runs+"/"+this.wickets+" in "+maxOvers+".0 overs");
    }

    // public void getmaxOvers(int n){

    //     this.maxOvers=n;
    // }

}
