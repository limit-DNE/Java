import java.util.Scanner;

public class CreditCardNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your credit card number: ");
        long creditCardNumber = in.nextLong();
        printValidity(creditCardNumber);
    }

    public static int getSize(long number){
         int numberLength = String.valueOf(number).length();
         return numberLength;
    }

    public static boolean checkSize(long number){
        int size = getSize(number);
        if (size >= 13 && size <= 16){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkStart(long number){

        String numberAsString = String.valueOf(number);

        if (numberAsString.charAt(0) == '4' || numberAsString.charAt(0) == '5' || numberAsString.charAt(0) == '6' || (numberAsString.charAt(0) == '3' && numberAsString.charAt(1) == '7')){
            return true;
        } else {
            return false;
        }
    }

    public static int[] getDigit(long number){
        String longAsString = String.valueOf(number);
        int[] array = new int[longAsString.length()];
        for (int i = 0; i < longAsString.length(); i++){
            array[i] = Character.getNumericValue(longAsString.charAt(i));
        }
        return array;
    }

    public static int doubleEverySecond(int[] array){
        int[] doubledDigits = new int[array.length];
        int sum = 0;

        for (int i = array.length - 2; i >= 0; i -= 2){
            doubledDigits[i] = array[i] * 2;
            if (doubledDigits[i] <= 9){
                sum += doubledDigits[i];
            } else {
                sum += addDigits(doubledDigits[i]);
            }
        }
        return sum;
    }

    public static int addDigits(int digit){
        String digits = String.valueOf(digit);
        int sum = 0;
        int doubleCheckDigit = 0;
        for (int i = 0; i < digits.length(); i++){
            doubleCheckDigit = Character.getNumericValue(digits.charAt(i));
            if (doubleCheckDigit <= 9){
                sum += doubleCheckDigit;
            } else {
                addDigits(doubleCheckDigit);
            }
        }
        return sum;
    }

    public static int sumOddDigits(int[] array){
        int sum = 0;
        for (int i = array.length - 1; i >= 0; i -= 2){
            sum += array[i];
        }
        return sum;
    }

    public static int sumResults(long number){
        int[] array = getDigit(number);
        int doubledResult = doubleEverySecond(array);
        int oddResult = sumOddDigits(array);
        int result = doubledResult + oddResult;
        return result;
    }

    public static boolean isValid(long number){
        int sum = sumResults(number);
        int remainder = sum % 10;
        if (checkStart(number) && checkSize(number) && remainder == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printValidity(long number){
        boolean valid = isValid(number);
        if (valid){
            System.out.println(number + " is VALID");
        } else {
            System.out.println(number + " is INVALID");
        }
    }
}
