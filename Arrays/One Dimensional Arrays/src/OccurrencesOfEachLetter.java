import java.util.Scanner;

public class OccurrencesOfEachLetter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = in.nextLine().toLowerCase();
        getOccurrence(input);
        in.close();
    }

    public static void getOccurrence( String input) {

        int[] alphabet = new int[256];

        for (int i = 0; i < input.length(); i++){

            alphabet[input.charAt(i)]++;
        }

        char[] chars = new char[input.length()];

        for (int i = 0; i < input.length(); i++){
            chars[i] = input.charAt(i);
            int letterCount = 0;
            for (int j = 0; j <= i; j++){
                if (input.charAt(i) == chars[j]){
                    letterCount++;
                }
            }

            if (letterCount == 1){
                System.out.println(input.charAt(i) + ": " + alphabet[input.charAt(i)]);
            }
        }

    }
}
