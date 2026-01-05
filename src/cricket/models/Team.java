package src.cricket.models;
import java.util.*;

public class Team {
    Scanner sc=new Scanner(System.in);


    // DATA
    String teamName;
     int playersCount;
    ArrayList<Player> playerList=new ArrayList<>();

    // MEMBERS

    public Team(String name){
        this.teamName=name.toUpperCase();
    }

    public String getTeamName(){
        //System.out.println("The Team Name Is "+this.teamName);
        return this.teamName;
    }

    public void playersCount(int n){

        this.playersCount=n;

    }

    public void addPlayers(){

         for(int i=1;i<this.playersCount+1;i++){
            System.out.println("ENTER PLAYER "+i+"NAME :");
            String name=sc.nextLine().toUpperCase();
            Player player=new Player(name);
              playerList.add(player); 
                }
    }


    public ArrayList<Player> getPlayers(){
        System.out.println();
        System.out.println("PLAYERS IN "+this.teamName);
        return this.playerList;
    }

}
