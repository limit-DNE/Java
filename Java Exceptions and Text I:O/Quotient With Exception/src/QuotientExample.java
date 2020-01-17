import java.util.Scanner;

public class QuotientExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers to divide:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        try{
            int result = divide(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static int divide(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        } else {
            return num1 / num2;
        }
    }
}
