import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter taxable income: ");
        boolean hasInt = in.hasNextInt();

        if(hasInt){

            int income = in.nextInt();

            if (income < 0){
                System.out.println("Invalid income. Try again.");
            } else {
                double incomeTax = getIncomeTax(income);
                System.out.printf("Income tax is: $%.2f%n", incomeTax);
            }
        }
        in.close();
    }

    public static double getIncomeTax(int income){

        final double TAX_PAYABLE_BELOW_20K = 0.0;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        final int SECTION20K = 20000;
        final int SECTION40K = 40000;
        final int SECTION60K = 60000;

        if (income < 0){
            return -1;
        }

        double taxPayable = 0;

        if (income <= SECTION20K){
            taxPayable = TAX_PAYABLE_BELOW_20K;
        } else if (income <= SECTION40K){
            taxPayable = (TAX_PAYABLE_BELOW_20K * SECTION20K) + ((income - SECTION20K) * TAX_RATE_ABOVE_20K);
        } else if (income <= SECTION60K){
            taxPayable = (TAX_PAYABLE_BELOW_20K * SECTION20K) + (TAX_RATE_ABOVE_20K * SECTION20K) + ((income - SECTION40K) * TAX_RATE_ABOVE_40K);
        } else {
            taxPayable = (TAX_PAYABLE_BELOW_20K * SECTION20K) + (TAX_RATE_ABOVE_20K * SECTION20K) + (TAX_RATE_ABOVE_40K * SECTION20K) + ((income - SECTION60K) * TAX_RATE_ABOVE_60K);
        }

        return taxPayable;
    }
}
