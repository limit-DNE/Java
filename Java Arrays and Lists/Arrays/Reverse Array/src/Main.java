import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        if (size <= 0){
            System.out.println("Please enter a size greater than zero.");
        } else {
            int[] array = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < array.length; i++){
                int value = in.nextInt();
                array[i] = value;
            }
            int[] reversedArray = reverseArray(array);
            printArray(reversedArray);
        }
    }

    public static int[] reverseArray(int[] array){
        int[] reversed = new int[array.length];
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length; i++){
            reversed[maxIndex] = array[i];
            maxIndex--;
        }
        return reversed;
    }

    public static void printArray(int[] array){
        System.out.println("Reversed Array: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
