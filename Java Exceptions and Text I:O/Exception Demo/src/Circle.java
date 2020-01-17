public class Circle {

    private double radius;
    private static int numOfObjects = 0;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        setRadius(radius);
        numOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0){
            this.radius = newRadius;
        } else {
            throw  new  IllegalArgumentException("Radius cannot be negative.");
        }
    }

    public static int getNumOfObjects(){
        return numOfObjects;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}
