public class TestCircle {

    public static void main(String[] args) {

        try{
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(-5);
            Circle circle3 = new Circle(0);
        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Number of objects created: " + Circle.getNumOfObjects());
    }
}
