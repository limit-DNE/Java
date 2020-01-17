public class Employee extends Person {

    private String office;
    private String salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email){
        super(name, address, phoneNumber, email);
        dateHired = new MyDate();
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, String salary){
        super(name, address, phoneNumber, email);
        dateHired = new MyDate();
        this.office = office;
        this.salary = salary;
    }


    public void setOffice(String office){
        this.office = office;
    }

    public String getOffice(){
        return office;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    public String getSalary(){
        return salary;
    }

    public String printDateHired(){
        return dateHired.printDate();
    }

    @Override
    public String toString(){
        return "Employee " + getName();
    }
}
