import CreateZoo.Birds.Eagle;

public class VisitZoo {

    public static void main(String[] args) {

        Eagle eagle1 = new Eagle("Eagle 1");

        eagle1.fly();
        eagle1.reproduce();
        eagle1.addToZoo(eagle1);
        eagle1.reproduce();
        eagle1.socialize();

        Eagle eagle2 = new Eagle("Eagle 2");
        eagle2.fly();
        eagle2.reproduce();
        eagle2.addToZoo(eagle2);
        eagle2.reproduce();


    }
}
