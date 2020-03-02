import Players.BaseballPlayer;
import Players.BasketballPlayer;
import Players.SoccerPlayer;

public class Main {

    public static void main(String[] args) {

        BasketballPlayer basketballPlayer1 = new BasketballPlayer("Kobe Bryant", 33);
        BasketballPlayer basketballPlayer2 = new BasketballPlayer("LeBron James", 18);
        BasketballPlayer basketballPlayer3 = new BasketballPlayer("Michael Jordan", 56);

        Team<BasketballPlayer> basketballTeam1 = new Team<>("Los Angeles Lakers", 88);
        basketballTeam1.addPlayer(basketballPlayer1);
        basketballTeam1.addPlayer(basketballPlayer2);
        basketballTeam1.addPlayer(basketballPlayer3);

        basketballTeam1.printPlayers();

        BasketballPlayer basketballPlayer4 = new BasketballPlayer("Dennis Rodman", 57);
        BasketballPlayer basketballPlayer5 = new BasketballPlayer("Magic Johnson", 59);
        BasketballPlayer basketballPlayer6 = new BasketballPlayer("Shaquille O'Neal", 46);

        Team<BasketballPlayer> basketballTeam2 = new Team<>("Boston Celtics", 64);
        basketballTeam2.addPlayer(basketballPlayer4);
        basketballTeam2.addPlayer(basketballPlayer5);
        basketballTeam2.addPlayer(basketballPlayer6);

        basketballTeam2.printPlayers();

        BaseballPlayer baseballPlayer1 = new BaseballPlayer("Mike Trout", 27);
        BaseballPlayer baseballPlayer2 = new BaseballPlayer("Mookie Betts", 55);
        BaseballPlayer baseballPlayer3 =  new BaseballPlayer("Nolan Arenado", 31);

        Team<BaseballPlayer> baseballTeam1 = new Team<>("New York Yankees", 45);
        baseballTeam1.addPlayer(baseballPlayer1);
        baseballTeam1.addPlayer(baseballPlayer2);
        baseballTeam1.addPlayer(baseballPlayer3);

        baseballTeam1.printPlayers();

        BaseballPlayer baseballPlayer4 = new BaseballPlayer(" Francisco Lindor", 17);
        BaseballPlayer baseballPlayer5 = new BaseballPlayer(" Max Scherzer", 58);
        BaseballPlayer baseballPlayer6 = new BaseballPlayer("José Altuve", 15);

        Team<BaseballPlayer> baseballTeam2 = new Team<>("Boston Red Sox", 51);
        baseballTeam2.addPlayer(baseballPlayer4);
        baseballTeam2.addPlayer(baseballPlayer5);
        baseballTeam2.addPlayer(baseballPlayer6);

        baseballTeam2.printPlayers();

        SoccerPlayer soccerPlayer1 = new SoccerPlayer(" Lionel Messi", 11);
        SoccerPlayer soccerPlayer2 = new SoccerPlayer(" Sadio Mane", 32);
        SoccerPlayer soccerPlayer3 =  new SoccerPlayer("Virgil van Dijk", 21);

        Team<SoccerPlayer> soccerTeam1 = new Team<>("Manchester United", 5);
        soccerTeam1.addPlayer(soccerPlayer1);
        soccerTeam1.addPlayer(soccerPlayer2);
        soccerTeam1.addPlayer(soccerPlayer3);

        soccerTeam1.printPlayers();

        SoccerPlayer soccerPlayer4 = new SoccerPlayer("Kylian Mbappe", 41);
        SoccerPlayer soccerPlayer5 = new SoccerPlayer("Donny van de Beek", 22);
        SoccerPlayer soccerPlayer6 = new SoccerPlayer("Kalidou Koulibaly", 28);

        Team<SoccerPlayer> soccerTeam2 = new Team<>("FC Barcelona", 3);
        soccerTeam2.addPlayer(soccerPlayer4);
        soccerTeam2.addPlayer(soccerPlayer5);
        soccerTeam2.addPlayer(soccerPlayer6);

        soccerTeam2.printPlayers();

        basketballTeam1.getMatchResults(basketballTeam2);
        baseballTeam1.getMatchResults(baseballTeam2);
        soccerTeam1.getMatchResults(soccerTeam2);
    }
}
