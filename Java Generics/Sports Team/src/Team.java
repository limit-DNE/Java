import Players.Player;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String teamName;
    private int teamScore;
    private ArrayList<T> players;

    public Team(String teamName, int teamScore){
        this.teamName = teamName;
        this.teamScore = teamScore;
        players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getNumberOfPlayers(){
        return players.size();
    }

    public void addPlayer(T player){
        if (players.contains(player)){
            System.out.println("\nThis player is already in the list.");
        } else {
            players.add(player);
            System.out.println("\nPlayer " + player.getName() + " successfully added.");
        }
    }

    public void getMatchResults(Team<T> opponent){
        if (opponent.getTeamScore() > getTeamScore()){
            System.out.println("\n" + opponent.getTeamName() + " won this match.");
        } else if (opponent.getTeamScore() < getTeamScore()){
            System.out.println("\n" + getTeamName() + " won this match.");
        } else {
            System.out.println("\nMatch resulted in a tie.");
        }
    }

    public void printPlayers(){
        if (getNumberOfPlayers() > 0){
            System.out.println();
            for (Player player : players) {
                System.out.println(player.getName());
            }
        } else {
            System.out.println("\nNo players are listed for this team.");
        }
    }
}
