public class CopyingArrays {

    public static void main(String[] args) {

        loopCopy();
        copyMethod();
    }

    public static void loopCopy(){

        int[] array = { 23, 56, 78, 90, 66, 78};
        int[] copyArray = new int[array.length];

        System.out.print("Copy array: ");
        for (int i = 0; i < array.length; i++){
            copyArray[i] = array[i];
            System.out.print(copyArray[i] + " ");
        }

        System.out.println(" ");
    }

    public static void copyMethod(){

        int[] array = { 23, 56, 78, 90, 66, 78};
        int[] copyArray = new int[array.length];

        System.arraycopy(array, 0, copyArray, 0, array.length);

        System.out.print("Copy array with method: ");
        for (int i = 0; i < copyArray.length; i++){
            System.out.print(copyArray[i] + " ");
        }
    }
}
