package com.bridgelabz;

public class ExecutionAddBook {

    public static void main(String[] args) {

        //welcome
        System.out.println("--------------Welcome to the AddressBookService program----------------");
        System.out.println("                                                                  ");
        AddressBookMethods main = new AddressBookMethods();
        try {
            main.displayAddressBookOptions();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
