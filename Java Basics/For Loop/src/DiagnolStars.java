import java.util.Scanner;

public class DiagnolStars {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number between 5 - 12: ");
        boolean hasInt = in.hasNextInt();

        if(hasInt){
            int number = in.nextInt();
            if (number < 5 || number > 12){
                System.out.println("Please enter a valid number");
            } else {

                for (int i = 0; i < number; i++){

                    for (int j = 0; j < number; j++){

                        if(i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || i  + j == number - 1){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }

        in.close();
    }
}
