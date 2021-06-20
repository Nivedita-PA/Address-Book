package com.bridgelabz;

import java.util.Scanner;

public class ContactListmethods<contacts> {

    Contacts contacts;
    Scanner sc = new Scanner(System.in);

    //method for adding contacts to the list
    public Contacts toaddNew() {

        contacts = new Contacts();
        System.out.println("To enter new contacts:");
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        contacts.setFirstName(firstName);
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        contacts.setLastName(lastName);
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        contacts.setAddress(address);
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        contacts.setCity(city);
        System.out.println("Enter state: ");
        String state = sc.nextLine();
        contacts.setState(state);
        System.out.println("Enter zip code: ");
        String zipcode = sc.nextLine();
        contacts.setZipCode(zipcode);
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        contacts.setPhoneNumber(phoneNumber);
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        contacts.setEmail(email);

        //saving to the list one by one
        System.out.println("Saved new contacts: " + contacts);
        return contacts;
    }

    //Edit contact through console
    public Contacts toeditContact(Contacts contacts) {

        this.contacts = new Contacts();
        System.out.println("Continue editing...");
        System.out.println("Enter first name: ");
        sc.nextLine();
        String firstName = sc.nextLine();
        this.contacts.setFirstName(firstName);
        sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        this.contacts.setLastName(lastName);
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        this.contacts.setAddress(address);
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        this.contacts.setCity(city);
        System.out.println("Enter state: ");
        String state = sc.nextLine();
        this.contacts.setState(state);
        System.out.println("Enter zip code: ");
        String zipcode = sc.nextLine();
        this.contacts.setZipCode(zipcode);
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        this.contacts.setPhoneNumber(phoneNumber);
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        this.contacts.setEmail(email);

        //printing result
        System.out.println("Contact edited: " + "\n" + this.contacts);
        return this.contacts;
       }
}



