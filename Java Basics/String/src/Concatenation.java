public class Concatenation {

    public static void main(String[] args) {

        String s1 = " Hello! This is a ";
        String s2 = " JAVA repository.";

        String s3 = s1.concat(s2);
        System.out.println(s3);
        //is equal to
        String s4 = s1 + s2;
        System.out.println(s4);
        //is equal to
        s1 += s2;
        System.out.println(s1);

    }
}
