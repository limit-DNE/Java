public class ArrayMethods {

    public static void main(String[] args) {

        int[] array = {46, 45, 4567, 2445, 567, 34};

        printArray(reverse(array));

    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] array){

        int[] reversed = new int[array.length];

        for (int i = 0, j = reversed.length - 1; i < array.length; i++, j--){
                reversed[j] = array[i];
        }

        return reversed;
    }
}
