import java.util.LinkedList;
import java.util.ListIterator;

public class CustomerBook {

    private LinkedList<Customer> customers;
    private static int index = 0;

    public CustomerBook() {
        this.customers = new LinkedList<>();
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public int getTotalNumberOfCustomers() {
        return customers.size();
    }

    public boolean checkIfCostumerExists(Customer customer) {
        if (customers.contains(customer)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfCostumerExists(String customerName) {
        if (getTotalNumberOfCustomers() > 0) {
            for (Customer customer : customers) {
                if (customer.getName().equalsIgnoreCase(customerName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getCustomerPosition(String customerName) {
        if (getTotalNumberOfCustomers() > 0) {
            for (Customer customer : customers) {
                if (customer.getName().equalsIgnoreCase(customerName)) {
                    return customers.indexOf(customer);
                }
            }
        }
        return -1;
    }

    public void addCustomer(String customerName) {
        if (checkIfCostumerExists(customerName)) {
            System.out.println("Customer already exists.");
        } else {
            Customer customer = new Customer(customerName);
            customers.add(customer);
            System.out.println("Customer added.");
        }
    }

    public void addCustomer(Customer customer) {
        if (checkIfCostumerExists(customer)) {
            System.out.println("Customer already exists.");
        } else {
            customers.add(customer);
            System.out.println("Customer added.");
        }
    }

    public void addCustomerAlphabetically(String customerName) {
       if (checkIfCostumerExists(customerName)){
           System.out.println("kkk");
       } else {
           ListIterator<Customer> customerListIterator = getCustomers().listIterator();
           while (customerListIterator.hasNext()){
               Customer customer = new Customer(customerName);

           }
       }
    }

    public Customer getCustomer(String customerName) {
        if (getCustomerPosition(customerName) == -1) {
            return null;
        }
        return customers.get(getCustomerPosition(customerName));
    }

    public void removeCustomer(String customerName) {
        if (checkIfCostumerExists(customerName)) {
            customers.remove(getCustomer(customerName));
            System.out.println("Customer removed.");
        } else {
            System.out.println("Customer does not exists. Removal failed.");
        }
    }

    public void removeCustomer(Customer customer) {
        if (checkIfCostumerExists(customer)) {
            customers.remove(customer);
            System.out.println("Customer removed.");
        } else {
            System.out.println("Customer does not exists. Removal failed.");
        }
    }

    public void printCustomers() {
        if (getTotalNumberOfCustomers() > 0) {
            for (Customer customer : customers) {
                customer.printCustomerInfo();
            }
        } else {
            System.out.println("There are currently no customers in the database.");
        }
    }
}
