import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public int getContactsSize(){
        return contacts.size();
    }

    public void printContacts(){
        if (getContactsSize() > 0){
            for (Contact contact : contacts) {
                System.out.println(contact.contactInfo());
            }
        } else {
            System.out.println("No contacts available in the list.");
        }
    }

    public void printTotalNumberOfContacts(){
        if (getContactsSize() > 0){
            System.out.println("Total Number of Contacts: " + getContactsSize());
        } else {
            System.out.println("Total Number of Contacts: 0");
        }
    }

    public void addContact(Contact contact){
        if (contacts.contains(contact)){
            System.out.println("This contact already exists.");
        } else {
            contacts.add(contact);
            System.out.println("Contact Added\n" + contact.contactInfo());
        }
    }

   public void removeContact(String contactName){
        if (checkContactByName(contactName) == -1){
            System.out.println("Could not remove contact: Contact does not exist.");
        } else {
            System.out.println("Removed contact " + contactName);
            contacts.remove(checkContactByName(contactName));
        }
   }

    public int checkContactByName(String contactName){
        for (int i = 0; i < getContactsSize(); i++){
            Contact contact = contacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)){
                return contacts.indexOf(contact);
            }
        }
        return -1;
    }

    public boolean checkIfContactExists(String contactName){
        for (int i = 0; i < getContactsSize(); i++){
            Contact contact = contacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)){
                return true;
            }
        }
        return false;
    }

    public void findContact(String contactName){
        if (checkContactByName(contactName) == -1){
            System.out.println("No contacts found for the given name.");
        } else {
            System.out.println("Found Contact\n" + contacts.get(checkContactByName(contactName)).contactInfo());
        }
    }

    public void searchContact(String contactName){
        if (checkContactByName(contactName) == -1){
            System.out.println("Search Completed. No contacts found.");
        } else {
            System.out.println("Search Completed\n" + contacts.get(checkContactByName(contactName)).contactInfo());
        }
    }

    public void updateContactInfo(String contactName, String newName, int newNumber){
        if (checkContactByName(contactName) == -1){
            System.out.println("No contacts found for the given name.");
        } else {
            System.out.print("Contact " + contacts.get(checkContactByName(contactName)).contactInfo());
            contacts.get(checkContactByName(contactName)).setName(newName);
            contacts.get(checkContactByName(contactName)).setNumber(newNumber);
            System.out.println(" Updated to: " + contacts.get(checkContactByName(contactName)).contactInfo());
        }
    }
}
