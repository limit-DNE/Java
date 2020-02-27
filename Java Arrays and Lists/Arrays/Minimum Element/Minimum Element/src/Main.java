import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        if (size <= 0) {
            System.out.println("Please enter a size greater than zero.");
        } else {
            int[] array = new int[size];
            System.out.println("Enter the values for the array: ");
            for (int i = 0; i < array.length; i++) {
                int value = in.nextInt();
                array[i] = value;
            }
            int minimum = findMinimum(array);
            System.out.println("The minimum element is: " + minimum);
        }
    }

    public static int findMinimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
