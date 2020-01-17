import java.util.Scanner;

public class TestAccount {

    private static int id;
    private static int choice = 0;

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++){
            accounts[i] = new Account(i, 100);
        }
        Scanner in = new Scanner(System.in);

        while (true){
            if (choice == 4 || choice == 0) {
                System.out.println("Enter an ID: ");
                id = in.nextInt();
                if (id < 0 || id > 9) {
                    System.out.println("Please enter a valid ID: ");
                    id = in.nextInt();
                }
            }
            System.out.println("Main Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.println("Enter a choice: ");
            choice = in.nextInt();
            if (choice < 0  || choice > 4){
                System.out.println("Please enter a valid choice: ");
                choice = in.nextInt();
            }
            if (choice == 1) {
                System.out.println("The balance is: " + accounts[id].getBalance());
            } else if (choice == 2) {
                System.out.println("Enter an amount to withdraw: ");
                double withdrawAmount = in.nextDouble();
                accounts[id].withdraw(withdrawAmount);
            } else if (choice == 3) {
                System.out.println("Enter an amount to deposit");
                double depositAmount = in.nextDouble();
                accounts[id].deposit(depositAmount);
            } else {
                System.out.println("Please enter a valid choice: ");
                choice = in.nextInt();
            }
        }
    }
}
