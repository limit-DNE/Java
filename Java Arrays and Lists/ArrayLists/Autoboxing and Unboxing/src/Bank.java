import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean checkIfBranchExists(Branch branch){
        if (branches.contains(branch)){
            return true;
        } else {
            return false;
        }
    }

    public void addBranch(Branch branch){
        if (checkIfBranchExists(branch)){
            System.out.println("This branch already exists.");
        } else {
            branches.add(branch);
        }
    }

    public void addBranch(String branchName){
        Branch branch = new Branch(branchName);
        addBranch(branch);
    }

    public void addCustomerToBranch(Branch branch, String customerName, double customerAmount){
        if (checkIfBranchExists(branch)){
            Customer customer = new Customer(customerName, customerAmount);
            branch.addCustomer(customer);
        } else {
            System.out.println("Specified branch does not exist.");
        }
    }

    public void addCustomerToBranch(String branchName, String customerName, double customerAmount){
        Branch branch = checkBranchByName(branchName);
        Customer customer = new Customer(customerName, customerAmount);
        branch.addCustomer(customer);
    }

    public Branch checkBranchByName(String branchName){
        if (getTotalNumberOfBranches() > 0){
            for (int i = 0; i < getTotalNumberOfBranches(); i++){
                if (branches.get(i).getBranchName().equalsIgnoreCase(branchName)){
                    return branches.get(i);
                }
            }
        }
        return new Branch(branchName);
    }

    public int getTotalNumberOfBranches(){
        return branches.size();
    }

    public void createNewCustomer(String branchName, String customerName, double customerAmount){
        Branch branch = checkBranchByName(branchName);
        Customer customer = new Customer(customerName, customerAmount);
        branch.addCustomer(customer);
        addBranch(branch);
    }

    public int getBranchPosition(String branchName){
        if (getTotalNumberOfBranches() > 0){
            for (int i = 0; i < getTotalNumberOfBranches(); i++){
                Branch branch = branches.get(i);
                if (branch.getBranchName().equalsIgnoreCase(branchName)){
                    return branches.indexOf(branch);
                }
            }
        }
        return -1;
    }

    public void findBranch(String branchName){
        if (getBranchPosition(branchName) == -1){
            System.out.println("Cannot find requested branch.");
        } else {
            System.out.println("Branch Found: "+ branches.get(getBranchPosition(branchName)).getBranchName() + "\nPosition: " + getBranchPosition(branchName));
        }
    }

    public void printBranches(){
        if (getTotalNumberOfBranches() > 0){
            System.out.println("Branches");
            for (Branch branch : branches) {
                System.out.println(branch.getBranchName());
            }
        }
    }

    public void printCustomers(String branchName){
        if (getBranchPosition(branchName) == -1){
            System.out.println("Branch does not exist.");
        } else {
            Branch branch = checkBranchByName(branchName);
            System.out.println("Costumers");
            for (Customer customer : branch.getCustomers()) {
                System.out.println(customer.getName());
            }
        }
    }
}
