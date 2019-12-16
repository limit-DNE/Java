import java.util.Scanner;

public class LetterPyramid {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        boolean hasInt = in.hasNextInt();

        if (hasInt){
            int number = in.nextInt();
            printLetterPyramid(number);
        } else {
            System.out.println("Invalid value. Try again.");
        }

        in.close();
    }

    public static void printLetterPyramid(int number){

        if(number < 1){
            System.out.println("Invalid input. Try again.");
        }

        for (int i = 0; i <= number; i++){
            for (int j = number; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
