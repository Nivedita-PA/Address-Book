package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class AddressBookMethods {

    Scanner sc = new Scanner(System.in);

    ArrayList<Contacts> contactList1 = new ArrayList<>();

    //Adding contact-list to hash maps
    HashMap<String,ArrayList<Contacts>> addressBook = new HashMap();


    //method for adding contact-list to the addressBook
    public void addingAddressBook(HashMap<String,ArrayList<Contacts>> addressBook){
        System.out.println("Mention the name of the address-book, don't repeat");
        String addnames = sc.nextLine();
        addressBook.put(addnames,contactList1);
    }

    public void displayAddressBook(HashMap<String,ArrayList<Contacts>> addressBook){
        Set<String> contactlist = addressBook.keySet();
        for(String addnames : contactlist){
            System.out.println(addnames + ":" + addressBook.get(addnames));
        }

    }

    //Displaying add-book
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
                    sc.nextLine();
                    if (addressBook.containsKey(name)) {
                        int i;
                        System.out.println("Mention No. of contacts you want to add:");
                        int times1 = sc.nextInt();
                        for (i = 1; i <= times1; i++) {
                            method.toaddNew(contactList1);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the address-book for editing contact:");
                    String name1 = sc.nextLine();
                    if (addressBook.containsKey(name1)) {
                        method.toeditContact(contactList1);
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the address-book for deleting contact:");
                    String name2 = sc.nextLine();
                    if(addressBook.containsKey(name2)) {
                        method.delete(contactList1);
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

