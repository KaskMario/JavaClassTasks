package main.phone;

import java.util.ArrayList;

// TODO
// 1.addNewContact
// 2.findContact
// 3.updateContact
// 4.printContacts
// 5.queryContact
// 6.removeContact


public class MobilePhone {

    private final String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact exist!");
            return false;
        }else {
            myContacts.add(contact);
            return true;
        }

    }


    private int findContact(String contactName) {

       for (int i = 0; i < myContacts.size(); i++){
           Contact temp = myContacts.get(i);
           if (temp.getName().equals(contactName) ){
               return i;
           }
       }

       return -1;

    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name "+ newContact.getName()+ " already exist");
            return false;
        }

        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+" was updated");
        return true;


    }

    public Contact queryContact(String name) {

        int position = findContact(name);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;

    }

    public boolean removeContact(Contact contact){

        int position = findContact(contact);
        if (position < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(position);
       // System.out.println(contact.getName() + " was deleted");
        return true;
    }
    public void printContacts(){
        if (!myContacts.isEmpty()) {
            System.out.println("Contact list");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.printf("%d. %s --> %s\n", (i + 1), myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
            }
        }
        else {
            System.out.println("Contact list is empty");
        }


    }
    public ArrayList<Contact> getContacts() {
        return myContacts;
    }












}
