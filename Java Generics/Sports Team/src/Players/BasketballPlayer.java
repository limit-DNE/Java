package Players;

public class BasketballPlayer extends Player {

    private int playerNumber;

    public BasketballPlayer(String name, int playerNumber) {
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
