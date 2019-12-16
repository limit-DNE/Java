import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        boolean hasInt = in.hasNextInt();

        if (hasInt){

           int number = in.nextInt();
           System.out.println(getLargestPrime(number));

        } else {
            System.out.println("Invalid input. Try again.");
        }

        in.close();
    }

    public static int getLargestPrime(int number){

        if(number < 0){
            return -1;
        }

        if(number == 1 || number == 0){
            return -1;
        }

        int i;

        for(i = 2; i <= number; i++){

            if(number % i == 0){

                number /= i;

                i--;
            }
        }

        return i;
    }
}
