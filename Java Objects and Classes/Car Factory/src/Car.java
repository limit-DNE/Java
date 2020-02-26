public class Car  extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current Gear is " + this.currentGear);
    }

    public void changeVelocity(int velocity, int direction){
        move(velocity, direction);
        System.out.println("Car's velocity: " + getCurrentVelocity() + " direction: " + getCurrentDirection());
    }

}
