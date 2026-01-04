package src.cricket.models;

public class Player {
    // DATA
    String name;
    int runsScored;
    int ballsFaced;
    boolean isOut;


    //MEMBERS
    public void addRuns(int r){
        runsScored+=r;

    }

    public void addBalls(int b){
        ballsFaced+=b;
    }

    public void getStrikeRate(){
       System.out.print((runsScored/ballsFaced)*100);
    }

    public void setOut(){
        isOut=false;
    }



}
