import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] datas = new String[]{"Dog", "Monkey", "Cat", "Pig", "Giraffe"};

        ObjectLinkedList objectLinkedList = new ObjectLinkedList(null);
        for (String data : datas) {
            objectLinkedList.addObject(new ObjectListNode(data));
        }

        objectLinkedList.traverse(objectLinkedList.getRoot());
        objectLinkedList.removeObject(new ObjectListNode("Cat"));
        objectLinkedList.traverse(objectLinkedList.getRoot());
        objectLinkedList.removeObject(new ObjectListNode("Elephant"));
        objectLinkedList.traverse(objectLinkedList.getRoot());
    }
}
