package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class AddressBookMethods {

    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactList = new ArrayList<>();
    HashMap<String,ArrayList<Contacts>> addressBook = new HashMap();

    //method for adding contact-list to the addressBook1
    public void addingAddressBook(HashMap<String, ArrayList<Contacts>> addressBook1) {
        sc.nextLine();
        System.out.println("Mention the name of the address-book, don't repeat");
        String addNames = sc.nextLine();
        ArrayList<Contacts> contactList = new ArrayList<>();
            addressBook.put(addNames, contactList);

    }

    public void displayAddressBook(HashMap<String, ArrayList<Contacts>> addressBook){
        Set<String> contactList = addressBook.keySet();
        for(String addNames : contactList){
            System.out.println(addNames + ":" + addressBook.get(addNames));
        }

    }

    public void displayAddressBookOptions(){
        boolean loop = true;
        while(loop) {
            ContactListmethods method = new ContactListmethods();
            System.out.println("Mention " + "\n" +
                    " 1. To add new address-book: " + "\n" +
                    " 2. Select address-book you want to fill: " + "\n" +
                    " 3. To Edit Contact in address-book: " + "\n" +
                    " 4. To Delete Contact in address-book: " + "\n" +
                    " 5. To display Address-Book: " + "\n" +
                    " 6. To Stop:");
            System.out.println("Continue..");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int j;
                    System.out.println("Enter the number of address books you want to add:");
                    int times = sc.nextInt();
                    for (j = 1; j <= times; j++) {
                        addingAddressBook(addressBook);
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of the address-book for adding contacts:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    if(addressBook.containsKey(name)) {
                        int i;
                        System.out.println("Mention No. of contacts you want to add:");
                        int times1 = sc.nextInt();
                        for (i = 1; i <= times1; i++) {
                        Contacts contact = method.toaddNew();
                            ArrayList<Contacts> contacts = addressBook.get(name);
                            contacts.add(contact);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the address-book for editing contact:");
                    sc.nextLine();
                    String name1 = sc.nextLine();
                    if (addressBook.containsKey(name1)) {
                        System.out.println("To edit contact enter the first name of the contact");
                        String contactName = sc.next();
                        ArrayList<Contacts> contactList = addressBook.get(name1);
                        Contacts contacts1 =
                                contactList.stream().filter(contact -> contact.getFirstName().equals(contactName)).findFirst().get();
                        contacts1 = method.toeditContact(contacts1);
                    }else{
                        System.out.println("RECORD NOT FOUND!");
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the address-book for deleting contact:");
                    sc.nextLine();
                    String name2 = sc.nextLine();
                    System.out.println("To delete contact enter the first name of the contact");
                    String contactName = sc.next();
                    if(addressBook.containsKey(name2)) {
                        ArrayList<Contacts> contactList = addressBook.get(name2);
                        Contacts contacts1 =
                                contactList.stream().filter(contact -> contact.getFirstName().equals(contactName)).findFirst().get();
                        contactList.remove(contacts1);
                        System.out.println("DELETED!");
                    }else{
                        System.out.println("RECORD NOT FOUND!");
                    }
                    break;

                case 5: displayAddressBook(addressBook);
                    break;

                case 6:
                    loop = false;
                    break;
            }

        }

    }

}

