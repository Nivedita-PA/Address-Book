package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMethods {

    Scanner sc = new Scanner(System.in);
    HashMap<String,ArrayList<Contacts>> addressBook = new HashMap();

    //method for adding contact-list to the addressBook
    public void addingAddressBook(HashMap<String, ArrayList<Contacts>> addressBook) {
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

    public void toCheckDuplicate(String addressBookName){
        System.out.println("Enter person name:");
        sc.nextLine();
        String name = sc.nextLine();
        List<Contacts> contactsList = addressBook.get(addressBookName);
        List<Contacts> searchContact = contactsList.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        System.out.println(searchContact);
    }

    public void sortByName(String addressBookName){
        List<Contacts> contactsList = addressBook.get(addressBookName);
        if(contactsList.size() < 1){
            System.out.println("NO RECORDS FOUND!");
        }else{
            contactsList.sort(new SortingFirstName());
            contactsList.forEach(System.out::println);
        }
    }

    public void toFindByCity(String addressBookName){
        System.out.println("Enter city name: ");
        sc.nextLine();
        String city = sc.nextLine();
        List<Contacts> contactsList = addressBook.get(addressBookName);
        List<Contacts> searchContact = contactsList.stream()
                .filter(person -> person.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        System.out.println(searchContact);
    }

    public void toViewPersonByState(String addressBookName){
        System.out.println("Enter state name: ");
        sc.nextLine();
        String state = sc.nextLine();
        List<Contacts> contactsList = addressBook.get(addressBookName);
        List<Contacts> sortContact = contactsList.stream()
                .filter(person -> person.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
        System.out.println(sortContact);
    }

    public void toSeeNoOfContactsByState(String addressBookName){
        System.out.println("Enter state name: ");
        sc.nextLine();
        String stateName = sc.nextLine();
        List<Contacts> contactsList = addressBook.get(addressBookName);
        Long count = contactsList.stream().filter(person -> person.getState().equalsIgnoreCase(stateName))
                .count();
        System.out.println(count);
    }

    public void toSeeNoOfContactsByCity(String addressBookName){
        System.out.println("Enter city name: ");
        sc.nextLine();
        String cityName = sc.nextLine();
        List<Contacts> contactsList = addressBook.get(addressBookName);
        Long count = contactsList.stream().filter(person -> person.getState().equalsIgnoreCase(cityName))
                .count();
        System.out.println(count);
    }

    public void sortByCity(String addressBookName) {
        List<Contacts> contactsList = addressBook.get(addressBookName);
        contactsList.forEach(System.out::println);
        if (contactsList.size() < 1) {
            System.out.println("NO RECORDS FOUND!");
        } else {
            contactsList.sort(new SortingCity());
            contactsList.forEach(System.out::println);
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
                    " 6. To sort by names in Address-Book: " + "\n" +
                    " 7. To search duplicate names in Address-Book: " + "\n" +
                    " 8. To search by city in Address-Book: " + "\n" +
                    " 9. To search by state in Address-Book: " + "\n" +
                    "10. To count by state in Address-Book: " + "\n" +
                    "10. To count by city in Address-Book: " + "\n" +
                    "11. To sort by city in Address-Book: " + "\n" +
                    "12. To Stop:");
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
                    System.out.println("Enter address-book to sort:");
                    String addName = sc.next();
                    sortByName(addName);
                    break;

                case 7:
                    System.out.println("Enter address-book to check-duplicate:");
                    String addName1 = sc.next();
                    toCheckDuplicate(addName1);
                    break;

                case 8:
                    System.out.println("Enter address-book to search person by city:");
                    String addName2 = sc.next();
                    toFindByCity(addName2);
                    break;

                case 9:
                    System.out.println("Enter address-book to search person by state:");
                    String addName3 = sc.next();
                    toViewPersonByState(addName3);
                    break;

                case 10:
                    System.out.println("Enter address-book to count person by state:");
                    String addName4 = sc.next();
                    toSeeNoOfContactsByState(addName4);
                    break;

                case 11:
                    System.out.println("Enter address-book to count person by city:");
                    String addName5 = sc.next();
                    toSeeNoOfContactsByCity(addName5);
                    break;

                case 12:
                    System.out.println("Enter address-book to sort person by city:");
                    String addName6 = sc.next();
                    sortByCity(addName6);
                    break;

                case 13:
                    loop = false;
                    break;
            }
        }
    }
}

