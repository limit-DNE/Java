import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args){

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner in = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        double count = 0;

        while(true){

            boolean hasNext = in.hasNextInt();

            if(hasNext){

                int numbers = in.nextInt();
                sum += numbers;
                count += 1;

            } else {
                break;
            }

            in.nextLine();
        }

        avg = (long)(Math.round(sum / count));
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
