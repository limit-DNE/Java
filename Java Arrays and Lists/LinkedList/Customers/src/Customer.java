import java.util.concurrent.ThreadLocalRandom;

public class Customer {

    private String name;
    private int id;

    public Customer(String name) {
        this.name = name;
        this.id = generateID();
    }

    public Customer(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int generateID(){
        return ThreadLocalRandom.current().nextInt(10000, 99999);
    }

    public void printCustomerInfo(){
        System.out.println("Customer\n" + "Name: " + getName() + "\nID: " + getId());
    }
}
