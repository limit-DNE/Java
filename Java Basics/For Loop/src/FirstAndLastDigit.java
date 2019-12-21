public class FirstAndLastDigit {

    public static void main(String[] args){

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(666));
    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        for(int i = number; i > 0; i /= 10){

            if(i < 10){
                firstDigit = i;
            }
        }

        int sum = firstDigit + lastDigit;
        return sum;
    }
}
