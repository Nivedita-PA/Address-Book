package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactListmethods {


    Scanner sc = new Scanner(System.in);

    //method for adding contacts to the list
     public void toaddNew(ArrayList<Contacts> contactList){

         Contacts contacts = new Contacts();

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
            contactList.add(contacts);
        }

}

