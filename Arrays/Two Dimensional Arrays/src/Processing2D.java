import java.util.Scanner;

public class Processing2D {

    public static void main(String[] args) {

        int[][] matrix = new int[5][2];
        initializeWithUserInput(matrix);

        int[][] randomMatrix = initializeWithRandomValues(matrix);
        printArray(randomMatrix);

        int sum = sumElements(randomMatrix);
        System.out.println(sum);

        sumByColumn(randomMatrix);
    }

    public static void initializeWithUserInput(int[][] array){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + array.length + "rows and " + array[0].length + " columns: ");

        for (int row = 0; row < array.length; row++){
            for (int columns = 0; columns < array[row].length; columns++){
                array[row][columns] = in.nextInt();
            }
        }
    }

    public static int[][] initializeWithRandomValues(int[][] array){

        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = (int)(Math.random() * 100);
            }
        }
        return array;
    }

    public static void printArray(int[][] array){

        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int sumElements(int[][] array){

        int sum = 0;

        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                sum += array[row][column];
            }
        }

        return sum;
    }

    public static void sumByColumn(int[][] array){

        for (int column = 0; column < array[0].length; column++){
            int columnSum = 0;
            for (int row = 0; row < array.length; row++){
                columnSum += array[row][column];
            }
            System.out.println("Sum for column " + column + " is " + columnSum);
        }
    }
}
