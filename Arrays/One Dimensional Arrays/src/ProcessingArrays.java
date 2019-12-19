import java.util.Scanner;

public class ProcessingArrays {

    public static void main(String[] args) {

        initializeWithInput();
        initializeWithRandom();
        sumElements();
       findLargestElement();
       smallestIndexOfLargest();
       randomShuffle();
       shiftElements();
    }

    public static void initializeWithInput(){

        double[] example = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + example.length + " values: ");

        for (int i = 0; i < example.length; i++){
            example[i] = in.nextDouble();
        }

        System.out.print("You have entered: ");
        for (int i = 0; i < example.length; i++){
            System.out.print(example[i] + " ");
        }
        System.out.println(" ");
        in.close();
    }

    public static void initializeWithRandom(){

        double[] example = new double[10];

        for (int i = 0; i < example.length; i++){
            example[i] = Math.random() * 100;
        }

        System.out.print("Randomized values: ");
        for (int i = 0; i < example.length; i++){
            System.out.printf("%.2f ", example[i]);
        }
    }

    public static void sumElements(){

        int total = 0;
        int[] example = new int[10];

        for (int i = 0; i < example.length; i++){
            example[i] = (int) (Math.random() * 100);
            total += example[i];
        }

        System.out.println("Sum: " + total);
    }

    public static void findLargestElement(){

        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int max = 0;
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Max number is: " + max);
        in.close();
    }

    public static void smallestIndexOfLargest(){

        Scanner in = new Scanner(System.in);
        int[] array = new int[7];
        int max = 0;
        int indexOfMax = 0;
        System.out.println("Enter 7 numbers: ");

        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
            if (array[i] > max){
                max = array[i];
                indexOfMax = i;
            }
        }

        System.out.println("Smallest index of the largest element is: " + indexOfMax);
        in.close();
    }

    public static void randomShuffle(){

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }

        for (int i = array.length - 1; i > 0; i--){
            int j = (int)(Math.random() * (i + 1));

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void shiftElements(){

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }

        int temp = array[0];

        for (int i = 1; i < array.length; i++){
            array[i - 1] = array[i];
        }

        array[array.length - 1] = temp;
    }
}
