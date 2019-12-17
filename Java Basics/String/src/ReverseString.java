import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = in.nextLine();

        String reversed1 = reverseMethod1(input);
        System.out.println(reversed1);

        String reversed2 = reverseWithRecursion(input);
        System.out.println(reversed2);
    }

    public static String reverseMethod1(String input){

        String container = "";

        for (int i = input.length() - 1; i > 0; i--){
            container += input.charAt(i);
        }

        container += input.charAt(0);
        return container;
    }

    public static String reverseWithRecursion(String input){

        if(input.isEmpty()){
            return input;
        } else {
            return reverseWithRecursion(input.substring(1)) + input.charAt(0);
        }
    }
}
