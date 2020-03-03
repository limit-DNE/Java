import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Java");
        arrayList1.add("JavaScript");
        arrayList1.add("Python");
        arrayList1.add("C++");
        arrayList1.add("C#");

        arrayList1.forEach(System.out::println);

        Collections.sort(arrayList1);
        arrayList1.forEach(System.out::println);

        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList1.clone();
        arrayList2.forEach(System.out::println);
    }
}
