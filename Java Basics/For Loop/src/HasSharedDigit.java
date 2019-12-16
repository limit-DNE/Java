public class HasSharedDigit {

    public static void main(String[] args){

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(31, 66));
    }

    public static boolean hasSharedDigit(int num1, int num2){

        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)){

            return false;
        }

        boolean hasShared = false;
        int digit1 = 0;
        int digit2 = 0;

        for(int i = num1; i > 0; i /= 10){

            digit1 = i % 10;

            for(int j = num2; j > 0; j /= 10){

                digit2 = j % 10;

                if(digit1 == digit2){

                    hasShared = true;
                }
            }
        }

        return hasShared;
    }
}
