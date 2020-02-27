import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static ContactList contactList = new ContactList();

    public static void main(String[] args) {
        displayOptions();
    }

    public static void displayOptions(){
        System.out.println("Welcome to Mobile Phone Book");
        System.out.println("1. Create New Contact");
        System.out.println("2. Print Contacts");
        System.out.println("3. Find Contact");
        System.out.println("4. Search Contacts");
        System.out.println("5. Update Contact");
        System.out.println("6. Remove Contact");
        System.out.println("7. Exit");
        System.out.println("Please enter your selection: ");
        int selection = in.nextInt();
        in.nextLine();
        if (checkSelection(selection) && selection != 7){
            switch (selection){
                case 1:
                    selectionCreateContact();
                    break;
                case 2:
                    selectionPrintContacts();
                    break;
                case 3:
                    selectionFindContact();
                    break;
                case 4:
                    selectionSearchContacts();
                    break;
                case 5:
                    selectionUpdateContact();
                    break;
                case 6:
                    selectionRemoveContact();
                    break;
                default:
                    System.out.println("Incorrect selection. Please try again.");
                    displayOptions();
                    break;
            }

        } else if (!checkSelection(selection) && selection != 7){
            System.out.println("Incorrect selection. Please try again.");
            displayOptions();
        } else if (selection == 7){
            quit();
        }
    }

    public static boolean checkSelection(int selection){
        if (selection >= 1 && selection <= 6){
            return true;
        } else {
            return false;
        }
    }

    public static void selectionCreateContact() {
        System.out.println("Please enter the name of the contact: ");
        String name = in.nextLine();
        System.out.println("Please enter the phone number: ");
        int number = in.nextInt();
        in.nextLine();
        Contact contact = new Contact(name, number);
        contactList.addContact(contact);
    }

    public static void selectionPrintContacts(){
        System.out.println("CONTACTS");
        contactList.printContacts();
    }

    public static void selectionFindContact(){
        System.out.println("FIND CONTACT");
        System.out.println("Please enter the contact name to be found: ");
        String name = in.nextLine();
        contactList.findContact(name);
    }

    public static void selectionSearchContacts(){
        System.out.println("SEARCH CONTACTS");
        System.out.println("Please enter the contact name to search: ");
        String name = in.nextLine();
        contactList.searchContact(name);
    }

    public static void selectionUpdateContact(){
        System.out.println("UPDATE CONTACT");
        System.out.println("Please enter contact name to be updated: ");
        String name = in.nextLine();
        if (contactList.checkIfContactExists(name)){
            System.out.println("Please enter the new name: ");
            String newName = in.nextLine();
            System.out.println("Please enter the new number: ");
            int newNumber = in.nextInt();
            in.nextLine();
            contactList.updateContactInfo(name, newName, newNumber);
        } else {
            System.out.println("Could not find the contact name in the list. Please try again.");
            selectionUpdateContact();
        }
    }

    public static void selectionRemoveContact(){
        System.out.println("REMOVE CONTACT");
        System.out.println("Please enter contact name to be removed: ");
        String name = in.nextLine();
        contactList.removeContact(name);
    }

    public static void quit(){
        System.out.println("Thank you for using Mobile Phone Book");
        contactList.printTotalNumberOfContacts();
        in.close();
    }
}
