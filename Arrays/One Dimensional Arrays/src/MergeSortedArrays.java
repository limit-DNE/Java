import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] array1 =  new int[5];

        for (int i = 0; i < array1.length; i++){
            array1[i] = in.nextInt();
        }
        Arrays.sort(array1);

        System.out.println("Enter another 5 numbers: ");
        int[] array2 = new int[5];

        for (int i = 0; i < array2.length; i++){
            array2[i] = in.nextInt();
        }
        Arrays.sort(array2);

        mergeSortedArrays(array1, array2);
    }

    public static void mergeSortedArrays(int[] array1, int[] array2){

        int length1 = array1.length;
        int length2 = array2.length;

        int[] merged = new int[length1 + length2];

        int array1Position = 0;
        int array2Position = 0;
        int mergedPosition = 0;

        while(array1Position < length1 && array2Position < length2){
            if (array1[array1Position] < array2[array2Position]){
                merged[mergedPosition++] = array1[array1Position++];
            } else {
                merged[mergedPosition++] = array2[array2Position++];
            }
        }

        while(array1Position < length1){
            merged[mergedPosition++] = array1[array1Position++];
        }

        while(array2Position < length2){
            merged[mergedPosition++] = array2[array2Position++];
        }

    }
}
