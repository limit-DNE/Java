package Players;

public class SoccerPlayer extends Player {

    private int playerNumber;

    public SoccerPlayer(String name, int playerNumber) {
        super(name);
        setPlayerNumber(playerNumber);
    }


    @Override
    int getPlayerNumber() {
        return playerNumber;
    }

    @Override
    void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
