import java.util.Scanner;

public class HillPattern {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        boolean hasInt = in.hasNextInt();

        if(hasInt){
            int row = in.nextInt();

            if(row < 0){
                System.out.println("Please enter a positive value. Try again.");
            } else {

                for(int i = 1; i <= row; i++){

                    for(int j = row; j > i; j--){

                        System.out.print("*");
                    }

                    System.out.println(" ");
                }
            }

        } else {
            System.out.println("Not a numeric value. Try again.");
        }

        in.close();
    }

}
