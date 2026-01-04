package src.cricket.models;

public class Innings {

    //data
   String battingTeam ;// not clear  
   int totalRuns;
   int wickets;
   int ballsInOvers;
   String striker;
   String nonStriker;
   
   //methods

   public void addRuns(int r){
    totalRuns+=r;
   }

   public void addwickets(int w){
    wickets+=w;
   }

   public void changeStrike(){
    String temp;
    temp=striker;
    striker=nonStriker;
    nonStriker=temp;
   }
   public void isInningsOver(){
    //empty
   }
}
