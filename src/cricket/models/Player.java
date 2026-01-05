package src.cricket.models;

public class Player {
    // DATA
     String name;
    int runsScored;
    int ballsFaced;
    boolean isOut;


    public String getName(){
        return this.name;
    }

    public int getRuns(){
        return this.runsScored;
    }


     public int getBallsFaced(){
        return this.ballsFaced;
    }


    
    


    public Player(String name){
        this.name=name;
    }
    //MEMBERS
    public void addRuns(int r){
        runsScored+=r;

    }

    public void addBalls(){
        ballsFaced++;
    }

    public void getStrikeRate(){
       System.out.print((runsScored/ballsFaced)*100);
    }

    public void setOut(boolean out){
        this.isOut=out;
    }



}
