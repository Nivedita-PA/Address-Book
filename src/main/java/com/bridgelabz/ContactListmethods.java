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

   //Edit contact through console
   public void toeditContact(ArrayList<Contacts> contactList) {

      System.out.println("To edit contact enter the first name of the contact");
      for (Contacts list : contactList) {
         if (sc.next().equals(list.getFirstName())) {
            System.out.println("Continue editing...");
            System.out.println("Enter first name: ");
            String firstName = sc.nextLine();
            list.setFirstName(firstName);
            sc.nextLine();
            System.out.println("Enter last name: ");
            String lastName = sc.nextLine();
            list.setLastName(lastName);
            System.out.println("Enter address: ");
            String address = sc.nextLine();
            list.setAddress(address);
            System.out.println("Enter city: ");
            String city = sc.nextLine();
            list.setCity(city);
            System.out.println("Enter state: ");
            String state = sc.nextLine();
            list.setState(state);
            System.out.println("Enter zip code: ");
            String zipcode = sc.nextLine();
            list.setZipCode(zipcode);
            System.out.println("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            list.setPhoneNumber(phoneNumber);
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            list.setEmail(email);

            //printing result
            System.out.println("Contact edited: " + "\n" + list);
         }
      }
      System.out.println("Invalid");
   }

}

