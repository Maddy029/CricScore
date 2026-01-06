package src.cricket.models;

public class Innings {

    //data
    Team battingTeam ;// not clear  
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
    Match match;
    int target=-1;
   
   //methods

   public Innings(Team battingTeam,int maxOvers ){
    this.teamA=battingTeam;
    this.maxOvers=maxOvers;
     striker =teamA.getPlayers().get(0);
     nonStriker=teamA.getPlayers().get(1);
   }



   public Innings(Team battingTeam,int maxOvers,int target){
    this.teamA=battingTeam;
    this.maxOvers=maxOvers;
    this.target=target;
    System.out.println("target : "+target);

     striker =teamA.getPlayers().get(0);
     nonStriker=teamA.getPlayers().get(1);
   }

  public void swapStriker(){
        Player temp=striker;
        striker=nonStriker;
        nonStriker=temp;
    }

    public void recordBall(String action){


        
        if(action.equals("0")){
            balls++;
            striker.addBalls();

        }
        else if(action.equals("1")){
            this.runs=this.runs+1;
            balls++;
            striker.addBalls();
            striker.addRuns(1);

            System.out.println(striker.getName()+" SCORED 1 RUNS");
            swapStriker();
            


        }
        else if(action.equals("2")){
            runs=runs+2;
            balls++;
            striker.addRuns(2);
            striker.addBalls();
            System.out.println(striker.getName()+" SCORED 2 RUNS");

        }
        else if(action.equals("3")){
            runs=runs+3;
            balls++;
            striker.addRuns(3);
            striker.addBalls();
            System.out.println(striker.getName()+" SCORED 3 RUNS");
            swapStriker();
            
        }
        else if(action.equals("4")){
            runs=runs+4;
            balls++;
            striker.addRuns(4);
            striker.addBalls();
           System.out.println(striker.getName()+" SCORED 4 RUNS");

        }
        else if(action.equals("6")){
            runs=runs+6;
            balls++;
            striker.addRuns(6);
            striker.addBalls();
            System.out.println(striker.getName()+" SCORED 6 RUNS");

        }
        else if(action.equals("w")){
            wickets++;
            balls++;
            striker.addBalls();
            striker.setOut(true);
            System.out.println(" LEss GO  IT'S A WICKET");
            striker =teamA.getPlayers().get(nextBatsman++);
        }

         else if(action.equals("wd")){
            runs++;
            System.out.println(" OHH IT'S A WIDE BALL");
        }

        if(balls==6){
            currentOver++;
            balls=0;
            this.getCurrentScore();
        }
        if(balls==0){
            swapStriker();
        }
        
    }

    public void getCurrentScore(){

        // System.out.println(+this.runs+"/"+this.wickets);
        // System.out.println(+currentOver+"."+balls);
        System.out.println(striker.getName()+" "+striker.getRuns()+" "+"("+striker.getBallsFaced()+")");
        System.out.println(nonStriker.getName()+" "+nonStriker.getRuns()+" "+"("+nonStriker.getBallsFaced()+")");
        System.out.println(teamA.getTeamName()+": "+runs+"/"+wickets+" in "+currentOver+"overs");

    }

    public boolean isInningsOver(){
        if(currentOver==maxOvers){
            return true;
        }
        else if(wickets==10){
            return true;
        }
        else if( target!=-1 && target<=runs){
            return true;
        }
        return false;
    }


    public void InningsScoreCard(){
          System.out.println("Innings complete!");
                System.out.println("Final score: "+this.runs+"/"+this.wickets+" in "+maxOvers+".0 overs");
    }

    public int getCurrentOver(){
        return currentOver;
    }

    public int getWickets(){
        return wickets;
    }
    public int getRuns(){
        return runs;
    }



}

