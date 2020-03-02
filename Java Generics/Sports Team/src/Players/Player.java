package Players;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int getPlayerNumber();
    abstract void setPlayerNumber(int playerNumber);
}
