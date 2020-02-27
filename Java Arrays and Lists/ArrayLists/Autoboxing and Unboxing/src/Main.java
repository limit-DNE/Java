public class Main {

    public static void main(String[] args) {

        Bank ing = new Bank("ING");

        ing.addBranch(new Branch("Amsterdam Branch"));
        ing.addBranch(new Branch("Istanbul Branch"));

        ing.addCustomerToBranch("Amsterdam Branch", "Alex Turner", 400);
        ing.addCustomerToBranch("Amsterdam Branch", "Kate Austen", 10000);
        ing.addCustomerToBranch("Istanbul Branch", "Sevil Yilmaz", 840);
        ing.addCustomerToBranch("Istanbul Branch", "Mehmet Durmaz", 55002);

        ing.printBranches();
        ing.printCustomers("Amsterdam Branch");
        ing.printCustomers("Istanbul Branch");

        ing.findBranch("Amsterdam Branch");
        ing.printCustomers("Dublin Branch");
    }
}
