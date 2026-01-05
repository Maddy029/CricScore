package src.cricket.models;

public class Match {

    Team teamA;
    Team teamB;
    Innings firstInningsbatting;
    Innings secondInningsbatting;
    int target=0;
    Innings currentInnings;
    int overs;


    public Match(Team teamA,Team teamB, int overs){

        this.teamA=teamA;
        this.teamB=teamB;
        this.overs=overs;
    }

    public void startMatch(){
        //firstInningsbatting=new Innings(teamA,overs,target);
        //secondInningsbatting=new Innings(teamB,overs);
    }

    public  Innings firstinnings(){

        firstInningsbatting=new Innings(teamA,overs);
        return firstInningsbatting;
        

    }

    public Innings switchInnings(){

        secondInningsbatting=new Innings(teamB,overs,target);
        //write here
        return secondInningsbatting;

    }


    public void getwinner(){
        //write here

    }

}
