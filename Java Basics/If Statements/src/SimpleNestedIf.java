import java.util.Scanner;

public class SimpleNestedIf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        boolean hasInt = in.hasNextInt();

        if (hasInt) {

            int number = in.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Please enter a numeric value");
        }

        in.close();
    }
}
