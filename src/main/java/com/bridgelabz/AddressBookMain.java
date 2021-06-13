package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //welcome
        System.out.println("Welcome to the AddressBook program");
        //1st address book
        ArrayList<Contacts> contactList = new ArrayList<>();

        boolean loop = true;
        while (loop) {
            ContactListmethods method = new ContactListmethods();
            //Contacts contact = new Contacts();
            System.out.println("Mention 1. To enter new contact: //2.  To" +
                    " Stop:");
            System.out.println("Continue..");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    int i;
                    System.out.println("Enter number of contacts you want to add:");
                    int times = sc.nextInt();
                    for (i = 1; i <= times; i++) {
                        method.toaddNew(contactList);
                    }
                    break;
                case 2: loop = false;
                    break;
            }
        }
    }
}
