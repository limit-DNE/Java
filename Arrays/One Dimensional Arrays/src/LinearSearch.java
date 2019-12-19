public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {456, 876, 34, 45, 34567, 56, 7609};

        int search1 = linearSearch(array, 34);
        int search2 = linearSearch(array, 80);
        int search3 = linearSearch(array, 456);

        System.out.println("Search 1: " + search1);
        System.out.println("Search 2: " + search2);
        System.out.println("Search 3: " + search3);
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                return i;
            }
        }
        return -1;
    }
}
