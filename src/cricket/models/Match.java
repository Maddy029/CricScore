package src.cricket.models;

public class Match {

    Team teamA;
    Team teamB;
    Innings firstInningsbatting;
    Innings secondInningsbatting;
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

        secondInningsbatting=new Innings(teamB,overs,firstInningsbatting.getRuns()+1);
        //write here
        return secondInningsbatting;

    }


    public void getwinner(){
        //write here

        

        if(secondInningsbatting.getRuns()>=firstInningsbatting.getRuns()+1){
            System.out.println(teamB.getTeamName()+" WON");
        }
        else{
            System.out.println(teamA.getTeamName()+" WON");

        }

    }

}
