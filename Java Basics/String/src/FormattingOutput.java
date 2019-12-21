public class FormattingOutput {

    public static void main(String[] args) {

        //%[flag][width][.precision]conversion
        String s1 = "first argument";
        String s2 = "second argument";
        System.out.printf("This replaces %1$s and this replaces %2$s. \n", s1, s2);

        double num = 23.3456;
        System.out.printf("Result 1 is %.2f \n" , num);
        System.out.printf("Result 2 is %12.2f \n", num);
    }

}
