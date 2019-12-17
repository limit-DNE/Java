import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    final static String ENDGAME = "END GAME";
    final static String ROCK = "ROCK";
    final static String PAPER = "PAPER";
    final static String SCISSOR = "SCISSOR";
    static int scoreUser = 0;
    static int scoreComputer = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Are you ROCK PAPER or SCISSOR? (Type END GAME to finish): ");
            String input = in.nextLine().toUpperCase();

            if (input.equals(PAPER) || input.equals(ROCK) || input.equals(SCISSOR)) {
                userRockPaperScissor(input);
            } else if (input.equals(ENDGAME)){

                if (scoreComputer > scoreUser){
                    System.out.println("Thank you for playing. You Lose -> Computer: " + scoreComputer + " You: " + scoreUser);
                }
                if (scoreUser > scoreComputer){
                    System.out.println("Thank you for playing. You Win -> Computer: " + scoreComputer + " You: " + scoreUser);
                }
                if (scoreComputer == scoreUser){
                    System.out.println("Thank you for playing. There are no winners for this round.");
                }
                break;
            } else {
                System.out.println("Invalid input. Restart the game.");
                break;
            }
        }
    }

    public static void userRockPaperScissor(String usersChoice) {

        String computersChoice = computerRockPaperScissor();

        if (usersChoice.equals(computersChoice)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ...It's a tie! No points granted.");
        }
        if (usersChoice.equals(SCISSOR) && computersChoice.equals(PAPER)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ,,,SCISSOR takes PAPER! You Win!");
            scoreUser++;
        }
        if (usersChoice.equals(PAPER) && computersChoice.equals(SCISSOR)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ,,,SCISSOR takes PAPER! You Lose!");
            scoreComputer++;
        }
        if (usersChoice.equals(SCISSOR) && computersChoice.equals(ROCK)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ,,,ROCK takes SCISSOR! You Lose!");
            scoreComputer++;
        }
        if (usersChoice.equals(ROCK) && computersChoice.equals(SCISSOR)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ,,,ROCK takes SCISSOR! You Win!");
            scoreUser++;
        }
        if (usersChoice.equals(ROCK) && computersChoice.equals(PAPER)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice + " ...PAPER takes ROCK! You Lose!");
            scoreComputer++;
        }
        if (usersChoice.equals(PAPER) && computersChoice.equals(ROCK)) {
            System.out.println("Computer is: " + computersChoice + " You picked: " + usersChoice +  " ...PAPER takes ROCK! You Win!");
            scoreUser++;
        }
    }

    public static String computerRockPaperScissor() {

        Random random = new Random();

        int randomNum = random.nextInt(3) + 1;

        if (randomNum == 1) {
            return SCISSOR;
        } else if (randomNum == 2) {
            return ROCK;
        } else {
            return PAPER;
        }
    }
}
