public class Main {

    public static void main(String[] args) {

        CustomerBook customerBook = new CustomerBook();
        
        customerBook.addCustomer("Alex Turner");
        customerBook.addCustomer("Kate Austen");
        customerBook.addCustomer("Brian Molko");

        customerBook.printCustomers();

        customerBook.removeCustomer("Kate Austen");
        customerBook.printCustomers();
        customerBook.removeCustomer("Kate Austen");

        customerBook.addCustomer("Micheal Paraday");
        customerBook.printCustomers();

    }
}
