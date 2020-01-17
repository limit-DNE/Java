public class TestSimpleCampus {

    public static void main(String[] args) {
        Person employee1 = new Employee("Micheal Schimmor", "45 Private Drive London/UK", "+1238544890", "michealschimmor@gmail.com", "Technical Office", "66.750");
        Person employee2 = new Employee("Sara Ellison", "786 Glimmer Way London/UK", "+1897653567", "saraellison@hotmail.com", "Educational Office", "125.500");
        Person faculty1 = new Faculty("Cameron Wright", "90 Oakland Avenue London/UK", "+1297646389", "cameronwright@gmail.com", "9:00-17:00", "Student Supervisor");
        Person faculty2 = new Faculty("Alice McCall", "671 Brightson Street London/UK", "+12506789054", "alicemccall@hotmail.com", "17:00-00:00", "Librarian");
        Person staff1 = new Staff("Fred Hummington" , "329 Lakeland Drive London/UK", "+1254567890", "fredhummington@gmail.com", "Janitor");
        Person staff2 = new Staff("John Glee" , "78 Brown Way London/UK", "+1247896534", "johnglee@gmail.com", "Cook");
        Person student1 = new Student("Alex Davidson", "909 Appel Drive London/UK", "+1346789876", "alexdavidson@gmail.com", "Sophomore");
        Person student2 = new Student("Iris Aksunger", "34 Pipe Street London/UK", "+12506705644", "irisaksunger@gmail.com", "Junior");

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(faculty1.toString());
        System.out.println(faculty2.toString());
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
