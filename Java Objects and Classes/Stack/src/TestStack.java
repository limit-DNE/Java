public class TestStack {

    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "This";
        String s3 = "is";
        String s4 = "a";
        String s5 = "Java";
        String s6 = "program";
        Stack myStack = new Stack();
        myStack.push(s1);
        myStack.push(s2);
        myStack.push(s3);
        myStack.push(s4);
        myStack.push(s5);
        myStack.push(s6);
        System.out.println(myStack.toString());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.push("Iris");
        System.out.println(myStack.toString());
    }
}
