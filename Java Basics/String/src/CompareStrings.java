public class CompareStrings {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = "Java is fun";
        String s4 = "A random string";
        String s5 = "Java";
        String s6 = " Java ";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(s4));
        System.out.println(s3.compareTo(s4));

        System.out.println(s4.contains(s1));

        if (s1 == s2){
            System.out.println("Same object");
        } else {
            System.out.println("Different objects");
        }

        s1 = s2;

        if (s1 == s2){
            System.out.println("Same object");
        } else {
            System.out.println("Different objects");
        }

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.equals(s6));
        System.out.println(s6.trim().equals(s1));

    }
}
