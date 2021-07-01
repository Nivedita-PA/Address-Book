package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {

    public enum IOService{
        FILE_IO, DB_IO;
    }

    public List<Contacts> contactsList;

    public AddressBookService(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    public AddressBookService() {
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Contacts> contactsList = new ArrayList<>();
        AddressBookService addressBook = new AddressBookService(contactsList);
        Scanner consoleInputReader = new Scanner(System.in);
        addressBook.readAddressBook(consoleInputReader);
        addressBook.writeAddressBook(IOService.FILE_IO);
        addressBook.printData(IOService.FILE_IO);
        addressBook.writeAddressBook(IOService.FILE_IO);
        addressBook.countEntries(IOService.FILE_IO);
        addressBook.readEmployeePayrollData(IOService.FILE_IO);
    }

    public List<Contacts> readAddressBook(IOService ioService) {
        if(ioService.equals(IOService.DB_IO))
            this.contactsList = new AddressBookDB().readData();
        return this.contactsList;
    }


    public void readAddressBook(Scanner consoleInputReader) {
        int i;
        System.out.println("Enter number of contact entries:");
        int times = consoleInputReader.nextInt();
        for(i=1; i<=times; i++) {
            System.out.println("To enter new contacts:");
            System.out.println("Enter first name: ");
            String firstName = consoleInputReader.next();
            System.out.println("Enter last name: ");
            String lastName = consoleInputReader.next();
            System.out.println("Enter address: ");
            String address = consoleInputReader.next();
            System.out.println("Enter city: ");
            String city = consoleInputReader.next();
            System.out.println("Enter state: ");
            String state = consoleInputReader.next();
            System.out.println("Enter zip code: ");
            String zipcode = consoleInputReader.next();
            System.out.println("Enter phone number: ");
            String phoneNumber = consoleInputReader.next();
            System.out.println("Enter email: ");
            String email = consoleInputReader.next();
            contactsList.add(new Contacts(firstName, lastName, address, city, state, zipcode, phoneNumber, email));
        }
    }

    public long readEmployeePayrollData(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            this.contactsList = new AddressBookFileIO().readData();
        return contactsList.size();
    }

    public void writeAddressBook(IOService ioService) throws IOException {
         if(ioService.equals(IOService.FILE_IO))
            new AddressBookFileIO().writeData(contactsList);
    }

    public void printData(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new AddressBookFileIO().printData();

    }

    public long countEntries(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            return new AddressBookFileIO().countEntries();
        return 0;
    }

}



