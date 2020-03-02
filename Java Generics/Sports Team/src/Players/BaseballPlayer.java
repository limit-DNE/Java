package Players;

public class BaseballPlayer extends Player {

    private int playerNumber;

    public BaseballPlayer(String name, int playerNumber) {
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
