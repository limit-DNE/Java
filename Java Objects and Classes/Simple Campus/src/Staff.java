public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email){
        super(name, address, phoneNumber, email);
    }

    public Staff(String name, String address, String phoneNumber, String email, String title){
        super(name, address, phoneNumber, email);
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Staff " + getName();
    }
}
