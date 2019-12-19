import java.util.Random;
import java.util.Scanner;

public class Hangman {

    final static String START = "START";
    final static String FINISH = "END";
    static int score = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter START to start the game, type END to finisH: ");
            String input = in.nextLine().toUpperCase();
            if (input.equals(START)) {
                hangman();
            } else if (input.equals(FINISH)) {
                System.out.println("Thank you for playing. Here is your score: " + score);
                break;
            } else {
                System.out.println("Invalid Input. Restart the game.");
                break;
            }
        }
    }

    public static String selectWord() {

        String[] words = {"butterfly", "selection", "bubble", "external", "dimensional", "anytime"};
        Random random = new Random();

        int randomWord = random.nextInt(words.length);

        if (randomWord == 0) {
            return words[0];
        } else if (randomWord == 1) {
            return words[1];
        } else if (randomWord == 2) {
            return words[2];
        } else if (randomWord == 3) {
            return words[3];
        } else if (randomWord == 4) {
            return words[4];
        } else {
            return words[words.length - 1];
        }
    }

    public static char[] stringToCharArray(String word) {

        char[] charArray = new char[word.length()];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = word.charAt(i);
        }

        return charArray;
    }

    public static void hangman() {

        Scanner in = new Scanner(System.in);
        String randomWord = selectWord();
        char[] wordChars = stringToCharArray(randomWord);
        char[] encrypted = new char[wordChars.length];
        char[] guesses = new char[26];

        for (int i = 0; i < encrypted.length; i++) {
            encrypted[i] = '*';
        }

        int wordLength = 0;

        while(true){

            System.out.print("Guess a letter in word ");
            for (int i = 0; i < encrypted.length; i++){
                System.out.print(encrypted[i]);
            }
            System.out.print(": \n");
            char guess = in.next().charAt(0);

            for (int i = 0; i < wordChars.length; i++){

                if (encrypted[i] == guess){
                    System.out.println("You have already tried " + guess);
                    break;
                }
                if (wordChars[i] == guess){
                    encrypted[i] = guess;
                    wordLength++;
                }
            }

            if(wordLength == wordChars.length){
                System.out.println("Congratulations! You have guessed the word " + randomWord + " correctly.");
                score++;
                break;
            }
        }
    }
}
