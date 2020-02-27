import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        if (checkIfCustomerExists(customer)){
            System.out.println("This customer already exists.");
        } else {
            customers.add(customer);
            System.out.println("Customer added.");
        }
    }

    public void addCustomer(String customerName, double customerAmount){
        Customer customer = new Customer(customerName, customerAmount);
        addCustomer(customer);
    }

    public boolean checkIfCustomerExists(Customer customer){
        if (customers.contains(customer)){
            return true;
        } else {
            return false;
        }
    }

    public int getCustomerPosition(String customerName){
        if (getTotalNumberOfCustomers() > 0){
            for (int i = 0; i < getTotalNumberOfCustomers(); i++){
                Customer customer = customers.get(i);
                if (customer.getName().equalsIgnoreCase(customerName)){
                    return customers.indexOf(customer);
                }
            }
        }
        return -1;
    }

    public void addCustomerTransaction(String customerName, double transactionAmount){
        if (getCustomerPosition(customerName) == -1){
            System.out.println("Customer does not exist. Transaction failed.");
        } else {
            customers.get(getCustomerPosition(customerName)).addTransaction(transactionAmount);
            System.out.println("Amount added: " + transactionAmount);
        }
    }

    public int getTotalNumberOfCustomers(){
        return customers.size();
    }

    public void findCustomer(String customerName){
        if (getCustomerPosition(customerName) == -1){
            System.out.println("Customer cannot be found.");
        } else {
            System.out.println("Found Customer: " + customers.get(getCustomerPosition(customerName)).getName() + "\nPosition: " + getCustomerPosition(customerName));
        }
    }
}
