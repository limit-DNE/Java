public class IfElse {

    public static void main(String[] args){

        //group1
        int person1 = 34;
        int person2 = 12;
        int person3 = 67;

        //group2
        int person4 = 52;
        int person5 = 44;
        int person6 = 89;

        boolean group1 = hasTeenager(person1, person2, person3);
        boolean group2 = hasTeenager(person4, person5, person6);

        printResult(group1);
        printResult(group2);

    }

    public static boolean hasTeenager(int age1, int age2, int age3){

        if((age1 >= 12 && age1 <= 24) || (age2 >= 12 && age2 <= 24) || (age3 >= 12 && age3 <= 24)){
            return true;
        } else {
            return false;
        }
    }

    public static void printResult(boolean group){

        if(group == true){
            System.out.println("Has Teenager");
        } else {
            System.out.println("No Teenager");
        }
    }

}
