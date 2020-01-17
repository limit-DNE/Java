import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try{
                System.out.println("Please enter an integer value:");
                int num = in.nextInt();
                System.out.println("You have entered: " + num);
                continueInput = false;
            } catch (InputMismatchException exception){
                System.out.println("Incorrect input. Please enter an integer:");
                in.nextLine();
            }
        } while (continueInput);
    }
}
