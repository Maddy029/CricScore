package src.cricket.models;
import java.util.*;

public class Team {
    Scanner sc=new Scanner(System.in);


    // DATA
    String teamName;
     int playersCount;
    ArrayList<String> playerList=new ArrayList<>();

    // MEMBERS

    public Team(String name){
        this.teamName=name.toUpperCase();
    }

    public void getTeamName(){
        System.out.println("The Team Name Is "+this.teamName);
    }

    public void playersCount(int n){

        this.playersCount=n;

    }

    public void addPlayers(){

         for(int i=1;i<this.playersCount+1;i++){
            System.out.println("ENTER PLAYER "+i+"NAME :");
            String Name=sc.nextLine().toUpperCase();
              playerList.add(Name); 
                }
    }


    public void getPlayers(){
        System.out.println();
        System.out.println("PLAYERS IN "+this.teamName);
        for(int i=0;i<playerList.size();i++){
            System.out.println("PLAYER "+(i+1)+": "+playerList.get(i));
        }
    }

}
